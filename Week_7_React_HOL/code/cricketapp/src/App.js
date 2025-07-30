import React from 'react';
import ListofPlayers from './ListofPlayers';
import IndianPlayers, { OddPlayers, EvenPlayers, ListofIndianPlayers } from './IndianPlayers'; 

function App() {
  const flag = false; 

  const IndianTeamData = ['Sachin1', 'Dhoni2', 'Virat3', 'Rohit4', 'Yuvraj5', 'Raina6'];

  const T20Players = ['Mr. First Player', 'Mr. Second Player', 'Mr. Third Player'];
  const RanjiTrophyPlayers = ['Mr. Fourth Player', 'Mr. Fifth Player', 'Mr. Sixth Player'];
  const mergedIndianPlayersApp = [...T20Players, ...RanjiTrophyPlayers];

  return (
    <div className="App">
      {flag ? ( 
        <div>
          <ListofPlayers /> 
        </div>
      ) : (
        <div>
          <h1>Indian Team</h1>
          <h2>Odd Players</h2>
        
          <OddPlayers
            first={IndianTeamData[0]}
            third={IndianTeamData[2]}
            fifth={IndianTeamData[4]}
          />
          <hr />
          <h2>Even Players</h2>
        
          <EvenPlayers
            second={IndianTeamData[1]}
            fourth={IndianTeamData[3]}
            sixth={IndianTeamData[5]}
          />
          <hr />
          <h1>List of Indian Players Merged:</h1>
         
          <ListofIndianPlayers IndianPlayers={mergedIndianPlayersApp} />
        </div>
      )}
    </div>
  );
}

export default App;