var table= document.querySelector("#table");

function getsp(){
    return fetch("http://localhost:3000/ontap").then(function(res){
        console.log(res)
        return res.json();
    })
}
getsp().then(function(reult){
    console.log(reult)
    render(reult)
})
function render(data){
    var content="";
    if(data){
        data.forEach(function(ontap,index){
            content +=`
            <tr>
                <td>${index+1}</td>
                <td>${ontap.name}</td>
                <td>${ontap.price}</td>
                <td>${ontap.type}</td>
                <td>
                    <a href="./update/update.html?id=${ontap.id}">sửa</a>
                    <a href="">xóa</a>
                </td>
            </tr>
                
            `
        });
        
    }
    table.innerHTML=content;
}
