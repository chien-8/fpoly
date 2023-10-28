
import { createSlice,createAsyncThunk } from "@reduxjs/toolkit";
import { IProduct } from "../interface/product";

type StateProduct={
    value:IProduct[],
    item:IProduct
}
const initialState:StateProduct={
    value:[],
    item:{name:""}
}

export const fetchProduct=createAsyncThunk("product/fetchProduct",async()=>{
    const response = await fetch("http://localhost:3000/products")
    const data = await response.json()
    return data
})
export const fetchProductOne = createAsyncThunk ("product/fetchOne",async (id:string |undefined)=>{
    const response = await fetch("http://localhost:3000/products/"+id)
    const data = await response.json()
    return data
})
export const createProduct = createAsyncThunk ("product/createProduct",async (product:IProduct)=>{
    const response = await fetch("http://localhost:3000/products",{
        method :"POST",
        headers: {
            "Content-Type":"application/json"
        },
        body :JSON.stringify(product)
    })
    const data = await response.json()
    return data
})
export const editProduct = createAsyncThunk ("product/createProduct",async (product:IProduct)=>{
    const response = await fetch("http://localhost:3000/products/"+product.id,{
        method :"PUT",
        headers: {
            "Content-Type":"application/json"
        },
        body :JSON.stringify(product)
    })
    const data = await response.json()
    return data
})
export const deleteProduct = createAsyncThunk ("product/deleteProduct",async (id:number)=>{
   await fetch("http://localhost:3000/products/"+id,{
        method :"DELETE", 
    })
    return id
})
const productSlice= createSlice({
    name:"product",
    initialState:initialState,
    reducers:{},
    extraReducers:(buider)=>{
        buider.addCase(fetchProduct.fulfilled,(state,action)=>{
            state.value=action.payload
        })
        buider.addCase(deleteProduct.fulfilled,(state,action)=>{
            state.value=state.value.filter((item)=> item.id != action.payload)
        })
        buider.addCase(fetchProductOne.fulfilled,(state,action)=>{
            state.item=action.payload    
        })
        buider.addCase(editProduct.fulfilled,(state,action)=>{
            state.value=state.value.map((item)=>item.id === action.payload.id ? action.payload : item)
            console.log(action.payload)
        })
    }
})

export default productSlice.reducer;