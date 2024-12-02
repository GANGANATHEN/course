import React, { useEffect } from 'react';
import axios from 'axios';
const jsonData = require('../data/sampleData.json');

const Sample = (props) => { 
    const [show,setShow] = React.useState(false);
    const [apiData,setApiData] = React.useState(false);
    useEffect(()=>{
        axios.get('https://dummyjson.com/products')
        .then(response => setApiData(response.data.products)) 
    },[])
    const clickHandler = () =>{ 
        setShow(!show); 
    }
    const data = (apiData && apiData.length > 0) && apiData.map(function(item,index){ return <div key={index}> 
            <h1>{item.title}</h1>
            <h2>{item.description}</h2>
            <h3>{item.category}</h3>
            <p>{item.brand}</p>
            <button type = "button">Next</button>
            <div> {show && <h1>Sample</h1>}
                <button onClick={() =>clickHandler()}>Show</button>
                {data} 
            </div>
        </div>; })
} 
export default Sample;