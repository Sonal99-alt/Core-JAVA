import React, {Component} from 'react'
import LoginComponent from './LoginComponent'
import withNavigation from './WithNavigation'
import withParams from './WithParams'
import WelcomeComponent from './WelcomeComponent'
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom'
import ListTodosComponent from './ListTodosComponent'
import ErrorComponent from './ErrorComponent'
import AuthenticationRoute from './AuthenticationRoute'
import LogoutComponent from './LogoutComponent'
import HeaderComponent from './HeaderComponent'
import FooterComponent from './FooterComponent'


class TodoApp extends Component {
    render() {
        const LoginComponentWithNavigation  = withNavigation(LoginComponent)
        const WelcomeComponentWithParams = withParams(WelcomeComponent)
        return (
            <div>
                <Router>
                    <HeaderComponent/>
                    <Routes>
                        <Route path="/login" element={<LoginComponentWithNavigation/>}/>
                        <Route path="/" element={<LoginComponentWithNavigation/>}/>
                        <Route path="/welcome/:name" element={<AuthenticationRoute><WelcomeComponentWithParams/></AuthenticationRoute>}/>
                        <Route path="/todos" element={<AuthenticationRoute><ListTodosComponent/></AuthenticationRoute>}/>
                        <Route path="/*" element={<ErrorComponent/>}/>
                        <Route path="/logout" element={<LogoutComponent/>}/>
                    </Routes>
                </Router>
                <FooterComponent/>
            </div>
        )
    }
}
export default TodoApp