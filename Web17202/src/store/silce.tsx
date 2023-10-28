import {configureStore,ThunkAction,Action} from "@reduxjs/toolkit"
import productReducer from "../slice/product";
import counterReducer from "../slice/counter"
import { productApi } from "../service/product";
export const store = configureStore({
    reducer: {
        // counter: counterReducer,
        // product:productReducer
      [productApi.reducerPath]:productApi.reducer
    },
    middleware: (getDefaultMiddleware) => getDefaultMiddleware().concat(productApi.middleware),
});

export type AppDispatch = typeof store.dispatch;
export type RootState = ReturnType<typeof store.getState>;
export type AppThunk<ReturnType = void> = ThunkAction<
    ReturnType,
    RootState,
    unknown,
    Action<string>
>;