var fields=["name","type","price","pricesale","description","danhgia"]
document.querySelector("#form").onsubmit=function(e){
    e.preventDefault();
    var error=false;
     fields.forEach(function(item){
        var field=document.querySelector("#"+item);
        if(field.value ==""){
           showerror(item,"truonưgf dữu liệu bắt bucowj");
           error=true
        }else{ 
            showerror(item,"")
        }
     })
     if(!error){
        var data={
            name:document.querySelector("#name").value,
            type:document.querySelector("#type").value,
            price:document.querySelector("#price").value,
            pricesale:document.querySelector("#pricesale").value,
            danhgia:document.querySelector("#danhgia").value,
            description:document.querySelector("#description").value
        }
        addsp(data).then(function(){
            location.href="../index.html"
        })
     }
} 
function showerror(id,content){
    var element=document.querySelector("#"+id);
    if(element.nextElementSibling){
        element.nextElementSibling.innerHTML=content
    }
}
function addsp(data){
    return fetch("http://localhost:3000/products",{
        method:"POST",
        headers:{
            "Content-Type":"application/json"
        },
        body:JSON.stringify(data)
    }).then(function(res){
        return res.json()
    })
}