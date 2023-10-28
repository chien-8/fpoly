import React, { useState } from "react";
import { useForm, SubmitHandler } from "react-hook-form"
import { ITodo } from "../../interfaces/todo";
import {v4 as uuidv4} from "uuid"

type Prost = {
    onAdd: (todo: ITodo) => void,
}



const AddTodo = (prost: Prost) => {
    const {register,handleSubmit,formState:{errors}} = useForm<ITodo>()
    const onSubmit:SubmitHandler<ITodo> = (data) => {
        data.id=uuidv4();
        prost.onAdd(data)
    }

    return (
        <div>
            <form onSubmit={handleSubmit(onSubmit)}>
                <h1>thêm mới sản phâmr</h1>
                <input type="text" {...register('title')} />
                <input type="checkbox" {...register('completed')} /> completed
                <br />
                <button type="submit">add</button>
            </form>
        </div>
    )
}


// type Props = {
//     onAdd: (todo: any) => void;
// };

// const AddTodo = (props: Props) => {
//     const [value, setValue] = useState("");
//     const onHandleChange = (e: any) => {
//         setValue(e.target.value);
//     };

//     const onHandleSubmit = (e: React.FormEvent<HTMLFormElement>) => {
//         e.preventDefault();
//         const fakeObject = {
//             id: 10,
//             completed: true,
//             title: value,
//         };
//         props.onAdd(fakeObject);
//         console.log(fakeObject)
//     };

//     return (
//         <div>
//             <form onSubmit={onHandleSubmit}>
//                 <h1>Thêm sản phẩm</h1>
//                 <input type="text" onChange={onHandleChange} />
//                 {/* <input type="checkbox" name="completed" /> completed */}
//                 <br />
//                 <button>Add</button>
//             </form>
//             <hr />
//         </div>
//     );
// };

export default AddTodo;