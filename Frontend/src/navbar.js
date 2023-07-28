import React from 'react';
import { Link } from 'react-router-dom';
import './appbar.css';

function Nb() {
  return (
    <div>
    <nav>
    <div style={{display:'flex',justifyContent:'space-between',marginLeft:'5px',color:'lightgray'}}>
      
    
    <nav>
    <Link to='/Hom'>
    <a href=''>Pet Adoption</a>
    </Link>
    </nav>
      <ul>
        <li>
          <Link to='/su'>
            SignUp
          </Link>
        </li>
        <li>
          <Link to="/tm">Team</Link>
        </li>

        
        <li>
          <Link to="/abt">About</Link>
        </li>
        

        <li>
          <Link to="/con">Contact</Link>
        </li>
      
        
        </ul>
      </div>
    </nav>
    </div>
  );
}

export default Nb;