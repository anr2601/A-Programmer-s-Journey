import logo from './logo.svg';
import './App.css';

import React, { Component } from 'react'
import Navbar from './Components/Navbar';
import News from './Components/News';
import {
  BrowserRouter as Router,
  Switch,
  Route
} from 'react-router-dom'

export default class App extends Component {

  render() {
    return (
      <div>
        <Router>
          <Navbar />
          <Switch>
            <Route exact path="/"><News pageSize={5} country='in' category='general' /></Route>
            <Route exact path="/business"><News pageSize={5} country='in' category='business' /></Route>
            <Route exact path="/entertainment"><News pageSize={5} country='in' category='entertainment' /></Route>
            <Route exact path="/general"><News pageSize={5} country='in' category='general' /></Route>
            <Route exact path="/health"><News pageSize={5} country='in' category='health' /></Route>
            <Route exact path="/science"><News pageSize={5} country='in' category='science' /></Route>
            <Route exact path="/sports"><News pageSize={5} country='in' category='sports' /></Route>
            <Route exact path="/technology"><News pageSize={5} country='in' category='technology' /></Route>
          </Switch>



        </Router>

      </div>
    )
  }
}


