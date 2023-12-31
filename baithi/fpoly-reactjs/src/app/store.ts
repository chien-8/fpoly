
import { Action, ThunkAction, configureStore, getDefaultMiddleware } from '@reduxjs/toolkit';
import { productApi } from '../api/product';

const store = configureStore({
    reducer: {
        [productApi.reducerPath]:productApi.reducer
    },
    middleware:(getDefaultMiddleware)=>getDefaultMiddleware().concat(productApi.middleware)
})
export type AppDispatch = typeof store.dispatch;
export type RootState = ReturnType<typeof store.getState>;
export type AppThunk<ReturnType = void> = ThunkAction<
    ReturnType,
    RootState,
    unknown,
    Action<string>
>;

export default store;