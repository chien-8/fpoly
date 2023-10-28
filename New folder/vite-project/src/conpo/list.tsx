import axios from "axios";
import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import { IProduct } from "../interface/product";

const List =()=>{

    const [product,setProduct]= useState<IProduct[]>([])
    useEffect(()=>{
        (async()=>{
            try {
                const {data} =await axios.get("https://60371dc45435040017721a02.mockapi.io/products")
                setProduct(data)
            } catch (error) {
                
            }
            
        })()
    },[])
    const remove =async(id:number)=>{
        try {
            if(confirm("bạn có chắc muốn xóa")==true){
               const {data}= await axios.delete("https://60371dc45435040017721a02.mockapi.io/products/"+id)
               setProduct(product.filter((item)=>item.id!=data.id)) 
            }
        } catch (error) {
            
        }
    }
    return (<div>
        <a href="/add"><button>add</button></a>
        <table>
            <thead>
                <tr>
                    <td>stt</td>
                    <td>title</td>
                    <td>image</td>
                    <td>content</td>
                    <td>action</td>
                </tr>
            </thead>
            <tbody>
                {product.map((item,index)=>(
                    <tr key={index}>
                       <td>{index+1}</td>
                       <td>{item.title}</td>
                       <td>{item.image}</td>
                       <td>{item.content}</td>
                       <td>
                        <button><Link to={`/update/${item.id}`}>update</Link></button>
                        <button onClick={()=>remove(item.id!)}>remove</button>
                       </td>
                    </tr>
                )
                
                )}
                
            </tbody>
        </table>
    </div>)
}

export default List