import axios from "axios";
const inscate=axios.create({
    baseURL:"https://60371dc45435040017721a02.mockapi.io/"
})

export const getAll=()=>{
    return inscate.get(`/products`)
}
export const getOne=(id)=>{
    return inscate.get(`/products/${id}`)
}
export const add=(data)=>{
    return inscate.post(`/products`,data)
}
export const update=(item)=>{
    return inscate.put(`/products/${item.id}`,item)
}
export const remove=(item)=>{
    return inscate.delete(`/products/${item.id}`,item)
}