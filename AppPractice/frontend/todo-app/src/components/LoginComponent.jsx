import React, {Component} from 'react'

class LoginComponent extends Component {
    constructor(props) {
        super(props) 
        this.state = {
            username: 'in28minutes',
            password: ''
        }
    }

    render() {
        return (
            <div className="container">
                Username: <input type="text" name="username" value={this.state.username}></input>
                Password: <input type="password" name="password" value={this.state.password}></input>
                <button className='btn btn'>Login</button>
            </div>
        )
    }
}
export default LoginComponent