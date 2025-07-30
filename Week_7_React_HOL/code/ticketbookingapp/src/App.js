import React, { Component } from 'react';
import './App.css'; 

// UserGreeting Component: Displays "Welcome back"
function UserGreeting() {
  return <h1 style={{ textAlign: 'center', fontSize: '2.5em', margin: '0 0 20px 0' }}>Welcome back</h1>;
}

// GuestGreeting Component: Displays "Please sign up."
function GuestGreeting() {
  return <h1 style={{ textAlign: 'center', fontSize: '2.5em', margin: '0 0 20px 0' }}>Please sign up.</h1>;
}

// LoginButton Component
function LoginButton(props) {
  return (
    <button onClick={props.onClick} style={buttonStyle}>
      Login
    </button>
  );
}

// LogoutButton Component
function LogoutButton(props) {
  return (
    <button onClick={props.onClick} style={buttonStyle}>
      Logout
    </button>
  );
}
const buttonStyle = {
  padding: '10px 20px',
  fontSize: '18px',
  border: '1px solid #ccc',
  borderRadius: '4px',
  cursor: 'pointer',
  backgroundColor: '#f0f0f0',
  color: '#333',
  display: 'block', 
  margin: '20px auto', 
};


// Greeting Component: Conditionally renders UserGreeting or GuestGreeting
function Greeting(props) {
  const isLoggedIn = props.isLoggedIn;
  if (isLoggedIn) {
    return <UserGreeting />;
  }
  return <GuestGreeting />;
}
class App extends Component {
  constructor(props) {
    super(props);
    this.state = { isLoggedIn: false }; 
    this.handleLoginClick = this.handleLoginClick.bind(this);
    this.handleLogoutClick = this.handleLogoutClick.bind(this);
  }

  handleLoginClick() {
    this.setState({ isLoggedIn: true }); 
  }

  handleLogoutClick() {
    this.setState({ isLoggedIn: false }); 
  }

  render() {
    const isLoggedIn = this.state.isLoggedIn;
    let button;
    if (isLoggedIn) {
      button = <LogoutButton onClick={this.handleLogoutClick} />;
    } else {
      button = <LoginButton onClick={this.handleLoginClick} />;
    }

    return (
    
      <div style={{
        padding: '50px',
        fontFamily: 'Arial, sans-serif',
        minHeight: '100vh', 
        display: 'flex',
        flexDirection: 'column',
        justifyContent: 'center', 
        alignItems: 'center', 
      }}>
        <Greeting isLoggedIn={isLoggedIn} />
        {button}
      </div>
    );
  }
}

export default App;
