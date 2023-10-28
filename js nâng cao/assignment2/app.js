
var table=document.querySelector("#table");


function getDishes(){
    return fetch("http://localhost:3000/dishes").then(function(res){
        return res.json()
    })
}

getDishes().then(function(result){
    console.log(result,"hghaa");
    render(result)
})


function render(data){
    var content="";
    if(data){
        data.forEach(function(dish,index) {
            content +=`
                 <tr>
                     <td>${index +1}</td>
                     <td>${dish.name}</td>
                     <td>${dish.price}</td>
                     <td><img href="" alt=""></td>
                     <td>${dish.type}</td>
                     <td><input type="text" ${dish.amount < 1 ? `value="hết hàng"` : 'value="còn hàng"'}/></td>
                     <td><form id="form1">
                        <a class="hover:text-blue-400" href="./update/update.html?id=${dish.id}">sửa</a>
                        /<button class="hover:text-blue-400">xóa</button>
                        </form>
                     </td>
                 </tr>
            `
        });
    }
    table.innerHTML= content;
}



