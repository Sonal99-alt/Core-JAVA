import React, {Component} from 'react';
import AuthenticatedService from './AuthenticatedService'
import {Navigate} from 'react-router-dom'

class AuthenticationRoute extends Component {
    render() {
        if(AuthenticatedService.isUserLoggedIn()) {
            return {...this.props.children}
        }
        else return <Navigate to="/login"/>
    }
}
export default  AuthenticationRoute