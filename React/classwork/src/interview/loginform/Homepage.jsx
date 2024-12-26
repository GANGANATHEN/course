import { Link, Outlet } from "react-router-dom";
const Homepage = () => {
  return (
    <div>
      <div>
          <Link to="/login">Login</Link>
          <Link to="/signup">Sign</Link>
      </div>
        <Outlet />
    </div>
  )
}

export default Homepage