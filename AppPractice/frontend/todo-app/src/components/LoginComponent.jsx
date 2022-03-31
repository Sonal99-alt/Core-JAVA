import React, {Component} from 'react'

class LoginComponent extends Component {
    constructor(props) {
        super(props)
        this.state = {
            username: 'in28minutes',
            password: '',
            showSuccessMessage: false,
            hasLoginFailed: false
        }
        this.handleChange = this.handleChange.bind(this)
        this.loginClicked = this.loginClicked.bind(this)
    }

    handleChange(event) {
        this.setState({[event.target.name]: event.target.value})
    }

    loginClicked() {
        if(this.state.username==="in28minutes" && this.state.password==="dummy")
        {
            this.setState({showSuccessMessage: true})
            this.setState({hasLoginFailed: false})
        }
        else 
        {
            this.setState({hasLoginFailed: true})
            this.setState({showSuccessMessage: false})
        }
    }

    render() {
        return (
            <div className="container">
                {this.state.showSuccessMessage && <div>Login Successful</div>}
                {this.state.hasLoginFailed && <div className="alert alert-warning">Invalid Credentials</div>}
                Username: <input type="text" name="username" value={this.state.username} onChange={this.handleChange}/>
                Password: <input type="password" name="password" value={this.state.password} onChange={this.handleChange}/>
                <button className='btn btn' onClick={this.loginClicked}>Login</button>
            </div>
        )
    }
}
export default LoginComponent