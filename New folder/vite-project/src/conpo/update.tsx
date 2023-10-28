import axios from "axios";
import React, { useEffect } from "react";
import { SubmitHandler, useForm } from "react-hook-form";
import { useNavigate, useParams } from "react-router";
import { IProduct } from "../interface/product";

const Update =()=>{
    const {handleSubmit,reset,register,formState:{errors}}=useForm<IProduct>();
    const navigate =useNavigate()
    const {id}= useParams()
    useEffect(()=>{
        (async()=>{
            const {data}= await axios.get("https://60371dc45435040017721a02.mockapi.io/products/"+id);
            reset(data)
        })()
    },[])
    const onUpdate:SubmitHandler<IProduct>=async(product)=>{
        try {
            const {data} =await axios.put("https://60371dc45435040017721a02.mockapi.io/products/"+id,product)
            navigate("/")
        } catch (error) {
            
        }
    }
    return (
        <div>
            <form onSubmit={handleSubmit(onUpdate)}>
                <input type="text" placeholder="title" {...register("title",{required:true})}/>
                {errors.title && errors.title.type==="required" && (<span>trường dữ liệu bắt buộc</span>)}
                <input type="text" placeholder="image" {...register("image",{required:true})}/>
                {errors.image && errors.image.type==="required" && (<span>trường dữ liệu bắt buộc</span>)}
                <input type="text" placeholder="content" {...register("content",{required:true})}/>
                {errors.content && errors.content.type==="required" && (<span>trường dữ liệu bắt buộc</span>)}
                <button type="submit">update</button>
            </form>
        </div>
    )
}

export default Update