import Navigo from "navigo";
import addsp from "./src/project/add";
import homepage from "./src/project/home";
import adminsp from "./src/project/manage_product";
import removesp from "./src/project/remove";
import updatesp from "./src/project/update";

const router= new Navigo("/",{linksSelector:"a"})
const print=async (content,id)=>{
    document.querySelector("#app").innerHTML=await content.render(id);
    if(content.afterRender){
        content.afterRender(id);
    }
}

router.on({
    "/":()=>{
        print(homepage)
    },
    "/admin":()=>{
        print(adminsp)
    },
    "/add":()=>{
        print(addsp)
    },
    "/update/:id":(value)=>{
        print(updatesp,value.data.id)
    },
    "/remove/:id":(value)=>{
        print(removesp,value.data.id)
    }
})

router.resolve()