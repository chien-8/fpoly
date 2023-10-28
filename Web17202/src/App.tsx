import { useState } from 'react'
import { Routes, Route, Router } from "react-router-dom"
import RequierAuth from './requiAuth/requierAuth'
import LayoutAdmin from './layoutadmin/layoutAdmin'
import AddProduct from './components/add'
import UpdateProduct from './components/update'
AbstractRange


function App() {
  return (
    <>
      <Routes>
        {/* <Route path='/' element={<Layout />} >
          <Route index element={<Home />} />
          <Route path="/products" element={<Products />} />
          <Route path='/cart' element={<CartPage/>}/>
          <Route path='/detail/:id' element={<Detail />} />
        </Route> */}
        <Route path='/signup' element ={<Signup/>}/>
        <Route path='/signin' element ={<Signin/>}/>
        <Route path='/admin' element={
          <RequierAuth>
            <LayoutAdmin />
          </RequierAuth>
        }>
          <Route index element={<Admin/>} />
          <Route path='add' element={<AddProduct />} />
          <Route path='/admin/update/:id' element={<UpdateProduct />} />
        </Route>
        <Route path='*' element={<h1>Not found</h1>} />
      </Routes>
    </>
  )
}

export default App
 