import React from 'react'
import { useDeleteProMutation, useGetAllQuery } from '../api/product'

const Home = () => {
    const {data:products}=useGetAllQuery()
    const [deleteProduct]= useDeleteProMutation()
  return (
    <div>
        <table>
            <thead>
                <tr>
                    <td>
                </tr>
            </thead>
        </table>
    </div>
  )
}

export default Home