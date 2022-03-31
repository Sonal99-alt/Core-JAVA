import React, { Component } from 'react'
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom'
import withNavigation from './WithNavigation.jsx' 
import withParams from './withParams.jsx' 
import AuthenticatedRoute from './AuthenticatedRoute.jsx'
import LoginComponent from './LoginComponent.jsx'
import ListTodosComponent from './ListTodosComponent.jsx'
import HeaderComponent from './HeaderComponent.jsx'
import WelcomeComponent from './WelcomeComponent.jsx'
import FooterComponent from './FooterComponent'
import LogoutComponent from './LogoutComponent'
import ErrorComponent from './ErrorComponent.jsx'

class TodoApp extends Component {
    render() {
        const WelcomeComponentWithParams = withParams(WelcomeComponent)
        const LoginComponentWithNavigation = withNavigation(LoginComponent);
        return (
            <div className="TodoApp">
                <Router>
                        <HeaderComponent/>
                    <Routes>
                        <Route path="/" element={<LoginComponentWithNavigation />} />
                        <Route path="/login" element={<LoginComponentWithNavigation />} />
                        <Route path="/welcome/:name" element={<AuthenticatedRoute><WelcomeComponentWithParams/></AuthenticatedRoute>} />
                        <Route path="/todos" element={<AuthenticatedRoute><ListTodosComponent  /></AuthenticatedRoute>} />
                        <Route path="*" element={<ErrorComponent/>}/>
                        <Route path="/logout" element={<AuthenticatedRoute><LogoutComponent/></AuthenticatedRoute>}/>
                    </Routes>
                    <FooterComponent/>
                </Router>
            </div>
        )
    }
}

// function ShowCheck(props) {
//     if(props.hasLoginFailed) {
//         return <div>Invalid Credentials</div>
//     }
//     else if(props.showSuccessMessage) {
//         return <div>Login Successful</div>
//     }
//     return null
// }
export default TodoApp