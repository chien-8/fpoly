import React from 'react'
import ReactDOM from 'react-dom/client'
import Todo from './components/todo';
import Test from './test';
import {Route, Routes,Outlet} from "react-router-dom"
import LayoutWebsite from './layout/layoutWebsite';
import HomePage from './page/home';
import About from './page/About';



function App(){
    return (
    <>
        <Routes>
            <Route path='/' element={<LayoutWebsite/>}>
                <Route index element={<HomePage/>} />
                <Route path='about' element={<About/>} />
                <Route path='todo' element={<Todo />} />
            </Route>
            <Route path="*" element={<h1>Not Found</h1>}/>
        </Routes>
        {/* //    <Todo /> */}
        
    </>
    )
}

export default App;