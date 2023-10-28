import React from 'react'
import { SubmitHandler, useForm } from "react-hook-form"
import { IProduct } from '../interface/product';
import { createProduct } from '../slice/product';
import { useAppDispatch } from '../store/hook';
import { useNavigate } from "react-router-dom"
import { useAddProductsMutation } from '../service/product';
type Props = {}

const AddProduct = (props: Props) => {
    const { 
        handleSubmit,
        register,
        formState: { errors } 
    } = useForm<IProduct>();
    const [addProduct,result]=useAddProductsMutation();
    // const dispatch = useAppDispatch()
    const navigate=useNavigate()
    const onAdd: SubmitHandler<IProduct> = (data) => {
        addProduct(data).then(() => {
            navigate("/")
        })
    }
    return (
        <form onSubmit={handleSubmit(onAdd)}>
            <input type="text" {...register("name", { required: true })} />
            {errors.name && <span>không đựọc để trống</span>}
            <input type="text" {...register("price", { required: true })} />
            {errors.price && <span>không đựọc để trống</span>}
            <input type="text" {...register("description", { required: true })} />
            {errors.description && <span>không đựọc để trống</span>}
            <button>Add</button>
        </form>
    )
}

export default AddProduct