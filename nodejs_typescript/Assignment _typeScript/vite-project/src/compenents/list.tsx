import React, { useEffect, useState } from "react";
import axios from "axios";
import { IProduct } from "../interface/product";
import { Link } from "react-router-dom";
import { useDeleteProductsMutation, useGetProductsQuery } from "../service/service";

type Props = {}

const List = (props: Props) => {
   
    const {data:product,isLoading,error} =useGetProductsQuery()
    console.log(product)
    const [deleteProduct,result]=useDeleteProductsMutation()
    const removeItem=(id:any)=>{
        deleteProduct(id)
    }
   

    return (

        <>
            {product?.product.map((item, index) => (
                <tr key={index}>
                    <td>{index + 1}</td>
                    <td>{item.name}</td>
                    <td>{item.price}</td>
                    <td><img src={item.image}/></td>
                    <td>{item.description}</td> 
                    <td >
                        <button className="action2"><Link to={`/admin/update/${item._id}`}>Update</Link></button>
                    </td>
                    <td>
                        <button className="action1" onClick={() => removeItem(item._id!)}>remove</button>

                    </td>
                </tr>
            ))}
        </>
    )
}

export default List;