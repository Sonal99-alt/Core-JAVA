import React, {Component} from 'react'
import TodoDataService from '../../api/todo/TodoDataService.js'
import AuthenticationService from './AuthenticationService.js'
import moment from 'moment'
class ListTodosComponent extends Component {
    constructor(props) {
        super(props)
        this.state = {
             todos : [],
             message: null
        }
        this.deleteTodoClicked = this.deleteTodoClicked.bind(this)
        this.updateTodoClicked = this.updateTodoClicked.bind(this)
        this.refreshTodos = this.refreshTodos.bind(this)
        this.addTodoClicked = this.addTodoClicked.bind(this)
    }

    componentWillUnmount() {
        console.log('componentWillUnmount')
    }

    shouldComponentUpdate(nextProps, nextState) {
        console.log('shouldComponentUpdate')
        console.log(nextProps)
        console.log(nextState)
        return true
    }

    componentDidMount() {
        let username = AuthenticationService.getLoggedInUserName()
         this.refreshTodos()
    }

    refreshTodos() {
        let username = AuthenticationService.getLoggedInUserName()
            TodoDataService.retrieveAlltodos(username)

            .then(
                response => {
                    this.setState({todos: response.data})
                }
            )
    }
    deleteTodoClicked(id) {
        let username = AuthenticationService.getLoggedInUserName()
        TodoDataService.deletetodo(username, id)
        .then(
            response => {
                this.setState({message: `Delete of todo ${id} successful`})
                this.refreshTodos();
            }
        )
    }

    updateTodoClicked(id) {
        console.log('update ' + id)
        this.props.navigate(`/todos/${id}`)
    }

    addTodoClicked() {
        this.props.navigate(`/todos/-1`)
    }
    render() {
        return <div>
                    <h1>List Todos</h1>
                    {this.state.message && <div className="alert alert-success">{this.state.message}</div>}
                    <div className="container">
                    <table className="table">
                        <thead>
                            <tr>
                                <th>description</th>
                                <th>Is Completed?</th>
                                <th>Target Date</th>
                                <th>Delete</th>
                                <th>Update</th>
                            </tr>
                        </thead>
                        <tbody>
                            {
                                this.state.todos.map (
                                    todo =>          
                                 <tr key={todo.id}>
                                     <td>{todo.description}</td>
                                     <td>{todo.done.toString()}</td>
                                     <td>{moment(todo.targetDate).format('YYYY-MM-DD')}</td>
                                     <td><button className="btn btn-warning" onClick={() => this.deleteTodoClicked(todo.id)}>Delete</button></td>
                                     <td><button className="btn btn-success" onClick={() => this.updateTodoClicked(todo.id)}>Update</button></td>
                                 </tr>
                                 )
                             } 
                        </tbody>
                    </table>
                    <div className="row">
                             <button className="btn btn-success" onClick={this.addTodoClicked}>Add</button>
                    </div>
                    </div>
               </div>
    }
}

export default ListTodosComponent