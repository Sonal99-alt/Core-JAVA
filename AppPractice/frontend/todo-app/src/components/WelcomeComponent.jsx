import React, {Component} from 'react'

class WelcomeComponent extends Component {
    render() {
        return (
            <div>
                <h1>Welcome!</h1>
                <div className="container">
                    Welcome {this.props.params.name}. You can handle your todos <a href="/todos">here</a>
                </div>
            </div>
        )
    }
}
export default WelcomeComponent