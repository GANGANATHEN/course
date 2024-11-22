import React, { useEffect,useState } from 'react'

function Useeffect() {
    const [a, setA] = useState(0);
    const [b, setB] = useState(0)
    useEffect(()=>{
        setA(a+1);
    },[b])

    // const [a, seta] = useState([])
    // useEffect(()=>{
    //     fetch("https://dummyjson.com/products")
    //     .then(res => res.json())
    //     .then(result => seta(result))
    // },[])
    // console.log(a.products)
  return (
    <>
        <div>Rendering {a} time</div>
        <div>Rendering {b} time</div>

        <button type='submit'onClick={()=> setB(a+2)}>trigger</button>
        {/* <table>
            <thead>
                <tr>
                    <th >id</th>
                    <th >title</th>
                    <th >description</th>
                </tr>
            </thead>
            <tbody>
                {a.products.map((f,i)=>(
                    <tr key={i}>
                        <td>{f.id}</td>
                        <td>{f.title}</td>
                        <td>{f.description}</td>
                    </tr>
                ))} */}
                {/* {a.map((items,i)=>(
                    <div key={i}>
                        <h3>name: <span>{items.name}</span></h3>
                        <h3>place: <span>{items.place}</span></h3>
                        <h3>mail: <span>{items.mail}</span></h3>
                    </div>
                ))} */}
            {/* </tbody>
        </table> */}
    </>
  )
}

export default Useeffect