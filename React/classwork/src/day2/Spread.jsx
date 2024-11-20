import React from 'react'

const Spread = () => {
    const obj1 ={
        name:"name1",
        deg:"deg1",
        dept:"dept1",
    }
    const obj2 ={
        name1:"name2",
        deg1:"deg2",
        dept1:"dept3",
    }
    const Sobj = {...obj1,...obj2}
    console.log(Sobj);
  return (
    <div>Spread</div>
  )
}

export default Spread