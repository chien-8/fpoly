import {createApi,fetchBaseQuery} from "@reduxjs/toolkit/query/react"
import { IProduct } from "../interface/product"


export const productApi = createApi({
    reducerPath:"productApi",
    baseQuery: fetchBaseQuery({baseUrl:'http://localhost:8000/api/'}),
    tagTypes:['Product','Productone'],
    endpoints: (builder)=>({
        getProducts:builder.query<IProduct[],void>({
            query:() => `products`,
            providesTags:['Product']
        }),
        getProduct:builder.query<IProduct[],void>({ 
            query: (id) => `products/${id}`,
            providesTags:['Productone']
        }),
        addProducts:builder.mutation<IProduct,Partial<IProduct>>({
            query:(product)=>{
                return {
                    url:`products`,
                    method:"POST",
                    body:product
                }
            },
            invalidatesTags:["Product"]
        }),
        updateProducts:builder.mutation<IProduct,Partial<IProduct>>({
            query:(product)=>{
                return {
                    url:`products/${product._id}`,
                    method:"PUT",
                    body:product
                }
            },
            invalidatesTags:["Product",'Productone']
        }),
        deleteProducts:builder.mutation<void,IProduct>({
            query:(id) => {
                return {
                    url:`products/${id}`,
                    method:'DELETE',
                }
            },
            invalidatesTags:["Product"]
        })
    })
})

export const { 
    useGetProductsQuery,
    useGetProductQuery,
    useAddProductsMutation,
    useUpdateProductsMutation,
    useDeleteProductsMutation  
} =productApi