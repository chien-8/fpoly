const fetchProduct =()=>{
    return (dispatch:any)=>{
        fetch("http://localhost:3000/products")
            .then((res)=>res.json())
            .then((data)=>dispatch({type:"GET_PRODUCT",payload:data}))
    }
}
export const addProduct =(product:any)=>(dispatch:any)=>{
    
    fetch("http://localhost:3000/products",{
        method:"POST",
        headers:{
            "Content-type":"application/json"
        },
        body: JSON.stringify(product)
    })
    .then((res)=>res.json())
    .then((data)=>dispatch({type:"ADD_PRODUCT",payload:data}))
}
export const deleteProduct =(id:any)=>(dispatch:any)=>{
    fetch("http://localhost:3000/products/" + id,{
        method:"DELETE",
        headers:{
            "Content-type":"application/json"
        }
    })
    .then((res)=>res.json())
    .then((data)=>dispatch({type:"DELETE_PRODUCT",payload:id}))
}
export const updateProduct =(product:any)=>(dispatch:any)=>{
    fetch("http://localhost:3000/products/"+product.id,{
        method:"PUT",
        headers:{
            "Content-type":"application/json"
        },
        body: JSON.stringify(product)
    })
    .then((res)=>res.json())
    .then((data)=>dispatch({type:"UPDATE_PRODUCT",payload:data}))
}
export default fetchProduct