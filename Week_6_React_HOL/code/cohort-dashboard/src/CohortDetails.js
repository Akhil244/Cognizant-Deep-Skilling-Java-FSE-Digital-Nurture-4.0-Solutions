import React from 'react';
import './App.css';

function CohortDetails(props) {
const colorStyle = {
color: props.status === 'Ongoing' ? 'green' : 'blue',
fontWeight: 'bold',
};

return (
<div className="box">
<h3 style={colorStyle}>{props.name}</h3>
<p><b>Started On</b><br />{props.started}</p>
<p><b>Current Status</b><br />{props.status}</p>
<p><b>Coach</b><br />{props.coach}</p>
<p><b>Trainer</b><br />{props.trainer}</p>
</div>
);
}
export default CohortDetails;