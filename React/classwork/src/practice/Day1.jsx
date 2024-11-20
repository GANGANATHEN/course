import React,{useState} from 'react'

const Day1 = () => {
    // const [a, seta] = useState("welcome")
    // const [b, setb] = useState("")
    // function handleClick(){
    //     seta(b)
    // }
    const [Spread, setSpread] = useState({
        name:"ganganathan",
        course:"react",
        place:"tbm",
    })
    const [a, seta] = useState("")
    function changeValue(p){
        setSpread(prev=>({
            ...prev,[p]:a
        }))
    }
    
  return (
    <>
        {/* <div>{a}</div>
        <input type="text" onChange={(e)=>setb(e.target.value)}/>
        <button type='button' onClick={()=>handleClick()}>click</button> */}
        <div>
            <h4>name: <span>{Spread.name}</span></h4>
            <h4>Course: <span>{Spread.course}</span></h4>
            <h4>Place: <span>{Spread.place}</span></h4>
            <input type="text" onChange={(e)=>seta(e.target.value)}/>
        </div>
        <div>
            <button type="button" onClick={()=>changeValue("name")}>Change name</button>
            <button type="button" onClick={()=>changeValue("course")}>Change Course</button>
            <button type="button" onClick={()=>changeValue("place")}>Change Place</button>
        </div>
    </>
  )
}

export default Day1