function getspID(id) {
    return fetch("http://localhost:3000/ontap/" + id).then(function (res) {
        return res.json();
    })
}
var queryString = location.search
var param = new URLSearchParams(queryString)
var id = param.get('id')
getspID(id).then(function (result) {
    document.querySelector("#name").value = result.name;
    document.querySelector("#price").value = result.price;
    document.querySelector("#type").value = result.type;
    var fields = ["name", "price", "type"]
    document.querySelector("#form").addEventListener("submit", function (e) {
        e.preventDefault();
        var error = false;
        fields.forEach(function (item) {
            var field = document.querySelector("#" + item);
            if (field.value === "") {
                showError(item, "trường dữ liệu bắt buộc!");
                error = true;
            } else {
                showError(item, "");
            }
        })
        if (!error) {
            var id = result.id;
            var name = document.querySelector("#name").value
            var price = document.querySelector("#price").value
            var type = document.querySelector("#type").value
            var data = { id, name, price, type }
            alert("cập nhật thành công")
            updatesp(data).then(function () {
                location.href = "../index.html"
            })
        }

    })

})
function showError(id, content){
    var element = document.querySelector("#" + id);
    if (element.nextElementSibling) {
        element.nextElementSibling.innerHTML = content
    }
}
function updatesp(data) {
    return fetch("http://localhost:3000/ontap/" + data.id, {
        method: "PUT",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    }).then(function (res) {
        console.log(res)
        return res.json()

    })
}