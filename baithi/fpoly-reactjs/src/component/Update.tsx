import React from 'react'
import {useForm,SubmitHandler} from 'react-hook-form'
import {useNavigate,useParams} from "react-router-dom"
import { IProduct } from '../interfaces/product'
import { useGetOneQuery, useUpdateProMutation } from '../api/product'
const Update = () => {
    const {
        register,
        handleSubmit,
        formState:{errors}
    }= useForm<IProduct>()
    const {id}=useParams()
    const navigate =useNavigate()
    const {data:product}=useGetOneQuery(id)
    const [updateProduct]= useUpdateProMutation()
    const onUpdate:SubmitHandler<IProduct>=(data)=>{
        updateProduct({id:id,...data}).then(()=>{
            alert("cập nhật thành công")
            navigate('/')
        })
    }
  return (
    <form onSubmit={handleSubmit(onUpdate)}>
        <div>
            <label>name</label>
            <input type='text' defaultValue={product?.name} {...register("name",{required:true})} />
            {errors.name && <span>không được để trống</span>}
        </div>
        <div>
            <label>price</label>
            <input type='number' defaultValue={product?.price} {...register("price",{required:true})} />
            {errors.price && <span>không được để trống</span>}
        </div>
        <div>
            <label>quantity</label>
            <input type='number' defaultValue={product?.quantity} {...register("quantity",{required:true})} />
            {errors.quantity && <span>không được để trống</span>}
        </div>
        <button type='submit' className="btn btn-primary">update</button>
    </form>
  )
}

export default Update