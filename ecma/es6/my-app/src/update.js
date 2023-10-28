import { getOne, update } from "./api/products";

const updateProduct={
    async render(id){
        const productListOne=(await getOne(id)).data;
        return /*html*/`
    <form id="form">
        <input type="text" id="title" value="${productListOne.title}">
        <input type="text" id="image" value="${productListOne.image}">
        <input type="text" id="content" value="${productListOne.content}">
        <button type="submit">thêm mới</button>
   </form>
        `
    },
    afterRender(id){
        document.querySelector("#form").addEventListener("submit",(e)=>{
            e.preventDefault()
            const putUpdate={
                id:id,
                title:document.querySelector("#title").value,
                image:document.querySelector("#image").value,
                content:document.querySelector("#content").value
            }
            console.log(putUpdate)
            update(putUpdate).then(function(){
                location.assign("http://127.0.0.1:5174/admin")
            })
        })
    }

}

export default updateProduct

