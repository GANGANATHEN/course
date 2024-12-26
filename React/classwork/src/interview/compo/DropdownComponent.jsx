import React from 'react'
import {useContext} from 'react'
import { userText } from './MainComponent'

const DropdownComponent = () => {
  const text = useContext(userText)
  return (
    <div>drop has {text}</div>
  )
}

export default DropdownComponent