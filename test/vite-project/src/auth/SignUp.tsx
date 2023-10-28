import React from 'react'
import {useForm} from 'react-hook-form'
import {useNavigate}from "react-router-dom"
import { Iuser } from '../interface'
import { useSignupMutation } from '../api'
const SignUp = () => {
    const {
        register,
        handleSubmit,
        formState:{errors}           
    }=useForm<Iuser>()
    const navigate=useNavigate()
    const [addnew] =useSignupMutation()
    
    const signup =(data:any)=>{
        addnew(data).then(()=>{
            navigate("/")
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

export default SignUp