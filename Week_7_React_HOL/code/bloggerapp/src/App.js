import React, { useState } from 'react'; 
import './App.css'; 
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  
  const [showBookDetails, setShowBookDetails] = useState(true);
  const [showBlogDetails, setShowBlogDetails] = useState(true);
  const [showCourseDetails, setShowCourseDetails] = useState(true);

  return (
    <div className="App">
      <h1 style={{ textAlign: 'center', marginBottom: '40px' }}>Blogger App</h1> 
    
      <div style={{
        display: 'flex',
        justifyContent: 'center', 
        alignItems: 'flex-start', 
        gap: '20px', 
        flexWrap: 'wrap', 
        padding: '0 20px' 
      }}>
        {showCourseDetails && ( 
          <div className="column" style={columnStyle}>
            <h1 style={columnTitleStyle}>Course Details</h1>
            <CourseDetails />
          </div>
        )}

        {showBookDetails && ( 
          <div className="column" style={columnStyle}>
            <h1 style={columnTitleStyle}>Book Details</h1>
            <BookDetails />
          </div>
        )}

        {showBlogDetails && ( 
          <div className="column" style={columnStyle}>
            <h1 style={columnTitleStyle}>Blog Details</h1>
            <BlogDetails />
          </div>
        )}
      </div>
      <div style={{ textAlign: 'center', marginTop: '30px' }}>
        <button onClick={() => setShowBookDetails(!showBookDetails)} style={toggleButtonStyle}>Toggle Book Details</button>
        <button onClick={() => setShowBlogDetails(!showBlogDetails)} style={toggleButtonStyle}>Toggle Blog Details</button>
        <button onClick={() => setShowCourseDetails(!showCourseDetails)} style={toggleButtonStyle}>Toggle Course Details</button>
      </div>
    </div>
  );
}
const columnStyle = {
  flex: '1', 
  minWidth: '280px', 
  maxWidth: '350px', 
  padding: '20px',
  borderLeft: '2px solid green', 
  textAlign: 'left',
  marginBottom: '20px', 
};

const columnTitleStyle = {
  fontSize: '2em',
  marginBottom: '20px',
  marginTop: '0',
  fontWeight: 'bold', 
};

const toggleButtonStyle = {
  padding: '8px 15px',
  margin: '5px',
  fontSize: '14px',
  cursor: 'pointer',
};

export default App;