import React, { Component } from 'react';
import './App.css'; 

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 1,
      currencyAmount: '', 
      currencyType: ''    
    };
    
    this.handleIncrement = this.handleIncrement.bind(this);
    this.handleSayHelloAndStaticMessage = this.handleSayHelloAndStaticMessage.bind(this);
    this.sayWelcome = this.sayWelcome.bind(this);
    this.handleClickOnMe = this.handleClickOnMe.bind(this); 
    this.handleCurrencyAmountChange = this.handleCurrencyAmountChange.bind(this);
    this.handleCurrencyTypeChange = this.handleCurrencyTypeChange.bind(this);
    this.handleSubmitConversion = this.handleSubmitConversion.bind(this);
  }
  incrementCounterValue() {
    this.setState(prevState => ({
      counter: prevState.counter + 1
    }));
  }
  handleSayHelloAndStaticMessage() {
    alert("Hello! This is a static message from Increment.");
  }
  handleIncrement() {
    this.incrementCounterValue();       
    this.handleSayHelloAndStaticMessage(); 
  }
  handleDecrement = () => { 
    this.setState(prevState => ({
      counter: prevState.counter - 1
    }));
  };
  sayWelcome(greetingArgument) {
    alert(`Hello! ${greetingArgument}`); 
  }
  handleClickOnMe() {
    alert("I was clicked");
  }
  handleCurrencyAmountChange(event) {
    this.setState({ currencyAmount: event.target.value });
  }

  handleCurrencyTypeChange(event) {
    this.setState({ currencyType: event.target.value });
  }
  handleSubmitConversion(event) {
    event.preventDefault(); 
    const { currencyAmount, currencyType } = this.state;
    let conversionResult = '';
    const rupeeToEuroRate = 0.011; 
    const euroToRupeeRate = 90;   
    const amount = parseFloat(currencyAmount);
    if (isNaN(amount) || amount < 0) {
      conversionResult = "Please enter a valid positive amount.";
    } else if (currencyType.toUpperCase() === 'RUPEES' || currencyType.toUpperCase() === 'INR') {
      
      const convertedEuro = amount * rupeeToEuroRate;
      conversionResult = `Converting ${amount} Rupees to Euro Amount is ${convertedEuro.toFixed(2)}`;
    } else if (currencyType.toUpperCase() === 'EURO' || currencyType.toUpperCase() === 'EUR') {
      
      const convertedRupees = amount * euroToRupeeRate;
      conversionResult = `Converting ${amount} Euro to Rupees Amount is ${convertedRupees.toFixed(2)}`;
    } else {
      conversionResult = "Please enter a valid currency type (e.g., Rupees, INR, Euro, EUR).";
    }
    alert(conversionResult); 
  }

  render() {
    const { counter, currencyAmount, currencyType } = this.state;
    return (
      <div className="App" style={{ padding: '20px', textAlign: 'left' }}>
       
        <p style={{ fontSize: '2em', fontWeight: 'normal', marginBottom: '20px', marginTop: '0' }}>{counter}</p>

      
        <div style={{ marginBottom: '30px' }}>
         
          <button onClick={this.handleIncrement} style={buttonStyle}>
            Increment
          </button>
          <br/> 
          <button onClick={this.handleDecrement} style={buttonStyle}>
            Decrement
          </button>
          <br/>
          <button onClick={() => this.sayWelcome("Member1")} style={buttonStyle}>
            Say welcome
          </button>
          <br/>
          <button onClick={this.handleClickOnMe} style={buttonStyle}>
            Click on me
          </button>
        </div>

        <hr style={{ margin: '20px 0', borderTop: '1px solid #eee' }}/> 
        <div style={{ padding: '20px 0', maxWidth: '400px', margin: '20px 0' }}> 
         
          <h2 style={{ textAlign: 'left', color: 'green', marginBottom: '20px', marginTop: '0' }}>Currency Convertor!!!</h2>
        
          <form onSubmit={this.handleSubmitConversion}>
            <div style={{ marginBottom: '15px' }}>
              <label htmlFor="amount" style={{ display: 'block', marginBottom: '5px' }}>Amount:</label>
              <input
                type="number"
                id="amount"
                placeholder="Enter amount"
                value={currencyAmount}
                onChange={this.handleCurrencyAmountChange}
                style={inputStyle}
              />
            </div>
            <div style={{ marginBottom: '15px' }}>
              <label htmlFor="currency" style={{ display: 'block', marginBottom: '5px' }}>Currency:</label>
              <input
                type="text"
                id="currency"
                placeholder="e.g., Rupees, INR, Euro, EUR" 
                value={currencyType}
                onChange={this.handleCurrencyTypeChange}
                style={inputStyle}
              />
            </div>
      
            <div style={{ textAlign: 'center' }}> 
              <button type="submit" style={{ padding: '8px 15px', fontSize: '16px' }}>
                Submit
              </button>
            </div>
          </form>
        </div>
      </div>
    );
  }
}
const buttonStyle = {
  padding: '8px 15px', 
  fontSize: '16px',
};
const inputStyle = {
  width: 'calc(100% - 22px)',
  padding: '10px',
  fontSize: '16px',
  border: '1px solid #ccc',
  borderRadius: '4px',
};
export default App;