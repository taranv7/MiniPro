import React from 'react';
import './pets.css';

function Pet() {
  return (
    <div className='com'>
      <h1>Welcome to Pet Adoption!</h1>
      <p>Find your perfect furry companion today.</p>

      <h2>Featured Pets</h2>
      <div className="featured-pets">
        {/* Display featured pets */}
        <div className="pet-card">
          <img src="cat1.jpg" alt="Cat" />
          <h3>Cherry</h3>
          <p>Age: 2 years</p>
          <p>Breed: Ragdoll</p>
        </div>
        <div className="pet-card">
          <img src="tux.jpg" alt="Cat" />
          <h3>Blacky</h3>
          <p>Age: 4 years</p>
          <p>Breed: Tuxedo</p>
        </div>
        <div className="pet-card">
          <img src="kurilian.jpg" alt="Cat" />
          <h3>Pussy</h3>
          <p>Age: 3 years</p>
          <p>Breed: Bob Tail</p>
        </div>
        <div className="pet-card">
          <img src="dog1.jpg" alt="Dog" />
          <h3>Jackie</h3>
          <p>Age: 5 years</p>
          <p>Breed: Golden Retriever</p>
        </div>
        <div className="pet-card">
          <img src="fluffy.jpg" alt="Dog" />
          <h3>Hairy potter</h3>
          <p>Age: 2 years</p>
          <p>Breed: Shitzu</p>
        </div>
      </div>
    <center>

      <button>View All Pets</button>
    </center>
    </div>
  );
}

export default Pet;