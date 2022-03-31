import React, {Component} from 'react'
import LoginComponent from './LoginComponent'
import withNavigation from './WithNavigation'
import withParams from './WithParams'
import WelcomeComponent from './WelcomeComponent'
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom'
import ListTodosComponent from './ListTodosComponent'

class TodoApp extends Component {
    render() {
        const LoginComponentWithNavigation  = withNavigation(LoginComponent)
        const WelcomeComponentWithParams = withParams(WelcomeComponent)
        return (
            <div>
                <Router>
                    <Routes>
                        <Route path="/login" element={<LoginComponentWithNavigation/>}/>
                        <Route path="/" element={<LoginComponentWithNavigation/>}/>
                        <Route path="/welcome/:name" element={<WelcomeComponentWithParams/>}/>
                        <Route path="/todos" element={<ListTodosComponent/>}/>
                    </Routes>
                </Router>
            </div>
        )
    }
}
export default TodoApp