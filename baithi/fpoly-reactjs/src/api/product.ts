import {createApi,fetchBaseQuery} from "@reduxjs/toolkit/query/react"
import { IProduct, IUser } from "../interfaces/product"

export const productApi = createApi({
    reducerPath:"api",
    baseQuery:fetchBaseQuery({baseUrl:"http://localhost:3000/"}),
    tagTypes:["product","user"],
    endpoints:(build)=>({
        getAll:build.query<IProduct,void>({
            query:()=>`products`,
            providesTags:['product']
        }),
        getOne:build.query<IProduct,any>({
            query:(id)=>`products/${id}`,
            providesTags:['product']
        }),
        addPro:build.mutation<IProduct,Partial<IProduct>>({
            query:(product)=>{
                return {
                    url:`products`,
                    method:"POST",
                    body:product
                }
            },
            invalidatesTags:['product']
        }),
        updatePro:build.mutation<IProduct,Partial<IProduct>>({
            query:(product)=>{
                return {
                    url:`products/${product.id}`,
                    method:"PUT",
                    body:product
                }
            },
            invalidatesTags:['product']
        }),
        deletePro:build.mutation<IProduct,Partial<IProduct>>({
            query:(id)=>{
                return {
                    url:`products/${id}`,
                    method:"DELETE",
                }
            },
            invalidatesTags:['product']
        }),
        signUp:build.mutation<IUser,Partial<IUser>>({
            query:(data)=>{
                return {
                    url:`user`,
                    method:"POST",
                    body:data
                }
            },
            invalidatesTags:['user']
        })
    })
})

export const {
    useAddProMutation,
    useDeleteProMutation,
    useGetAllQuery,
    useGetOneQuery,
    useUpdateProMutation,
    useSignUpMutation
}= productApi