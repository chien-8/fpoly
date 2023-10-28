function getspID(id) {
    return fetch("http://localhost:3000/ontap/" + id).then(function (res) {
        return res.json();
    })
}
var queryString = location.search;
var param = new URLSearchParams(queryString);
var id = param.get("id");
var namesp = document.querySelector("#name");
var pricesp = document.querySelector("#price");
var typesp = document.querySelector("#type");
var imagesp=document.querySelector("#image")
var form = document.querySelector("#form");
getspID(id).then(function (result) {
    namesp.value = result.name;
    pricesp.value = result.price;
    typesp.value = result.type;
    imagesp.value=result.image;
    form.onsubmit = function (e) {
        e.preventDefault();
        var id=result.id;
        var name=namesp.value;
        var type=typesp.value;
        var price=pricesp.value;
        var image=imagesp.value;
        var data={id,name,price,type,image}
        update(data).then(function(){
            location.href="../index.html"
        })
    }
})








function update(data) {
    return fetch("http://localhost:3000/ontap/" + data.id, {
        method: "PUT",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)

    }).then(function (res) {
        return res.json()
    })
}