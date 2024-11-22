import {useState, useEffect} from 'react'

const Task1 = () => {
  // const [a, setA] = useState(0);
  //   const [b, setB] = useState(0);
  //   // const [c, setC] = useState(0);

  //   useEffect(()=>{
  //       setA(a+1);
  //   },[b])
  //   useEffect(()=>{
  //     setA(a-1);
  // },[c])
  // const [a, setA] = useState([])
  // const [b, setB] = useState(0);
  // const [c, setC] = useState(1)

    const [a, setA] = useState([])
  const [b, setB] = useState(0);

  // useEffect(()=>{
  //       setB(b+1);
  //       // fetch(`https://dummyjson.com/products/${c}`)
  //       fetch('https://dummyjson.com/products/'+c)
  //       .then(res => res.json())
  //       .then(result => setA(result))
  //   },[c])

  useEffect(()=>{
        fetch('https://dummyjson.com/products/'+b)
        .then(res => res.json())
        .then(result => setA(result))
    },[b])
    console.log(a)
  return (
    <>
      {/* <div>a {a}</div> */}
      <div>b {b}</div>
      {/* <button type='submit'onClick={()=> setC(c-1)}>prev</button>
      <button type='submit'onClick={()=> setC(c+1)}>next</button> */}

      <input type="text" onChange={(e)=>setB(e.target.value)} />

      <table>
            <thead>
                <tr>
                    <th >id</th>
                    <th >title</th>
                    <th >description</th>
                </tr>
            </thead>
            <tbody>
                {/* {a.products.map((f,i)=>(
                    <tr key={i}>
                        <td>{f.id}</td>
                        <td>{f.title}</td>
                        <td>{f.description}</td>
                    </tr>
                ))} */}
                <tr >
                    <td>{a.id}</td>
                    <td>{a.title}</td>
                    <td>{a.description}</td>
                </tr>
            </tbody>
        </table>
    </>
  )
}

export default Task1