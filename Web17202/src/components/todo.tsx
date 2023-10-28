import axios from "axios";
import React, { useEffect, useState } from "react";
import { useForm, SubmitHandler } from "react-hook-form"
import { useDispatch, useSelector } from "react-redux";
import { addTodo, deleteTodo } from "../action/listAction";
import store from "../store";
import Todo from "../todo/todo";

const TodoList = () => {

  const [data, setData] = useState("")
  const todo = useSelector((state: any) => state.list.list)
  const [check,setCheck] = useState()
  const dispatch = useDispatch()
  const handleCheck=(e:any)=>{

    setCheck(e)
  }
  return <>
    <h2>To do</h2>
    <div>
      <div>
        <input type="text" value={data} onChange={(e) => { setData(e.target.value) }} />
        {/* <button onClick={() => dispatch({type :"addtodo",payload:[{data:data}]})} type="submit">add</button> */}
        <button onClick={() => { dispatch(addTodo(data)); setData(""); }} type="submit">add</button>
      </div>

      <ul className="list-group mb-0">
        {todo.map((res: any, index: any) => (
          <li key={index}
            className="list-group-item d-flex justify-content-between align-items-center border-start-0 border-top-0 border-end-0 border-bottom rounded-0 mb-2">
            <div className="d-flex align-items-center">
              <input className="form-check-input me-2" type="checkbox" value={res.complete} aria-label="..."  onChange={()=>{handleCheck(res.complete)}} />
              {res.name}
            </div>
            <button onClick={() => { dispatch(deleteTodo(res.name)) }}>delete</button>
          </li>
        ))}
      </ul>

    </div>
  </>
}

export default TodoList

