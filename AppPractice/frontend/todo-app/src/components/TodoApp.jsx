import React, {Component} from 'react'
import LoginComponent from './LoginComponent'
import withNavigation from './WithNavigatiion'

class TodoApp extends Component {
    render() {
        return (
            <div>
                <LoginComponent/>
            </div>
        )
    }
}
export default TodoApp