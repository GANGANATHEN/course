// import logo from './logo.svg';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import './App.css';
import Nav from './navbar';
import { Home } from "./home";
import { Contact } from "./contact";
import { Callback } from "./Callback";
import { About } from "./about";

function App() {
  return (
    <BrowserRouter>
            <Routes>
                <Route path="/" element={<Nav />} >
                    <Route index element={<Home />} />
                    <Route path="home" element={<Home />} />
                    <Route path="about" element={<About />} />
                    <Route path="contact" element={<Contact />} />
                    <Route path="callback" element={<Callback />}/>
                </Route>
            </Routes>
        </BrowserRouter>
  );
}

export default App;
