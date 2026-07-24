import React from 'react';

// A single office object to display Name, Rent and Address
const office = {
    name: 'Skyline Business Center',
    rent: 55000,
    address: '12 MG Road, Bengaluru',
    image: 'https://via.placeholder.com/200x120?text=Office+Space'
};

// A list of office objects to loop through
const officeSpaces = [
    { name: 'Skyline Business Center', rent: 55000, address: '12 MG Road, Bengaluru' },
    { name: 'Tech Park Suites', rent: 72000, address: '45 Outer Ring Road, Bengaluru' },
    { name: 'Riverside Offices', rent: 48000, address: '9 Anna Salai, Chennai' },
    { name: 'Metro Corporate Hub', rent: 81000, address: '3 Marine Drive, Mumbai' },
    { name: 'Greenfield Workspace', rent: 39000, address: '21 Salt Lake, Kolkata' }
];

function App() {
    return (
        <div>
            {/* Element to display the heading of the page */}
            <h1>Office Space Rental</h1>

            {/* Attribute to display the image of the office space */}
            <img src={office.image} alt="Office space" width="200" height="120" />

            {/* Object to display Name, Rent and Address */}
            <h2>Featured Office</h2>
            <p>Name: {office.name}</p>
            <p style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
                Rent: {office.rent}
            </p>
            <p>Address: {office.address}</p>

            {/* List of office objects, looped to display more data */}
            <h2>All Office Spaces</h2>
            <ul>
                {officeSpaces.map((item, index) => (
                    <li key={index}>
                        <p>Name: {item.name}</p>
                        <p style={{ color: item.rent < 60000 ? 'red' : 'green' }}>
                            Rent: {item.rent}
                        </p>
                        <p>Address: {item.address}</p>
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default App;
