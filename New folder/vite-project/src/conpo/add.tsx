import axios from "axios";
import React from "react";
import { SubmitHandler, useForm } from "react-hook-form";
import { useNavigate } from "react-router";
import { IProduct } from "../interface/product";

const Add =()=>{
    const {handleSubmit,register,formState:{errors}}=useForm<IProduct>();
    const navigate =useNavigate()
    const onAdd:SubmitHandler<IProduct>=async(product)=>{
        try {
            const {data} =await axios.post("https://60371dc45435040017721a02.mockapi.io/products",product)
            navigate("/")
        } catch (error) {
            
        }
    }
    return (
        <div>
            <form onSubmit={handleSubmit(onAdd)}>
                <input type="text" placeholder="title" {...register("title",{required:true})}/>
                {errors.title && errors.title.type==="required" && (<span>trường dữ liệu bắt buộc</span>)}
                <input type="text" placeholder="image" {...register("image",{required:true})}/>
                {errors.image && errors.image.type==="required" && (<span>trường dữ liệu bắt buộc</span>)}
                <input type="text" placeholder="content" {...register("content",{required:true})}/>
                {errors.content && errors.content.type==="required" && (<span>trường dữ liệu bắt buộc</span>)}
                <button type="submit">add</button>
            </form>
        </div>
    )
}

export default Add