import React,{useState,useRef, useEffect} from 'react'

const Ref = () => {
    const [r, setr] = useState('')
    const c = useRef(0);
    useEffect(()=>{
        c.current = c.current +1;
    })
  return (
    <>
        <div>Render {c.current}</div>
        <div>Text {r}</div>
        <input type="text" onChange={(e)=>setr(e.target.value)}/>
    </>
  )
}

export default Ref