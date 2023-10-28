import { combineReducers } from "redux";
import Counter from "../components/counter";
import reducerProduct from "./reducerProduct";
import reducerStore from "./reducerStore";

const rootReducer =combineReducers({
    couter:reducerStore,
    product:reducerProduct
})

export default rootReducer