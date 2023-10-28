import React from 'react'
import {useForm} from 'react-hook-form'
import {useNavigate}from "react-router-dom"
import { Iuser } from '../interface'
import { useGetUserQuery } from '../api'
const Signin = () => {
    const {
        register,
        handleSubmit,
        formState:{errors}           
    }=useForm<Iuser>()
    const navigate=useNavigate()
    const {data:user} =useGetUserQuery()
    
    const signup =(data:any)=>{
        const a =user.filter(()=>{
            return 
        })
    }
  return (
    <form onSubmit={handleSubmit(signup)}>
        <input type='email' {...register("email",{required:true})}/>
        {errors.email && <span>khonog duoc der trong</span>}
        <input type='password' {...register("password",{required:true})}/>
        {errors.password && <span>khonog duoc der trong</span>}
        <button>add</button>
    </form>
  )
}

export default Signin