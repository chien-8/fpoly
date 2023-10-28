var form=document.querySelector("#form");
var namesp=document.querySelector("#name");
var sale_pricesp=document.querySelector("#sale_price");
var pricesp=document.querySelector("#price");
var imagesp=document.querySelector("#image");
var typesp=document.querySelector("#type");
var descriptionsp=document.querySelector("#description");


var fields=["name","sale_price","type","description","price"]
form.onsubmit=function(e){
    e.preventDefault();
    var error=false
    fields.forEach(function(item){
        var field =document.querySelector("#"+item);
        if(field.value===""){
            showError(item, "trường dữ liệu bắt buộc")
            error = true
        } else {
            showError(item, "")
        }
    })
    if(!error){
        var name=namesp.value;
        var categories=typesp.value;
        var description=descriptionsp.value;
        var images=imagesp.value;
        var saleprice=sale_pricesp.value;
        var egularprice=pricesp.value
        var data={name,categories,description,images,saleprice,egularprice}
        postDish(data).then(function(result){
            location.href="../index.html"
        })
    }
}
function showError(id, content) {
    var element = document.querySelector("#" + id)
    if (element.nextElementSibling) {
        element.nextElementSibling.innerHTML = content
    }
}

function postDish(data) {
    return fetch('http://localhost:3000/resources', {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    }).then(function (res) {
        return res.json()
    })
}