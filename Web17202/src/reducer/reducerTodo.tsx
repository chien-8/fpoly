import React from "react";
import { Action } from "redux";
import store from "../store";
import { ITodo } from "../interface/todo";
const todoList = {
    list:[]
}

const reducerTodo = (state = todoList, action: any) => {

    switch (action.type) {
        case "addtodo":
            const data = action.payload
            return {
                ...state,
                list: [
                    ...state.list,data
                ]
            };
            
        case "delete":
            const newlist = state.list.filter((e) => e.name !== action.name)
            return {
                ...state,
                list: newlist
            };
            
        case "complete":
            return {
                ...state, 
            };
        default:
            return state
    }
}

export default reducerTodo