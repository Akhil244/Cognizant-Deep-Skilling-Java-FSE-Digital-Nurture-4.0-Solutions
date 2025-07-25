import React from 'react';
import './App.css';

function CalculateScore() {
  const name = "Steeve";
  const school = "DNV Public School";
  const total = 284;
  const goal = 300;
  const average = (total / goal) * 100;

  return (
    <div className="container">
      <h1 className="main-heading">Student Details:</h1>
      <p><span className="label name-label">Name:</span> <span className="value name-value">{name}</span></p>
      <p><span className="label school-label">School:</span> <span className="value school-value">{school}</span></p>
      <p><span className="label total-label">Total:</span> <span className="value total-value">{total}Marks</span></p>
      <p><span className="label score-label">Score:</span> <span className="value score-value">{average.toFixed(2)}%</span></p>
    </div>
  );
}

export default CalculateScore;
