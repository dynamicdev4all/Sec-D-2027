import { useState } from 'react'
import './App.css'
import StudentDashboard from './pages/student/StudentDashboard'
import StudentLogin from './pages/student/StudentLogin'
import { BrowserRouter, Routes, Route } from "react-router-dom"
import StudentRegister from './pages/student/StudentRegister'
import FourOFour from './pages/fourofour'

function App() {

  const [student, setStudent] = useState(null)

  const student1 = {
    name: "Ayush",
    email: "ayush@gmail.com",
    id: "245"
  }
  // setStudent(student1)

  return (
    <BrowserRouter>
      <Routes>
        <Route path='/' Component={StudentLogin}  />
        <Route path='/student/dashboard' Component={StudentDashboard} student={student1} />
        <Route path='/student/register' Component={StudentRegister} />
        <Route path='/*' Component={FourOFour} />
      </Routes>
    </BrowserRouter>
  )
}

export default App
