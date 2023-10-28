import React from 'react'
import { useDeleteProMutation, useGetAllQuery } from '../api'
import {Link } from "react-router-dom"
const Home = () => {
    const {data:item}=useGetAllQuery()
    const [deleteP] = useDeleteProMutation()
    const remove=(id)=>{
        deleteP(id)
    }
  return (
    <div>
        <Link to="/add">add</Link>
        <table>
            <thead>

            </thead>
            <tbody>
                {item?.map((item,index)=>(
            <tr key={index}>
                <td>{item.name}</td>
                <td>{item.price}</td>
                <td>{item.description}</td>
                <td>
                    <Link to={`update/${item.id}`}>update</Link>
                    <button onClick={()=>remove(item.id)}>delete</button>
                </td>
            </tr>
        ))}

            </tbody>
        </table>
        
    </div>
  )
}

export default Home