import React from 'react';
import Comp3 from './Comp3'

const Comp2 = (props) => {
  return (
    <>
        <div>{props.user}</div>
        <Comp3 user={props.user} />
    </>
  )
}

export default Comp2