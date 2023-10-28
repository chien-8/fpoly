var table=document.querySelector("#table");

function getresources(){
    return fetch("http://localhost:3000/resources").then(function(res){
        return res.json()
    })

}
getresources().then(function(result){
    console.log(result,"sấ")
    render(result);
})

function render(data){
    var content="";
    if(data){
        data.forEach(function(resour) {
            content +=`
                <tr>
                
                    <td>${resour.name}</td>
                    <td>${resour.description}</td>
                    <td>${resour.categories}</td>
                    <td>${resour.images}</td>
                    
                    <td>
                        <a class="hover:text-blue-400" href="./update/update.html?id=${resour.id}">sửa</a>/
                        <a class="hover:text-blue-400" href="./update/update.html?id=${resour.id}">xóa</a>
                     </td>
                    
                </tr>
            `
        });
    }
    table.innerHTML=content;
}