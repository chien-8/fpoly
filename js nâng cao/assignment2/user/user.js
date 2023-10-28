
var user_page=document.getElementById('userPage')

function getDishes(){
    return fetch("http://localhost:3000/dishes").then(function(res){
        return res.json()
    })
}

getDishes().then(function(result){
    userPage(result)
})

function userPage(data){
    var content="";
    if(data){
        data.forEach(function(dish){
            content+=` 
        <div class="product">
            <img src="" alt="">
            <a>${dish.name}</a>
            <p>${dish.description}</p>
            <button class="w-[200px] p-3 bg-red-400 inline-block">${dish.price}đ</button>
        </div>
            `
        });
    }
    user_page.innerHTML=content;
}

