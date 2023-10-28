var form = document.querySelector("#form");
var nameEL = document.querySelector("#name");
var amountEL = document.querySelector("#amount");
var priceEL = document.querySelector("#price");
var typeEL = document.querySelector("#type");
var descriptionEL = document.querySelector("#description");

var fields = ["name","amount","price","type","description"]
form.onsubmit = function (e) {
    e.preventDefault();
    var error = false
    fields.forEach(function (item) {
        var field = document.querySelector("#" + item)
        if (field.value === "") {
            showError(item, "trường dữ liệu bắt buộc")
            error = true
        } else {
            showError(item, "")
        }
    })
    if (!error) {
        var name = nameEL.value;
        var amount = amountEL.value;
        var price = priceEL.value;
        var type = typeEL.value;
        var description = descriptionEL.value;
        // console.log(name, description, "add")
        var data = { name, amount, price, type, description }
        postDish(data).then(function (result) {
            
            location.href = "../index.html"
        })
    }


}

function showError(id, content) {
    var element = document.querySelector("#" + id)
    if (element.nextElementSibling) {
        element.nextElementSibling.innerHTML = content
    }
}
// them mon an
function postDish(data) {
    return fetch('http://localhost:3000/dishes', {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    }).then(function (res) {
        return res.json()
    })
}