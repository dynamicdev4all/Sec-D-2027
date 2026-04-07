import React, { useState } from 'react'
import studentLogin from '../../api/loginApi';
import { useNavigate } from 'react-router-dom';
const StudentLogin = (setStudent) => {

  const navigate = useNavigate();
  // useState hook
  const [email, setEmail] = useState("");
  const [pass, setPass] = useState("");
  const [id, setId] = useState("");
  const handleLogin = () => {
    const res = studentLogin(id, email, pass);
    if (res === "Login Successful") {
      //redirect to dashboard
      const student1 = {
        name: "Ayush",
        email: "ayush@gmail.com",
        id: "245"
      }
      setStudent(student1)
      navigate("/student/dashboard")
    } else {
      //show login error
    }
  }

  return (
    <div>
      <form onSubmit={handleLogin}>
        <input type="text" name="id" onChange={(e) => setId(e.target.value)} />
        <input type="email" name="email" onChange={(e) => setEmail(e.target.value)} />
        <input type="password" name="pass" onChange={(e) => setPass(e.target.value)} />
        <button type='submit' >Login Now</button>
      </form>
    </div>
  )
}

export default StudentLogin