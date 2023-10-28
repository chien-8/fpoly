function getDishByID(id) {
    return fetch("http://localhost:3000/dishes/" + id).then(function (res) {
        return res.json()
    })
}

function main(){
    var queryString = location.search
    var param = new URLSearchParams(queryString)
    var id = param.get('id');
    getDishByID(id).then(function (result) {
        document.querySelector("#form1").addEventListener("submit",(e)=>{
            // e.preventDefault();
            delateDish(data).then(function(result){
                location.href="../index.html"
            })
            
        })
    })
}
main();
function delateDish(data){
    return fetch('http://localhost:3000/dishes/'+data.id, {
        method: "DELETE",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    }).then(function (res) {
        return res.json()
    })
}

export {getDishByID,main,delateDish}