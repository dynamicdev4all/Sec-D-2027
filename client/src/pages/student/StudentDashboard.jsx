import React from 'react'

const StudentDashboard = ({student}) => {
  console.log(student);
  
  return (
  <>
    <h1>StudentDashboard</h1>
    <h2>ID : {student?.id}</h2>
    <h2>Name : {student?.name}</h2>
    <h2>Email : {student?.email}</h2>
  </>
  )
}

export default StudentDashboard