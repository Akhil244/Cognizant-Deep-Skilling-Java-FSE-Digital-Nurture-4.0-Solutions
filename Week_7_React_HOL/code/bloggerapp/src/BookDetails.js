import React from 'react';
const booksData = [
  { id: 101, bname: 'Master React', price: 670 },
  { id: 102, bname: 'Deep Dive Into Angular 11', price: 800 },
  { id: 103, bname: 'Mongo Essentials', price: 450 },
];

function BookDetails() {
  return (
    <div>
      {booksData.map(book => (
        <div key={book.id} style={{ marginBottom: '10px' }}>
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </div>
  );
}

export default BookDetails;
