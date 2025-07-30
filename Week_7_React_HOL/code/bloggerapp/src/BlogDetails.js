import React from 'react';

// Sample data for Blog Details, matching screenshot content
const blogData = [
  { id: 201, title: 'React Learning', author: 'Stephen Biz', content: 'Welcome to learning React!' },
  { id: 202, title: 'Installation', author: 'Schewzdenier', content: 'You can install React from npm.' },
];

function BlogDetails() {
  return (
    <div>
      {blogData.map(blog => (
        <div key={blog.id} style={{ marginBottom: '10px' }}>
          <h3>{blog.title}</h3>
          <h4>{blog.author}</h4>
          <p>{blog.content}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;