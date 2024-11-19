import React, {useState} from 'react'

const text = () => {
  const [details, setdetails] = useState(
    {
    name:"ganganathan",
    course:"react js",
    place:"tambaram"
  },
  {
    n:"nathan",
    course:"react js",
    place:"tambaram"
  }

)
  return (
    <>
      <h1>name: <span>{details.name}</span></h1>
      <h1>course: <span>{details.course}</span></h1>
      <h1>place: <span>{details.place}</span></h1>
    </>
  )
}

export default text