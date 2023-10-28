import Navigo from "navigo";
import addProduct from "./src/add";
import addmin from "./src/admin";
import HomePage from "./src/home";
import updateProduct from "./src/update";

const router=new Navigo("/",{linksSelector:"a"});
const print= async (content,id)=>{
  document.querySelector("#app").innerHTML=await content.render(id);
  if(content.afterRender){
    content.afterRender(id);
  }
}

router.on({
  "/":()=>{
    print(HomePage)
  },
  "/admin":()=>{
    print(addmin)
  }
  ,
  "/products/add":()=>{
    print(addProduct)
  },
  "/products/:id/update":(value)=>{
    
    print(updateProduct,value.data.id)
  }
})

router.resolve()