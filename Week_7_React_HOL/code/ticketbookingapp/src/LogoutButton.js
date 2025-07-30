import React from 'react';

function LogoutButton(props) {
  return (
    <button onClick={props.onClick} style={buttonStyle}>
      Logout
    </button>
  );
}

// Common button style for consistency.
// Make it a block element and use margin: auto for horizontal centering.
const buttonStyle = {
  padding: '10px 20px',
  fontSize: '18px',
  border: '1px solid #ccc',
  borderRadius: '4px',
  cursor: 'pointer',
  backgroundColor: '#f0f0f0',
  color: '#333',
  display: 'block', // Make it a block element so it takes its own line
  margin: '20px auto', // Center horizontally and provide vertical spacing
};

export default LogoutButton;
