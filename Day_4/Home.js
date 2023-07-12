import React from 'react';
import './Home.css';
import { Link } from 'react-router-dom' 


const HomePage = () => {
  return (
    <div className="home-container">
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

            <nav>
                <Link to="/pet">
                    <button>View Available Pets</button>

                </Link>
            </nav>
          </div>
        </section>

        <section className="info-section">
          <div className="info-card">
            <nav>
            <p>Learn about our simple and caring adoption process.</p>
                        <h3>Adoption Process</h3>
                <Link to="/adp">
                
            <button>Learn More</button>
                </Link>
            </nav>
          </div>
          <div className="info-card">
            <h3>Volunteer Opportunities</h3>
            <p>Discover how you can make a difference by volunteering.</p>
            <Link to='/vol'>
            
                <button>Get Involved</button>
            </Link>
          </div>
          <div className="info-card">
            <h3>Donate</h3>
            <p>Support our mission by making a donation to help animals in need.</p>

            <nav>
                <Link to="/donate">
                    <button>Donate Now</button>

                </Link>
            </nav>
          </div>
        </section>

        
      </main>

      {/* <footer>
        <p>&copy; 2023 Pet Adoption Center. All rights reserved.</p>
      </footer> */}
    </div>
  );
};

export default HomePage;
