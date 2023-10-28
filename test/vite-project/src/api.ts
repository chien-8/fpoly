import {createApi,fetchBaseQuery} from "@reduxjs/toolkit/query/react"
import { Iproduct } from "./interface"

export const productApi =createApi({
    reducerPath:"api",
    baseQuery:fetchBaseQuery({baseUrl:"http://localhost:3000/"}),
    tagTypes:["product"],
    endpoints:(build)=>({
        getAll:build.query<Iproduct,void>({
            query:()=>`products`,
            providesTags:['product']
        }),
        getOne:build.query<Iproduct,any>({
            query:(id)=>`products/${id}`,
            providesTags:['product']
        }),
        addPro:build.mutation<Iproduct,Partial<Iproduct>>({
            query:(product)=>{
                return{
                    url:`products`,
                    method:"POST",
                    body:product
                }
            },
            invalidatesTags:["product"]
        }),
        updatePro:build.mutation<Iproduct,Partial<Iproduct>>({
            query:(product)=>{
                return{
                    url:`products/${product.id}`,
                    method:"PUT",
                    body:product
                }
            },
            invalidatesTags:["product"]
        }),
        deletePro:build.mutation<Iproduct,Partial<Iproduct>>({
            query:(id)=>{
                return{
                    url:`products/${id}`,
                    method:"DELETE",
                }
            },
            invalidatesTags:["product"]
        })
    })
})

export const {
    useAddProMutation,
    useDeleteProMutation,
    useGetAllQuery,
    useGetOneQuery,
    useUpdateProMutation
}= productApi