import { add, getAll } from "./api/products"

const addProduct={
    async render(){
        const productList = (await getAll()).data;
        return /* html*/`
            <form id="form">
                 <input type="text" id="title">
                 <input type="text" id="image">
                 <input type="text" id="content">
                 <button type="submit">thêm mới</button>
            </form>
        `
    },
    afterRender(){
        document.querySelector("#form").addEventListener("submit",(e)=>{
            e.preventDefault();
            const newProduct={
                title:document.querySelector("#title").value,
                image:document.querySelector("#image").value,
                content:document.querySelector("#content").value 
            }
            console.log(newProduct)
            add(newProduct).then(function(){
                location.assign("http://127.0.0.1:5174/admin")
            })
        })
    }
}


export default addProduct