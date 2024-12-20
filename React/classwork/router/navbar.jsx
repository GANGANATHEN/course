import React from "react";
import './nav.css'
import { Link, Outlet } from "react-router-dom";

function Nav() {
    return (
        <>
            <div class="titlemain">
                <div class="title1">
                    <div>
                        <div class="title2">
                            <h1>Besant Tech<br></br></h1>
                            <h4>React</h4>
                        </div>
                    </div>
                </div>
            </div>

            <div class="nav_bar">
                <div class="thisrightnav">
                    <Link to="/home">Home</Link>
                    <Link to="/about">About</Link>
                    <Link to="/contact">Contact us</Link>
                    <Link to="/callback">Get Callback</Link>
                </div>
            </div>
            <Outlet />
        </>
    )
}

export default Nav



