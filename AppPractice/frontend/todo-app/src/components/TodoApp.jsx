import React, {Component} from 'react'
import LoginComponent from './LoginComponent'
import withNavigation from './WithNavigation'
import withParams from './WithParams'
class TodoApp extends Component {
    render() {
        const WelcomeComponentWithParams = withParams(WelcomeComponent)
        return (
            <div>
                <LoginComponent/>
                <WelcomeComponentWithParams/>
            </div>
        )
    }
}
export default TodoApp