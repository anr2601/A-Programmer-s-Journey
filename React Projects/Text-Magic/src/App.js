import './App.css';

import About from './Components/About';
import Navbar from './Components/Navbar';
import TextForm from './Components/TextForm';
import Alert from './Components/Alert';

import React, { useState } from 'react';

import {
  BrowserRouter as Router,
  HashRouter,
  Route,
  Routes
} from "react-router-dom";


export default function App() {

  const [mode, setMode] = useState('light');
  const [alert, setAlert] = useState(null);

  const showAlert = (message, type) => {
    setAlert({
      msg: message,
      type: type
    })
      setTimeout(() => {
        setAlert(null)
      }, 2000)
  }


  const toggleMode = () => {
    if (mode === 'light') {
      setMode('dark')
      document.body.style.backgroundColor = 'black'
      showAlert("Dark Mode enabled", "success");
    }
    else {
      setMode('light')
      document.body.style.backgroundColor = 'white'
      showAlert("Light Mode enabled", "success");
    }
  }

  return (
    <>
    <Router>
    <HashRouter basename="/">
      <Navbar title="Text Magic" mode={mode} toggleMode={toggleMode} />
      <Alert alert={alert} />
      <div className='container my-3'>
        <Routes>

          <Route path="/about" element={<About />}>
          </Route>
          <Route path="/" element={<TextForm showAlert={showAlert} mode={mode} />}> 
          </Route>
        
        </Routes>
        
      </div>
      </HashRouter>
    </Router>
    </>
  );
}
