import React, { useState } from "react";

type ShowProps={
    name:string,
    age:number
}

function Show(props:ShowProps){
    return <div>{props.name},{props.age}</div>
}

function Test(){
    const [myName,setMyName]=useState("john");
    return (
        <div className="App">
            <Show name={myName} age={20} />
        </div>
    )
}



export default Test;