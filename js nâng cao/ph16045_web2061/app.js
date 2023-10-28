var table = document.querySelector("#table");
function getAll() {
    return fetch("http://localhost:3000/products").then(function (res) {
        return res.json()
    })
}
getAll().then(function (result) {
    console.log(result)
    reder(result)
})

function reder(data) {
    var content = "";
    if (data) {
        data.forEach((item) => {
            content += ` 
                 <tr>
                    <td>${item.name}</td>
                    <td>${item.type}</td>
                    <td>${item.danhgia}</td>
                    <td></td>
                    <td>
                        <a href="./update/update.html?id=${item.id}">sửa</a>
                        <button onclick="deletesp(${item.id})">xóa</button>
                    </td>
                  
                 </tr>
            `
        });
    }
    table.innerHTML = content;
}

function deletesp(id) {
    if (confirm("bạn chắc chắn muốn xóa") == true) {
        return fetch("http://localhost:3000/products/" +id, {
            method: "DELETE",
            headers: {
                "Content-Type": "application/json"
            }
        }).then(function (res) {
            return res.json()
        })
    }
}