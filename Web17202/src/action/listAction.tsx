import React from "react"
import { ITodo } from "../interface/todo"
import store from "../store"

export const addTodo=(data:any)=>{
    return {
        type:"addtodo",
        payload:{
            name:data,
            complete:true
        }
    }
}

export const deleteTodo=(name:any)=>{
    return {
        type:"delete",
        name
    }
}

export const complete=(data:any)=>{
    
    return {
        type:"complete",
        payload:{
            name:data,
            complete:false
        }
    }
}