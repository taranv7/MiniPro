import React from 'react';
import './Home.css';
import { Link } from 'react-router-dom' 
import { useSelector } from 'react-redux';
import Navbar from './navbar';


// import Navbar from './navbar';



const HomePage = () => {
  // const email = useSelector((state) => state.user.email);
  // const username = useSelector((state) => state.user);

  return (
    <div>
        <Navbar/>
    
    
     
    <div className="home-container">
    {/* <h1>Welcome, {email}!</h1> */}
      <header>
        <h1>Welcome to Pet Adoption Center</h1>
      </header>

      <main className='main'>
        <section className="hero-section">
          <div className="hero-image">
            
          </div>
          <div className="hero-content">
            <h2>Find Your Perfect Companion</h2>
            <p>Explore our selection of adorable pets waiting for a loving home.</p>

            
                <Link to="/pet">
                    <button>View Available Pets</button>

                </Link>
            
          </div>
        </section>

        <section className="info-section">
          <div className="info-card">
            
                        <h3>Adoption Process</h3>
            <p>Learn about our simple and caring adoption process.</p>
                <Link to="/adp">
                
            <button>Learn More</button>
                </Link>
           
          </div>
          <div className="info-card">
            <h3>FeedBack</h3>
            <p>Just spare a few minutes to help us!</p>
            <Link to='/vol'>
            
                <button>FeedBack Form</button>
            </Link>
          </div>
          <div className="info-card">
            <h3>Donate</h3>
            <p>Support our mission by making a donation to help animals in need.</p>

           
                <Link to="/donate">
                    <button>Donate Now</button>

                </Link>
            
          </div>
        </section>

        
      </main>
    </div>
    {/* <div style={{backgroundColor:'white'}}>

      <footer >
        <p>&copy; 2023 Pet Adoption Center. All rights reserved.</p>
      </footer>
    </div> */}
    </div>
  );
};

export default HomePage;
