import React, { Component } from 'react'
import { BrowserRouter as Link } from 'react-router-dom'
import HelloWorldService from '../../api/todo/HelloWorldService'
class WelcomeComponent extends Component {

    constructor(props) {
        super(props)
        this.state = {
            welcomeMessage: '',
            errorMessage: ''
        }
        this.retrieveWelcomeMessage = this.retrieveWelcomeMessage.bind(this)
        this.handleSuccessfulResponse = this.handleSuccessfulResponse.bind(this)
        this.handleError = this.handleError.bind(this)
    }
    render() {
        return (
            <>
                <h1>Welcome!</h1>
                <div className="container">
                    Welcome {this.props.params.name}.
                    You can manage your todos <a href="/todos">here</a>.
                </div>
                <div className="container">
                    Click here to get a customized welcome message
                    <button onClick={this.retrieveWelcomeMessage} className="btn btn-success">Get Welcome message</button>
                </div>
                <div className="container">
                    {this.state.welcomeMessage}
                </div>
                <div className="container">
                    {this.state.errorMessage}
                </div>
            </>
        )
    }
    retrieveWelcomeMessage() {
        // HelloWorldService.executeHelloWorldBeanService()
        //     .then(response => this.handleSuccessfulResponse(response))

        HelloWorldService.executeHelloWorldPathVariableService(this.props.params.name)
            .then(response => this.handleSuccessfulResponse(response))
        
            .catch(error => this.handleError(error))
    }

    handleSuccessfulResponse(response) {
        this.setState({
            welcomeMessage: response.data.message
        })
    }

    handleError(error) {
        this.setState({
            errorMessage: error.response.data.message
        })
    }
}

export default WelcomeComponent