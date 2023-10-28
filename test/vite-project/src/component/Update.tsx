import React from 'react'
import {useForm} from 'react-hook-form'
import {useNavigate,useParams}from "react-router-dom"
import { useGetOneQuery, useUpdateProMutation } from '../api'
import { Iproduct } from '../interface'
const Update = () => {
    const {
        register,
        handleSubmit,
        formState:{errors}           
    }=useForm<Iproduct>()
    const {id}= useParams()
    const navigate=useNavigate()
    const {data:item}=useGetOneQuery(id)
    const [addnew] =useUpdateProMutation()
    
    const add =(data:Iproduct)=>{
        addnew({id:id,...data}).then(()=>{
            navigate("/")
        })
    }
  return (
    <form onSubmit={handleSubmit(add)}>
        <input type='text' defaultValue={item?.name} {...register("name",{required:true})}/>
        {errors.name && <span>khonog duoc der trong</span>}
        <button>add</button>
    </form>
  )
}

export default Update