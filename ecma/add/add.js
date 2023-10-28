var namesp=document.querySelector("#name");
var pricesp=document.querySelector("#price");
var typesp=document.querySelector("#type");
var form=document.querySelector("#form");

var fields=["name","price","type"]
form.onsubmit=function(e){
    e.preventDefault();
    var error= false;
    fields.forEach(function(item){
        var field=document.querySelector("#"+item);
        if(field.value===""){
            showerror(item,"truong dữ liệu bắt buộc")
            error=true;
        }else{
            showerror(item,"")
        }
    })
    if(!error){
        var name=namesp.value;
        var price=pricesp.value;
        var type=typesp.value;
        var data={name,price,type}
        alert("thêm mới thành công")
        addsp(data).then(function(){
            location.href="../index.html"
        })
    }

}
function showerror(id,content){
    var eliment=document.querySelector("#"+id);
    console.log(eliment.nextElementSibling)
    if(eliment.nextElementSibling){
        eliment.nextElementSibling.innerHTML=content
    }
}

function addsp(data){
    return fetch('http://localhost:3000/ontap',{
        method:"POST",
        headers:{"Content-Type" :"application/json"},
        body:JSON.stringify(data)
    }).then(function(res){
        return res.json()
    })
}