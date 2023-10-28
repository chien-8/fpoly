import { decrement, increaseByAmount, increment } from "../slice/counter";
import {useSelector,useDispatch} from "react-redux"
import { ICounter } from "../interface/counter";


type Props={}

const Counter =()=>{
    const counter = useSelector((state:any)=>state.counter.value)
    const dispatch= useDispatch()
    return <div>
        Counter : {counter.count}
        <button onClick={() => dispatch(increment())}>INCREMENT</button>
        <button onClick={() => dispatch(decrement())}>DECREMENT</button>
        <button onClick={() => dispatch(increaseByAmount(10))}>INCREASE</button>
    </div>
}

export default Counter