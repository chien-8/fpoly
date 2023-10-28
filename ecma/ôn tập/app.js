var table = document.querySelector("#table");

function getsp(){
    return fetch("http://localhost:3000/ontap").then(function(res){
        return res.json()
    })
}

getsp().then(function(result){
    render(result);
})

function render(data){
    if(data){
        var content="";
        data.forEach(function(sp,index) {
            
            content+=`
               <tr>
                   <td>${index+1}</td>
                   <td>${sp.name}</td>
                   <td>${sp.price}</td>
                   <td>${sp.type}</td>
                   <td><img src="${sp.image}" alt=""></td>
                   <td>
                       <a href="./update/update.html?id=${sp.id}">sửa</a>
                   </td>
               </tr>
            
            `
        });
    }
    table.innerHTML=content
}