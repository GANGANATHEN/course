import { useState } from "react"
import { BrowserRouter, Routes, Route } from "react-router-dom";
import { Link, Outlet } from "react-router-dom";
import Homepage from "./Homepage";

const Login = () => {
    const [user, setUser] = useState(
        {
            username:"A1",
            password:"A",
            role:"user"
        },
        {
            username:"A3",
            password:"A",
            role:"user"
        }
    )
    // const [a, seta] = useState("")
    function handleClick(e){
        setUser({
            ...user,[e.target.name]:[e.target.value]
        })
    }
    const [Admin, setAdmin] = useState(
        {
            username:"A",
            password:"A",
            role:"admin"
        },
        {
            username:"A2",
            password:"A",
            role:"admin"
        }
    )
  return (
    <>
        <div>
            <p>{user.username}</p>
            <p>{Admin.username}</p>
            <h1>Login Page</h1>
            <h3>Username <input type="text" name="username" /></h3>
            <h3>Password <input type="Password" name="password" /></h3>
            <button onClick={()=>handleClick()}>login</button>
            
            
            <BrowserRouter>
            <Routes>
                <Route path="/" element={<Login />} >
                    <Route index element={<Homepage />} />
                </Route>
            </Routes>
        </BrowserRouter>
        </div>    
    </>
  )
}

export default Login