import { ICounter } from "../interface/counter";

const intialState={
    count:10,
    value:0
} as ICounter

const reducerStore =(state=intialState,action:any )=>{
    switch(action.type){
        case "icrement":
            return {...state,count: state.count +1};
        case "decrement":
            return {...state,count: state.count -1};
        case "increase":
            return {...state,count: state.count + action.payload};
        default :
            return state
    }
}

export default reducerStore