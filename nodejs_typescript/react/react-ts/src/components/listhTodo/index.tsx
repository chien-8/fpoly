import React from "react";
import {ITodo} from "../../interfaces/todo"



type ListTodoProps = {
    todos: ITodo[];
    onRemove: (id: number) => void;
};

const ListTodo = (props: ListTodoProps) => {
    return (
        <div>
            {props.todos.map((todo) => (
                <div key={todo.id}>
                    {todo.title} <button onClick={() => props.onRemove(todo.id as number)}>Remove</button>
                </div>
            ))}
        </div>
    );
};

export default ListTodo;