import React from 'react';
import CohortDetails from './CohortDetails';
import './App.css';

function App() {
return (
<div className="outer-container">
<h2 className="main-title">Cohorts Details</h2>
  <div className="cohort-list">
    <CohortDetails
      name="INTADMDF10 - .NET FSD"
      started="22-Feb-2022"
      status="Scheduled"
      coach="Aathma"
      trainer="Jojo Jose"
    />
    <CohortDetails
      name="ADM21JF014 - Java FSD"
      started="10-Sep-2021"
      status="Ongoing"
      coach="Apoorv"
      trainer="Elisa Smith"
    />
    <CohortDetails
      name="CDBJF21025 - Java FSD"
      started="24-Dec-2021"
      status="Ongoing"
      coach="Aathma"
      trainer="John Doe"
    />
  </div>
</div>
);
}

export default App;