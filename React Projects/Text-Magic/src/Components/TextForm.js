import React, { useState } from 'react'
import PropTypes from 'prop-types'



export default function TextForm(props) {

  const HandleUpClick = () => {
    let newText = text.toUpperCase();
    setText(newText)
    props.showAlert("Converted to Upper Case", "success");
  }

  const HandleDownClick = () => {
    let newText = text.toLowerCase();
    setText(newText)
    props.showAlert("Converted to Lower Case", "success");
  }

  const HandleOnChange = (event) => {
    setText(event.target.value)
  }

  const HandleFirstClick = () => {
    if (text == "Enter text here") {
      setText("")
    }
  }

  const HandleCopyClick = () => {
    var text = document.getElementById("myBox");
    text.select();
    navigator.clipboard.writeText(text.value);
    props.showAlert("Copied to Clipboard", "success");
  }

  const HandleExtraSpaceClick = () => {
    let newText = text.split(/[ ]+/);
    setText(newText.join(" "));
    props.showAlert("Removed extra spaces", "success");
  }

  const HandleCClick = () => {
    setText("")
    props.showAlert("Cleared Text", "success");
  }
  const [text, setText] = useState('Enter text here');

  return (
    <>


      <div className='container' style={{ color: props.mode === 'dark' ? 'white' : 'black' }}>

        <h1 className='my-3' >{props.heading}</h1>

        <div className="mb-3">

          <textarea className="form-control" value={text} onChange={HandleOnChange} onClick={HandleFirstClick} id="myBox" rows="8"
            style={{ backgroundColor: props.mode === 'dark' ? 'grey' : 'white' }} ></textarea>

        </div>

        <button type="button" className="btn btn-secondary" onClick={HandleUpClick}>Convert to Uppercase</button>
        <button type="button" className="btn btn-secondary mx-3" onClick={HandleDownClick}>Convert to Lowercase</button>
        <button type="button" className="btn btn-secondary" onClick={HandleCClick}>Clear</button>
        <button type="button" className="btn btn-secondary mx-3" onClick={HandleCopyClick}>Copy Text</button>
        <button type="button" className="btn btn-secondary" onClick={HandleExtraSpaceClick}>Remove Extra Spaces</button>

      </div>

      <div className='container my-3' style={{ color: props.mode === 'dark' ? 'white' : 'black' }}>
        <h1>Text Summary</h1>
        <p id="p1">{text.split(" ").length} words and {text.length} characters</p>
        <p id="p2"> {text.split(" ").length * 0.008} minutes read </p>
        <h2>Preview</h2>
        <p>{text.length > 0 ? text : "Enter something in the textbox to preview"}</p>
      </div>
    </>




  )
}

TextForm.propTypes = {
  heading: PropTypes.string.isRequired
}
TextForm.defaultProps = {
  heading: "Enter the text to analyze"
}