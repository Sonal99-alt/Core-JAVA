import React, {Component} from 'react'
import AuthenticationService from './AuthenticationService'

class HeaderComponent extends Component {
    render() {
        const isUserLoggedIn = AuthenticationService.isUserLoggedIn();
        
        return (
            <header>
                <nav className="navbar navbar-expand-md navbar-dark bg-dark">
                    <div><a href="https://www.in28minutes.com" className="navbar-brand">in28minutes</a></div>
                    <ul className="navbar-nav">
                        {isUserLoggedIn && <li className="nav-link"><a href="/welcome/in28minutes" className="nav-link">Home</a></li>}
                        {isUserLoggedIn && <li className="nav-link"><a href="/todos"className="nav-link" >Todos</a></li>}
                    </ul>
                    <ul className="navbar-nav navbar-collapse justify-content-end">
                        {!isUserLoggedIn && <li className="nav-link"><a href="/login" className="nav-link">Login</a></li>}
                        {isUserLoggedIn && <li className="nav-link"><a href="/logout" className="nav-link" to onClick={AuthenticationService.logout}>Logout</a></li>}
                    </ul>
                </nav>
            </header>
        )
    }
}

export default HeaderComponent