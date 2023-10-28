import { add } from "./api";

const addsp={
    render(){
        return`
             <form id="form"> 
                <span>name</span>
                <input type="text" id="title">
                <div class="error"></div><br>
                <span>image</span>
                <input type="text" id="image">
                <div class="error"></div><br>
                <span>content</span>
                <input type="text" id="content">
                <div class="error"></div><br>
                <button type="submit">thêm mới</button>
             </form>


         `
    },afterRender(){
        var fields=["title","image","content"];
        document.querySelector("#form").addEventListener("submit",(e)=>{
            e.preventDefault();
            var error=false;
            fields.forEach(function(item){
                var field=document.querySelector("#"+item);
                if(field.value===""){
                   showerror(item,"trường dữ liẹu bắt buộc1");
                   error=true;
                }else{
                    showerror(item,"")
                }
            })
            if(!error){
                const data={
                    title:document.querySelector("#title").value,
                    image:document.querySelector("#image").value,
                    content:document.querySelector("#content").value
                }
                add(data).then(function(){
                    location.assign("http://127.0.0.1:5173/admin")
                })
            }
        })
    }

}



function showerror(id,content){
    var element=document.querySelector("#"+id);
    if(element.nextElementSibling){
        element.nextElementSibling.innerHTML=content;
    }
}

export default addsp
