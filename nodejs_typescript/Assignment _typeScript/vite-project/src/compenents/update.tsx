import axios from "axios";
import React, { useEffect } from "react";
import { SubmitHandler, useForm } from "react-hook-form";
import { useNavigate, useParams } from "react-router";
import { IProduct } from "../interface/product";
import { useGetProductQuery, useUpdateProductsMutation } from "../service/service";

const Update = () => {
    const {
        register,
        handleSubmit,
        reset,
        formState: { errors }
    } = useForm<IProduct>();
    
    const { id } = useParams();
    
   
    
    const [updateProduct,result] =useUpdateProductsMutation()
    const {data:item}=useGetProductQuery(id)
    console.log(item)
    useEffect(()=>{
        const product=item?.product
        reset(product)
    },[])
    const navigate = useNavigate();
   
    const onSubmit: SubmitHandler<IProduct> = async (product) => {
        console.log(product)
        updateProduct(product).then(() => {
            navigate("/admin")
        })
    }
    return (
        <div className="add-product">
            <form onSubmit={handleSubmit(onSubmit)}>
                <div className="flex flex-col mb-3">
                    <label className="font-bold">Name</label>
                    <input className="border outline-none" type="text"  {...register("name", { required: true, minLength: 5 })} />
                    {errors.name && errors.name.type === "required" && (
                        <span>Bắt buộc nhập trường này</span>
                    )}
                </div>
                <div className="flex flex-col mb-3">
                    <label className="font-bold" >Giá</label>
                    <input className="border outline-none" type="number" {...register("price",{required:true})} />
                    {errors.price && errors.price.type==="required" && (<span>Bắt buộc nhập trường này</span>)}
                </div>
                <div className="flex flex-col mb-3">
                    <label className="font-bold" >Ảnh</label>
                    <input className="border outline-none" type="text" {...register("image",{required:true})} />
                    {errors.image && errors.image.type==="required" && (<span>Bắt buộc nhập trường này</span>)}
                </div>
                <div className="flex flex-col mb-3">
                    <label className="font-bold" >Mô tả</label>
                    <textarea className="border outline-none" cols={30} rows={5} {...register("description",{required:true})} />
                    {errors.description && errors.description.type==="required" && (<span>Bắt buộc nhập trường này</span>)}
                </div>
                <button className="bg-red-400 text-white block w-full p-2">Update</button>
            </form>
        </div>
    )

}

export default Update