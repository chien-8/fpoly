import React from 'react'
import {useForm,SubmitHandler} from 'react-hook-form'
import {useNavigate} from "react-router-dom"
import { IProduct } from '../interfaces/product'
import { useAddProMutation } from '../api/product'
const Add = () => {
    const {
        register,
        handleSubmit,
        formState:{errors}
    }= useForm<IProduct>()
    const navigate =useNavigate()
    const [addProduct]= useAddProMutation()
    const onAdd:SubmitHandler<IProduct>=(data)=>{
        addProduct(data).then(()=>{
            alert("thêm mới thành công")
            navigate('/')
        })
    }
  return (
    <form onSubmit={handleSubmit(onAdd)}>
        <div>
            <label>name</label>
            <input  type='text' {...register("name",{required:true})} />
            {errors.name && <span>không được để trống</span>}
        </div>
        <div>
            <label>price</label>
            <input type='number' {...register("price",{required:true})} />
            {errors.price && <span>không được để trống</span>}
        </div>
        <div>
            <label>quantity</label>
            <input type='number' {...register("quantity",{required:true})} />
            {errors.quantity && <span>không được để trống</span>}
        </div>
        <button type='submit' className="btn btn-primary">Add new</button>
    </form>
  )
}

export default Add