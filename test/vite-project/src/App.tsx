import { useState } from 'react'

import { Routes,Route } from 'react-router-dom'
import Home from './component/Home'
import Add from './component/Add'
import Update from './component/Update'

function App() {
  

  return (
    <Routes>
      <Route path='/' element={<Home/>}/>
      <Route  path='/add' element={<Add/>}/>
      <Route  path='/update/:id' element={<Update/>}/>
    </Routes>
  )
}

export default App
