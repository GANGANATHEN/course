import React from 'react'

const Table = () => {
  return (
    <>
        <table>
            <thead>
                <tr>
                    <th scope='col'>Username</th>
                    <th scope='col'>Email</th>
                    <th scope='col'>Password</th>
                </tr>
            </thead>
            <tbody>
                {props.d.map((form,index)=>(
                    <tr key={index}>
                    <td>{form.username}</td>
                    </tr>
                ))}
            </tbody>
        </table>
    </>
  )
}

export default Table