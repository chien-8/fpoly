import { createStore } from "redux"

const intialState = {
    count: 0
}
const action = {
    type: "increment"
}
const reducer = (state = intialState, action) => {
    // if(action.type==="increment"){
    //     return { count :state.count +1}
    // }
    // return state
    switch (action.type) {
        case "increment":
            return { count: state.count + 1  };
        default:
            return state;
    }
}
const store = createStore(reducer)
console.log("store",store)
console.log("intialState", store.getState())
store.dispatch(action)
console.log("intialState", store.getState())