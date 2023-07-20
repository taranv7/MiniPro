import React, { useState } from 'react';
import './vol.css';

function VolunteerPage() {
  const [volunteers, setVolunteers] = useState([]);
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [phone, setPhone] = useState('');

  const handleFormSubmit = (e) => {
    e.preventDefault();
    // Create a new volunteer object
    const newVolunteer = { name, email, phone };
    // Add the new volunteer to the volunteers array
    setVolunteers([...volunteers, newVolunteer]);
    // Reset the form fields
    setName('');
    setEmail('');
    setPhone('');
  };

  return (
    <div>
      <h1>Volunteer Page</h1>
      <form onSubmit={handleFormSubmit}>
        <label>
          Name:
          <input type="text" value={name} onChange={(e) => setName(e.target.value)} />
        </label>
        <br />
        <label>
          Email:
          <input type="email" value={email} onChange={(e) => setEmail(e.target.value)} />
        </label>
        <br />
        <label>
          Phone:
          <input type="text" value={phone} onChange={(e) => setPhone(e.target.value)} />
        </label>
        <br />
        <button type="submit">Submit</button>
      </form>

      <ul>
        {volunteers.map((volunteer, index) => (
          <li key={index}>
            Name: {volunteer.name}, Email: {volunteer.email}, Phone: {volunteer.phone}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default VolunteerPage;
