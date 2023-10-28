import React, { useEffect } from "react";
import axios from "axios"
import { useForm } from "react-hook-form";
import { SubmitHandler } from "react-hook-form/dist/types";
import { useNavigate, useParams } from "react-router";
import { IProduct } from "../interface/products";

const Update =()=>{
    const {register,reset,handleSubmit,formState:{errors}}=useForm<IProduct>()
    const navigate= useNavigate()
    const {id}= useParams()
    useEffect(()=>{
        (async()=>{
            try {
                 const {data}= await axios.put("https://60371dc45435040017721a02.mockapi.io/products/"+id)
                reset(data)
            } catch (error) {
                
            }
        })()
    },[])
    const onAdd:SubmitHandler<IProduct>=async(product)=>{
        try {
            const {data}= await axios.put("https://60371dc45435040017721a02.mockapi.io/products/"+id,product)
            navigate("/")
        } catch (error) {
            
        }
    }

    return(
        <div>
            <form onSubmit={handleSubmit(onAdd)}>
                <input type="text" placeholder="title" {...register("title",{required:true})}/>
                {errors.title && errors.title.type==="required" &&(<span>truong du lieu bat buoc</span>)}
                <input type="text" placeholder="image" {...register("image",{required:true})}/>
                {errors.image && errors.image.type==="required" &&(<span>truong du lieu bat buoc</span>)}
                <input type="text" placeholder="content" {...register("content",{required:true})}/>
                {errors.content && errors.content.type==="required" &&(<span>truong du lieu bat buoc</span>)}
                <button>update</button>
            </form>
        </div>
    )
}
export default Update