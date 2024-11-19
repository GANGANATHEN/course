import React,{useState} from "react"

function UseState() {
    // const [a, seta] = useState("//Hello God\\\\")
  const [name, seta] = useState("ganganathan")
  const [course, setb] = useState("react")
  const [place, setc] = useState("tbm")
  return (
    <>
      {/* <div>{a}</div>
      <button type="button" onClick={()=>seta("i am ganganathan")}>submit</button>
      <input type="text" onChange={(e)=>seta(e.target.value)} /> */}
      <h1>name: <span>{name}</span></h1>
      <h1>course: <span>{course}</span></h1>
      <h1>place: <span>{place}</span></h1>
    </>
  )
}

export default UseState