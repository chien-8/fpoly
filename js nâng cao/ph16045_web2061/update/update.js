function getone(id) {
    return fetch("http://localhost:3000/products/" + id).then(function (res) {
        return res.json()
    })
}
var queryStr = location.search;
var param = new URLSearchParams(queryStr);
var id = param.get("id");
getone(id).then(function (result) {
    var fields = ["name", "type", "price", "pricesale", "description", "danhgia"]
    document.querySelector("#name").value=result.name;
    document.querySelector("#type").value=result.type;
    document.querySelector("#price").value=result.price;
    document.querySelector("#pricesale").value=result.pricesale;
    document.querySelector("#danhgia").value=result.danhgia;
    document.querySelector("#description").value=result.description;
    document.querySelector("#form").onsubmit = function (e) {
        e.preventDefault();
        var error = false;
        fields.forEach(function (item) {
            var field = document.querySelector("#" + item);
            if (field.value == "") {
                showerror(item, "truonưgf dữu liệu bắt bucowj");
                error = true
            } else {
                showerror(item, "")
            }
        })
        if (!error) {
            var data = {
                id: result.id,
                name: document.querySelector("#name").value,
                type: document.querySelector("#type").value,
                price: document.querySelector("#price").value,
                pricesale: document.querySelector("#pricesale").value,
                danhgia: document.querySelector("#danhgia").value,
                description: document.querySelector("#description").value
            }
            updatesp(data).then(function () {
                location.href = "../index.html"
            })
        }
    }
})

function showerror(id,content){
    var element=document.querySelector("#"+id);
    if(element.nextElementSibling){
        element.nextElementSibling.innerHTML=content
    }
}
function updatesp(data){
    return fetch("http://localhost:3000/products/"+data.id,{
        method:"PUT",
        headers:{
            "Content-Type":"application/json"
        },
        body:JSON.stringify(data)
    }).then(function(res){
        return res.json()
    })
}