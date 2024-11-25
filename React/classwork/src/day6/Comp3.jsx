import {useContext} from 'react'
import { userText } from './Comp1'

const Comp3 = () => {
    const text = useContext(userText)
  return (
    <div>Comp3 has {text}</div>
  )
}

export default Comp3