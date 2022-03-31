import React, {Component} from 'react'

class LoginComponent extends Component {
    

    render() {
        return (
            <div className="container">
                Username: <input type="text" name="username"></input>
                Password: <input type="password" name="password"></input>
                <button className='btn btn'>Login</button>
            </div>
        )
    }
}
export default LoginComponent