import { applyMiddleware, combineReducers, createStore } from "redux";
import reducerStore from "../reducer/reducerStore";
import reducerTodo from "../reducer/reducerTodo";
import thunk from "redux-thunk"
import { composeWithDevTools } from 'redux-devtools-extension'
import rootReducer from "../reducer/rootReducer";
// const store = createStore(reducerStore);

// taoj nhánh chính 
// const reducer= combineReducers({
//     list: reducerTodo
// })

// const store = createStore(reducer);
// const store = createStore(
//     reducer,
//     composeWithDevTools(applyMiddleware(thunk)) 
//   );

const store= createStore(rootReducer,applyMiddleware(thunk))

export default store
