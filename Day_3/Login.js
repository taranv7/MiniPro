import React, { useState } from 'react';
import "./Login.css";
import { Link } from 'react-router-dom';


const LoginPage = () => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const handleEmailChange = (e) => {
    setEmail(e.target.value);
  };

  const handlePasswordChange = (e) => {
    setPassword(e.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    // Here you can perform login authentication with the provided email and password
    // For simplicity, let's just log the values to the console
    console.log('Email:', email);
    console.log('Password:', password);
  };

  return (
    <div className="login-container">
      <h1>Login</h1>
      <form onSubmit={handleSubmit}>
        <label htmlFor="email">Email:</label>
        <input
          type="email"
          id="email"
          value={email}
          onChange={handleEmailChange}
          required
        />

        <label htmlFor="password">Password:</label>
        <input
          type="password"
          id="password"
          value={password}
          onChange={handlePasswordChange}
          required
        />
        <nav>
            <Link to="home">
            <center>

                <button type="submit">Login</button>
            </center>
            </Link>
        </nav>
        <br />
      <a href=''>Forgot Password?</a> <br />

      <nav>
        <Link to="reg"> 
        
        <a href=''>Sign Up</a>
        
        </Link>
      </nav>
      </form>

    </div>
  );
};

export default LoginPage;
