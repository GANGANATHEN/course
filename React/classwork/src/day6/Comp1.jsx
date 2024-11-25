import {createContext,useState} from 'react'
import Comp2 from './Comp2'
export const userText = createContext();

const Comp1 = () => {
    const [a, seta] = useState("pass it")
  return (
    <>
        <userText.Provider value={a}>
            <div>comp 1 has {a}</div>
            <Comp2 user={a} />
        </userText.Provider>
    </>
  )
}

export default Comp1