import React, { useEffect, useState } from 'react'
import { SubmitHandler, useForm } from 'react-hook-form';
import { IProduct } from '../interface/product';
import { editProduct, fetchProductOne } from '../slice/product';
import { useAppDispatch } from '../store/hook';
import {useNavigate,useParams} from "react-router-dom"
import { useDispatch, useSelector } from 'react-redux';
import { RootState } from '../store/silce';
import { useGetProductQuery, useUpdateProductsMutation } from '../service/product';
type Props = {}

const UpdateProduct = (props: Props) => {
  const { 
    handleSubmit,
    register,
    formState: { errors } 
} = useForm<IProduct>();


const {id} = useParams()
const {data:item}=useGetProductQuery(id)
const [updateProduct,result] =useUpdateProductsMutation()
// const dispatch = useAppDispatch()
const navigate=useNavigate()

// const {item}= useSelector((state:RootState)=>state.product)
const onAdd: SubmitHandler<IProduct> = ({name}) => {
  // dispatch(editProduct({id:item.id,name}))
  updateProduct({id:item?.id,name});
  navigate("/")
}

// useEffect(()=>{
//   dispatch(fetchProductOne(id))

// },[])
return (
    <form onSubmit={handleSubmit(onAdd)}>
        <input type="text" defaultValue={item?.name} {...register("name", { required: true })}/>
        {errors.name && <span>không đựọc để trống</span>}
        <button>Update</button>
    </form>
)
}

export default UpdateProduct