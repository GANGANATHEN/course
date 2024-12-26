import { useState,createContext } from 'react'
import Inputcomponent from './Inputcomponent';
export const userText = createContext();

const Maincomponent = () => {

    const [a, seta] = useState("pass it")

    const [object, setObject] = useState({
        Vegitables:["Tomato","Carrot","Brijal","Cauliflower"],
        Fruits:["Apple","Orange","Banana","Grapes"],
        Meat:["Chicken","Goat","Duck"],
        Sweets:["Cakes","Cookies","Biscutes","Candies"]
    })
    const [b, setb] = useState("")
    function inputData(){
        if(b!=0){
            console.log(object.Fruits) 
        }
    }
    function handleClick(){
        console.log(object.Vegitables)
        console.log(object.Fruits)
        console.log(object.Meat)
        console.log(object.Sweets)
    }
  return (
    <div>
        {/* <p>{object.Vegitables}</p>
        <p>{object.Fruits}</p>
        <p>{object.Meat}</p>
        <p>{object.Sweets}</p> */}
        <input type="text" onChange={(e)=>setb(e.target.value)}/><button onClick={()=>inputData()}>search</button><button onClick={()=>inputData()}>search</button><br /><br />
        <button onClick={()=>handleClick()}>Submit</button>

        <userText.Provider value={a}>
            <div>main has {a}</div>
            <Inputcomponent user={a} />
        </userText.Provider>
    </div>
  )
}

export default Maincomponent