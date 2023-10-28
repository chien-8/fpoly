import { useState } from "react";
import { useForm, SubmitHandler } from "react-hook-form";
import { useNavigate } from "react-router";
import { IProduct } from "../interface/product";
import axios from "axios"
import { render } from "react-dom";
import { useAddProductsMutation } from "../service/service";


const Add = () => {
    const {
        register,
        handleSubmit,
        formState: { errors },
    } = useForm<IProduct>();

    const navigate = useNavigate();
    const [addProduct,result]=useAddProductsMutation();
    const onAdd: SubmitHandler<IProduct> = async (product) => {
        console.log(product)
        try {

            addProduct(product).then(() => {
                navigate("/admin")
            })
        } catch (error) {

        }
    }
    return (
        <div className="add-product">
            <form onSubmit={handleSubmit(onAdd)}>
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
                <button className="bg-red-400 text-white block w-full p-2">add new</button>
            </form>
        </div>
    )
}

export default Add;