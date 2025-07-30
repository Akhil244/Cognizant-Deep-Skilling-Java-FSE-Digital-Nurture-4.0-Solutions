import React from 'react';
import './App.css';
import officeImage from './image.png'; 

function App() {
  const pageHeading = "Office Space";

  // Use the imported image variable
  const officeImageSrc = officeImage;

  const singleOffice = {
    name: "DBS",
    rent: 50000,
    address: "Chennai"
  };

  const officeList = [
    { id: 1, name: "Tech Park", rent: 75000, address: "Bangalore" },
    { id: 2, name: "Cyber City", rent: 45000, address: "Hyderabad" },
    { id: 3, name: "Global Towers", rent: 60000, address: "Pune" },
    { id: 4, name: "Innovate Hub", rent: 58000, address: "Delhi" }
  ];

  return (
    <div className="App">
      <h1>{pageHeading}, at Affordable Range</h1>

      <img
        src={officeImageSrc} 
        alt="Office Space"
        style={{ width: '100px', height: '100px', marginBottom: '20px' }}
      />

      <div>
        <h2>Name: {singleOffice.name}</h2>
        <h3 style={{ color: singleOffice.rent <= 60000 ? 'red' : 'green' }}>
          Rent: Rs. {singleOffice.rent}
        </h3>
        <h3>Address: {singleOffice.address}</h3>
      </div>

      <hr style={{ margin: '40px 0' }} />

      <h2>More Office Spaces:</h2>
      {officeList.map(office => (
        <div key={office.id} style={{ border: '1px solid #ccc', margin: '15px auto', padding: '10px', maxWidth: '500px' }}>
          <h3>Name: {office.name}</h3>
          <h4 style={{ color: office.rent <= 60000 ? 'red' : 'green' }}>
            Rent: Rs. {office.rent}
          </h4>
          <h4>Address: {office.address}</h4>
        </div>
      ))}
    </div>
  );
}

export default App;