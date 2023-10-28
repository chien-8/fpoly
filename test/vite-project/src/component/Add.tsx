import React from 'react'
import {useForm} from 'react-hook-form'
import {useNavigate}from "react-router-dom"
import { useAddProMutation } from '../api'
import { Iproduct } from '../interface'
const Add = () => {
    const {
        register,
        handleSubmit,
        formState:{errors}           
    }=useForm<Iproduct>()
    const navigate=useNavigate()
    const [addnew] =useAddProMutation()
    
    const add =(data)=>{
        addnew(data).then(()=>{
            navigate("/")
        })
    }
  return (
    <form onSubmit={handleSubmit(add)}>
        <input type='text' {...register("name",{required:true})}/>
        {errors.name && <span>khonog duoc der trong</span>}
        <button>add</button>
    </form>
  )
}

export default Add