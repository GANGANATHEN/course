import React,{useState} from 'react'

const Input = () => {
    // const [a, seta] = useState("Hello Besant")
    // const [b, setb] = useState("")
    // function inputData(){
    //     seta(b);
    // }
    // console.log(b)

    const [obj, setobj] = useState({
        name:"g",
        course:"React",
        place:"tbm",
    })
    const [a, seta] = useState("")
    function handleClick(p){
        setobj(prev =>({
            ...prev,[p]:a
        }))
    }
  return (
    <>
      {/* <div>{obj}</div> */}
      {/* <input type="text" onChange={(e)=>setb(e.target.value)}/> */}
      {/* <button type="button" onClick={()=>inputData()}>submit</button> */}
      <div>
        <h3>name: <span>{obj.name}</span></h3>
        <h3>course: <span>{obj.course}</span></h3>
        <h3>place: <span>{obj.place}</span></h3>
      </div>
      <input type="text" onChange={(e)=>seta(e.target.value)}/>
      <button type="button" onClick={()=>handleClick("name")}>Change Name</button>
      <button type="button" onClick={()=>handleClick("course")}>Change Course</button>
      <button type="button" onClick={()=>handleClick("place")}>Change Place</button>
    </>
  )
}

export default Input