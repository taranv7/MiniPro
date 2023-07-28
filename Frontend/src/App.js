import React from 'react';

// import LoginPage from './Login';
// import RegistrationPage from './Reg';
import './App.css';
// import HomePage from './Home';
import Pet from './pets';

// import PetsIcon from '@mui/icons-material/Pets';

import { Route, BrowserRouter, Routes } from 'react-router-dom'
import LoginPage from './Login';
import HomePage from './Home';
import RegistrationPage from './Reg';
import DonationPage from './Donation';
import AdoptionProcessPage from './adp';
// import VolunteerPage from './vol';
import MoreDet from './more';
import AboutPage from './About';
import TeamPage from './team';
import ContactPage from './contact';
import { Provider } from 'react-redux';
import Store from './store';
// import Store1 from './store1';
import FeedForm from './FeedForm';

const App = () => {
  return (
    <div>
      {/* <LoginPage/> */}
      {/* <RegistrationPage /> */}
      {/* <HomePage /> */}
      {/* <Pet /> */}
      {/* <DonationPage /> */}
      {/* <VolunteerPage /> */}
      {/* <AdoptionProcessPage/> */}
      {/* <MoreDet/> */}



      <BrowserRouter>
        <Provider store={Store}>
        




            <Routes>
              <Route path='/' element={<LoginPage />} />
              <Route path='/home' element={<HomePage />} />
              <Route path='/signup' element={<RegistrationPage />} />
              <Route path='/reg' element={<RegistrationPage />} />
              <Route path='/pet' element={<Pet />} />
              <Route path='/log' element={<LoginPage />} />
              <Route path='/adp' element={<AdoptionProcessPage />} />
              <Route path='/vol' element={<FeedForm />} />
              <Route path='/donate' element={<DonationPage />} />
              <Route path='/more' element={<MoreDet />} />
              <Route path='/abt' element={<AboutPage />} />
              <Route path='/tm' element={<TeamPage />} />
              <Route path='/con' element={<ContactPage />} />
              <Route path='/sub' element={<AdoptionProcessPage />} />
              <Route path='/su' element={<RegistrationPage />} />




            </Routes>

        </Provider>
        {/* </Provider> */}

      </BrowserRouter>



    </div>

  );
};

export default App;


// function App() {
//   return (
//     <div className="App">
//     </div>
//   );
// }

// export default App;
