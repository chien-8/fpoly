import axios from "axios";


const instance=axios.create({
    baseURL:"https://60371dc45435040017721a02.mockapi.io/"
})

export const getAll=()=>{
    return instance.get(`/products`)
}
export const add=(newProduct)=>{
    return instance.post(`/products`,newProduct)
}

export const getOne=(id)=>{
    return instance.get(`/products/${id}`)
}

export const update=(item)=>{
    return instance.put(`/products/${item.id}`,item)
}