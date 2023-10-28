function getDishByID(id) {
    return fetch("http://localhost:3000/dishes/" + id).then(function (res) {
        return res.json()
    })
}
//
function main() {
    var queryString = location.search
    var param = new URLSearchParams(queryString)
    var id = param.get('id');
    getDishByID(id).then(function (result) {
        document.querySelector("#name").value = result.name
        document.querySelector("#amount").value = result.amount
        document.querySelector("#price").value = result.price
        document.querySelector("#type").value = result.type
        document.querySelector("#description").value = result.description
        document.querySelector("#form").addEventListener("submit",(e)=>{
            e.preventDefault();
            var id= result.id;
            console.log(result.id)
            var name=document.querySelector("#name").value
            var amount=document.querySelector("#amount").value
            var price=document.querySelector("#price").value
            var type=document.querySelector("#type").value
            var description=document.querySelector("#description").value
            var data={id,name,amount,price,type,description}
            console.log(data)
            alert("cập nhật thành công")
            updateDish(data).then(function(result){
                location.href="../index.html"
            })
        })
    })
}
main(); 

function updateDish(data) {
    return fetch('http://localhost:3000/dishes/'+data.id, {
        method: "PUT",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    }).then(function (res) {
        return res.json()
    })
}