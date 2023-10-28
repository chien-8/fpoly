import { localStorageService } from "../my-app/service.js";
import { uploadImage } from "../my-app/api.js";

var form = document.querySelector("#form");
var image = document.querySelector("#image");
var preview_image = document.querySelector("#preview-image");
var name = document.querySelector("#name");
var amount = document.querySelector("#amount");
var price = document.querySelector("#price");
var type = document.querySelector("#type");
var description = document.querySelector("#description");
var show = document.getElementById("show");
var use_page = document.getElementById("use_page");

// validate form
var fields = ["name", "price", "amount", "description", "type", "image"]
form.onsubmit = function (e) {
    e.preventDefault();
    var error = false;
    var data = {};
    // fields.forEach(function (item) {
    //     clearError(item);
    // })
    fields.forEach(function (item) {
        var field = document.querySelector("#" + item)
        if (field.value == "") {
            showError(item, "không được để trống!");
            error = true;
        }
        else {
            showError(item, "");
        }
        data[item] = field.value;
    })

    if (preview_image.src) {
        data['image'] = preview_image.src
    }

    if (!error) {
        var menu = localStorageService.get("menu")
        // console.log(menu)
        if (menu) {
            menu.push(data)
        } else {
            menu = [data]
        }
        localStorageService.set("menu", menu)
        form.reset()
        alert('Thêm sản phẩm thành công')
        render()
    }
};

function showError(id, content) {
    var element = document.querySelector("#" + id)
    if (element.nextElementSibling) {
        element.nextElementSibling.innerHTML = content;
    }
}

// function clearError(id) {
//     var element = document.querySelector("#" + id)
//     element.nextElementSibling.innerHTML = ""
// }

// Handle image
// url: https://image-uploader-anhhtus.herokuapp.com/api/upload
image.onchange = function (e) {
    var file = e.target.files[0]
    var reader = new FileReader();
    reader.readAsDataURL(file)
    reader.onloadend = function () {
        var result = uploadImage('https://image-uploader-anhhtus.herokuapp.com/api/upload', reader.result);
        result.then(function (res) {
            preview_image.src = res.secure_url;
        });

    }
}



function render() {
    var menu = localStorageService.get("menu");
    if (menu) {
        show.innerHTML = menu.map(function (item, index) {
            return ` 
        <tbody>
            <td>${index + 1}</td>
            <td>${item.name}</td>
            <td>${item.amount}</td>
            <td>${item.type}</td>
            <td><input type="checkbox" ${item.amount < 1 ? `checked` : ''}></td>
            <td>
                <button onclick="sua()">sửa</button>
                <button onclick="xoa()">xóa</button>
            </td>
        </tbody>
        `
        }).join("");
    }

}
render();



var menu = localStorageService.get("menu")
use_page.innerHTML = menu.map(function (item) {

    return ` 
    <div style="display: inline-flex; margin-right: 100px;margin-right: 100px">
        <img src="${item.image}" style="width: 100px;height: 100px;">
        <div>
        <a>${item.name}</a>
        <p>${item.description}</p>
        <a>${item.type}</a>
        <p>${item.price}</p>
        </div>
    </div>
        `
}).join("");