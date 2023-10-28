

function getresources(id){
    return fetch("http://localhost:3000/resources/"+id).then(function(res){
        return res.json()
    })
}

var queryString=location.search
var parm= new URLSearchParams(queryString)
var id=parm.get('id');
getresources(id).then(function(result){
    document.querySelector("#name").value=result.name;
    document.querySelector("#sale_price").value=result.saleprice;
    document.querySelector("#price").value=result.egularprice;
    document.querySelector("#image").value=result.images;
    document.querySelector("#type").value=result.categories;
    document.querySelector("#description").value=result.description;
    document.querySelector("#form").addEventListener('submit',function(e){
        e.preventDefault();
        var id=result.id;
        var name=document.querySelector("#name").value
        var saleprice=document.querySelector("#sale_price").value
        var egularprice=document.querySelector("#price").value
        var images=document.querySelector("#image").value
        var categories=document.querySelector("#type").value
        var description=document.querySelector("#description").value
        var data={id,name,saleprice,egularprice,images,categories,description}
        updateResuor(data).then(function(){
            location.href="../index.html";
        })
    })
})

function updateResuor(data){
    return fetch('http://localhost:3000/resources/'+data.id,{
        method:"PUT",
        headers:{
            "Content-Type":"application/json"
        },
        body:JSON.stringify(data)
    })
}