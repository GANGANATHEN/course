import React from 'react'

const Day3 = () => {
    const initialData = {
            email:"",
            Password:""
    }
    const [initialValue, setinitialValue] = React.useState(initialData)
    const [storeData, setatoreData] = React.useState([])
    const changeHandler = (e,type) =>{
        let data = {...initialValue}
        if(type=="email"){
            data.email = e.target.value;
        }
        else{
            data.Password = e.target.value;
        }
        setinitialValue(data)
    }

    const clickHandler = ()=>{
        let data = [...storeData]
        data.push(initialValue);
        console.log(data)
        setatoreData(data)
        setinitialValue(initialData)
    }
  return (
    <>
        <input type="email" value={initialValue.email} onChange={(event)=>{changeHandler(event,"email")}}/><br /><br />
        <input type="password" value={initialValue.Password} onChange={(event)=>{changeHandler(event,"password")}}/><br /><br />
        <button type="button" onClick={()=>clickHandler()}>Get Value</button>
    </>
  )
}

export default Day3