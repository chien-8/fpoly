var show = document.querySelector("#show");
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
            <img src="">
            <a>${item.name}</a>
            <p>${item.description}</p>
            `
        });
    }
    show.innerHTML = content;
}
