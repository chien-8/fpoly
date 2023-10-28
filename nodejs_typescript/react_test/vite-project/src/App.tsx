import React from "react";
import { Routes,Route } from "react-router";
import Add from "./compenents/add";
import ListProduct from "./compenents/list";
import Layout from "./layout/layout";

function App(){
  return (
    <>
      <Routes>
        <Route path="/" element={<ListProduct/>}/>
        <Route path="/add" element={<Add/>}/>
      </Routes>
    </>
  )
}

export default App