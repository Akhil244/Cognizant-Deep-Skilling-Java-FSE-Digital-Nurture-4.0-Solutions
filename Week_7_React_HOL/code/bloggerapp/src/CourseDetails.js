import React from 'react';

const courseData = [
  { id: 301, name: 'Angular', date: '4/5/2021' },
  { id: 302, name: 'React', date: '6/3/20201' }, 
];

function CourseDetails() {
  return (
    <div>
      {courseData.map(course => (
        <div key={course.id} style={{ marginBottom: '10px' }}>
          <h3>{course.name}</h3>
          <h4>{course.date}</h4>
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;