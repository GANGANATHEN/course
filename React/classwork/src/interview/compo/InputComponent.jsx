import React from 'react'
import DropdownComponent from "./DropdownComponent"

const Inputcomponent = (props) => {
  return (
    <div>
        <div>input {props.user}</div>
        <DropdownComponent user={props.user} />
    </div>
  )
}

export default Inputcomponent