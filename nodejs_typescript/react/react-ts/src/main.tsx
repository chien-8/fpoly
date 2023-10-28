import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './app';
import Test from './test';
import {BrowserRouter} from "react-router-dom"


const myname: string = "chiến";
const myage: number = 20;
const isMarried: boolean = false;
const myInfor: { name: string, age: number } = {
  name: "chiến",
  age: 20,
};

function sum(a: number, b: number): number {
  return a + b;
}
//conper


// định nghĩa ra kiểu dữ liệu
type Info = {
  name: string,
  age:number

  
}
function hello(props: Info) {
  return <div>xin chào {props.name}, {props.age}</div>
}
function Hello(props:Info) {
  return <div>Xin chào {props.name}</div>;
}
ReactDOM.createRoot(document.getElementById('root') as HTMLElement).render(
  <BrowserRouter>
    {/* <ul>
      <li>{myname}</li>
      <li>{myage}</li>
      <li>{isMarried ? "đã kết hôn" : "chưa kết hôn"}</li>
      <li>{sum(3, 4)}</li>
    </ul>
    <p>my name : {myInfor.name}; my age :{myInfor.age}</p>
    <ul>
      <li>{hello({ name: "nguyễn văn a",age:20})}</li>
      <Hello name="nguyễn văn b" age={20}/>
      
    </ul> */}
    {/* <Test/> */}
    <App/>
  </BrowserRouter>



);

