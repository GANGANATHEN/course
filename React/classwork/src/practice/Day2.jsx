import React,{useState} from 'react'

const Day2 = () => {

    // const [a, seta] = useState({
    //     name:"g",
    //     place:"tbm",
    //     phone:"9876543210"
    // })

    // const [b, setb] = useState([])

    // function handleChange(e){
    //     seta({
    //         ...a,[e.target.name]:[e.target.value]
    //     })
    // }
    // function handleClick(e){
    //     e.prevantDefault()
    //     setb([...b,a])
    //     seta({
    //         name:"",
    //         place:"",
    //         phone:""
    //     })
    // }
    // console.log(b)
    const [a, seta] = useState([
        {
            name:"name1",
            place:"chennai",
            mail:"example1@gmail.com"
        },
        {
            name:"name2",
            place:"Tambaram",
            mail:"example2@gmail.com"
        }
    ])
    
  return (
    <>
        <div>
            {a.map((items,i)=>(
                <div key={i}>
                    <h3>name: <span>{items.name}</span></h3>
                    <h3>place: <span>{items.place}</span></h3>
                    <h3>mail: <span>{items.mail}</span></h3>
                </div>
            ))}
        </div>

        {/* <form onSubmit={handleClick}>
            <input type="text" name='name' value={a.name} onChange={handleChange}/><br /><br />
            <input type="text" name='phone' value={a.phone} onChange={handleChange}/><br /><br />
            <input type="text" name='place' value={a.place} onChange={handleChange}/><br /><br />
            <button type='submit'>submit</button>
        </form> */}
    </>
  )
}

export default Day2