import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import axios from 'axios';

const FeedForm = () => {

const[formdata,setFormdata]= useState({
    email: '',
    name: '',
    subject: '',
    message: ''
   
  })
  const navigate = useNavigate();
  const handleChange = (e) => {
    e.preventDefault();
    setFormdata({ ...formdata, [e.target.id]: e.target.value })
    
  }
  const handleSubmit = async(e) => {
    e.preventDefault();
    
    axios
      .post('http://localhost:1234/addfed', formdata)
      .then((response) => {
        console.log(response);
        navigate("/staffhomepage")
      })
      .catch((error) => {
        console.log(error);
      });

    console.log(formdata);
  }
  
  
 
  return (
    <div className="down">
      <center>

      <div className="login-form">
        <h2>FEEDBACK</h2>
        <form onSubmit={handleSubmit} >
          <input
            type="email"
            placeholder="Email"
            id='email'
            onChange={handleChange}
            required
            />
          <input
            type="name"
            placeholder="Name"
            id='name'
            onChange={handleChange}
            required
            />
             <input
            type="name"
            placeholder="Subject"
            id='subject'
            onChange={handleChange}
            required
            />
            <input
            type="name"
            placeholder="Message"
            id='message'
            onChange={handleChange}
            required
            />
          <button type='submit' onChange={handleSubmit}>Submit</button>
          <div className="button">
         
          </div>
        </form>
      </div>
            </center>
    </div>

  );
};

export default FeedForm;