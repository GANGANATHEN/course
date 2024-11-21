import React,{useState} from 'react'

const Hform = () => {

    const [obj, setobj] = useState({
        name:"ganaganathan",
        mobile:"9876543210",
        email:"example@gmail.com"
    })
    const [arr, setarr] = useState([])

    function handleChange(e){
        setobj({
            ...obj,[e.target.name]:[e.target.value]
        })
    }
    function handleClick(e){
        e.preventDefault();
        setarr([...arr,obj]);
        setobj({
            name:"",
            mobile:"",
            email:""
        })
    }
    console.log(arr)
  return (
    <>
        <form onSubmit={handleClick}>
            <input type="text" name="name" placeholder='name' onChange={handleChange} value={obj.name}/><br /><br />
            <input type="text" name="mobile" onChange={handleChange} placeholder='mobile' value={obj.mobile}/><br/><br />
            <input type="text" name="email" onChange={handleChange} placeholder='email'value={obj.email}/><br /><br />
            <button type='submit'>Submit</button>
        </form>
        <table>
            <thead>
                <tr>
                    <th scope='col'>Username</th>
                    <th scope='col'>Email</th>
                    <th scope='col'>Password</th>
                </tr>
            </thead>
            <tbody>
                {arr.map((form,index)=>(
                    <tr key={index}>
                    <td>{form.name}</td>
                    <td>{form.mob}</td>
                    <td>{form.email}</td>
                    </tr>
                ))}
            </tbody>
        </table>
    </>
  )
}

export default Hform