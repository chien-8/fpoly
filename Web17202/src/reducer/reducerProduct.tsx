
const initialState={
    value:[]
}

const reducerProduct=(state=initialState,action:any)=>{
    switch(action.type){
        case "GET_PRODUCT":
            return {
                ...state,
                value:action.payload
            };
        case "ADD_PRODUCT":
            return {
                ...state,
                value:[
                    ...state.value,
                    action.payload
                ]
            }
        case "DELETE_PRODUCT":
            return {
                ...state,
                value: state.value.filter((item:any)=>item.id != action.payload)
            };
        case "UPDATE_PRODUCT":
            return {
                ...state,
                value: state.value.map((item:any)=>
                    item.id === action.payload.id ? action.payload : item
                )
            }
        default:
            return state
    }

}

export default reducerProduct