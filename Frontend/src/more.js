import React from 'react';
import './more.css';
import { Link } from 'react-router-dom';

const MoreDet = () => {
  const pets = [
    {
      id: 1,
      name: 'Cherry',
      breed: 'Rag Doll',
      age: 2,
      // description: 'Cherry is a friendly and energetic Rag Doll, loves playing fetch and going for long walks.',
      image: 'cat1.jpg',
    },
    {
      id: 2,
      name: 'Blacky',
      breed: 'Tuxedo',
      age: 4,
      // description: 'Blacky is a beautiful cat with striking features. She enjoys lounging around and being petted.',
      image: 'tux.jpg',
    },
    {
      id: 3,
      name: 'Platy',
      breed: 'Bob Tail',
      age: 3,
      // description: 'Pussy is a beautiful Maine Coon cat with striking features. She enjoys lounging around and being petted.',
      image: 'kurilian.jpg',
    },
    {
      id: 4,
      name: 'Jackie',
      breed: 'Golden Retriever',
      age: 5,
      // description: 'Bella is a beautiful Maine Coon cat with striking features. She enjoys lounging around and being petted.',
      image: 'dog1.jpg',
    },
    {
      id: 5,
      name: 'Hairy Potter',
      breed: 'Shitzu',
      age: 2,
      // description: 'Bella is a beautiful Maine Coon cat with striking features. She enjoys lounging around and being petted.',
      image: 'fluffy.jpg',
    },
    {
      id: 6,
      name: 'Jefry',
      breed: 'Labrador Retriever',
      age: 1,
      // description: 'Bella is a beautiful Maine Coon cat with striking features. She enjoys lounging around and being petted.',
      image: 'lab.jpg',
    },
    
    {
      id: 7,
      name: 'Lusie',
      breed: 'Husky',
      age: 4,
      // description: 'Bella is a beautiful Maine Coon cat with striking features. She enjoys lounging around and being petted.',
      image: 'husky.jpg',
    },
    {
      id: 8,
      name: 'Puppy',
      breed: 'Pomerian',
      age: 3,
      // description: 'Bella is a beautiful Maine Coon cat with striking features. She enjoys lounging around and being petted.',
      image: 'pom.jpg',
    },
    {
      id: 9,
      name: 'Dom',
      breed: 'Graden',
      age: 7,
      // description: 'Bella is a beautiful Maine Coon cat with striking features. She enjoys lounging around and being petted.',
      image: 'graden.jpg',
    },
    {
      id: 10,
      name: 'Robin',
      breed: 'Lion Head',
      age: 1,
      // description: 'Bella is a beautiful Maine Coon cat with striking features. She enjoys lounging around and being petted.',
      image: 'lionhead.jpg',
    },
    {
      id: 11,
      name: 'Lopie',
      breed: 'English Lop',
      age: 2,
      // description: 'Bella is a beautiful Maine Coon cat with striking features. She enjoys lounging around and being petted.',
      image: 'lop.jpg',
    },
    {
      id: 12,
      name: 'Angolo',
      breed: 'Angora',
      age: 3,
      // description: 'Bella is a beautiful Maine Coon cat with striking features. She enjoys lounging around and being petted.',
      image: 'angora.jpg',
    },
    {
      id: 12,
      name: 'flemie',
      breed: 'Flemish',
      age: 5,
      // description: 'Bella is a beautiful Maine Coon cat with striking features. She enjoys lounging around and being petted.',
      image: 'femish.jpg',
    },
    {
      id: 13,
      name: 'Rosie',
      breed: 'Rosella',
      age: 2,
      // description: 'Bella is a beautiful Maine Coon cat with striking features. She enjoys lounging around and being petted.',
      image: 'rosella.jpg',
    },
    {
      id: 14,
      name: 'Eddy',
      breed: 'Eclectus',
      age: 3,
      // description: 'Bella is a beautiful Maine Coon cat with striking features. She enjoys lounging around and being petted.',
      image: 'eclectus.jpg',
    },
    {
      id: 15,
      name: 'Peggy',
      breed: 'Pegion',
      age: 2,
      // description: 'Bella is a beautiful Maine Coon cat with striking features. She enjoys lounging around and being petted.',
      image: 'peg.jpg',
    },
    {
      id: 16,
      name: 'Goldy',
      breed: 'Golden Pegion',
      age: 2,
      // description: 'Bella is a beautiful Maine Coon cat with striking features. She enjoys lounging around and being petted.',
      image: 'gol.jpg',
    },
  ];

  return (
    <div>
      <h1>Pet Adoption</h1>
      <div className="pet-list">
        {pets.map(pet => (
          <div key={pet.id} className="pet-card">
            <img src={pet.image} alt={pet.name} className="pet-image" />
            <h2>{pet.name}</h2>
            <p>Breed: {pet.breed}</p>
            <p>Age: {pet.age}</p>
            
              <Link to='/sub'>
                <button>Adopt</button>
              </Link>
         
          </div>
        ))}
      </div>
    </div>
  );
};


export default MoreDet;
