import {configureStore} from "@reduxjs/toolkit"
import { productApi } from "../service"

export const store =configureStore({
    reducer:{
        [productApi.reducerPath]:productApi.reducer
    },
    middleware:(getDefaultMiddleware)=>getDefaultMiddleware().concat(productApi.middleware)
})

export type AppDispatch =typeof store.dispatch;
 
