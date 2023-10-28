import React from "react";
import {Routes,Outlet} from "react-router-dom"
function Layout(){
    return(
        <Routes>
            <Outlet/>
        </Routes>
    )
}

export default Layout