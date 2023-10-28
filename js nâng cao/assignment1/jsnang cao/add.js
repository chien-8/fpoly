import  { LocalStorageService} from './my-app/service.js';



var menu = [
    {name: "Phở bò", price: 40000, amount: 10},
    {name: "Bún chả", price: 40000, amount: 10},
]

LocalStorageService.set("menu", menu)
console.log(LocalStorageService.get('menu'));


// test("đây là file add.js")
// var form =document.querySelector("#form");
// var image =document.querySelector("#image");
// var name =document.querySelector("#name");
// var amount=document.querySelector("#amount");
// var price =document.querySelector("#price");
// var type =document.querySelector("#type");
// var description =document.querySelector("#description");

// // validate form
// var fields = ["name","price","amount","description","type","image"]
// form.onsubmit=function(e){
//     e.preventDefault();
//     var error=false;
//     var data={};
//     // fields.forEach(function(item){
//     //     clearError(item);
//     // })
//     fields.forEach(function(item){
//         var field=document.querySelector("#"+item)
//         if(field.value==""){
//             showError(item,"không được để trống!");
//             error=true;
//         }else{
//             showError(item,"");
//         }
//     })
//     if(!error){
//         var menu = localStorageService.get("menu")
//         if(menu){
//             menu.push(data)
//         }else{
//             menu=[data]
//         }
//         localStorageService.get("menu",menu)
//     }
    
// }
// function showError(id, content) {
//     var element = document.querySelector("#" + id)
//     element.nextElementSibling.innerHTML = content;
// }

// function clearError(id) {
//     var element = document.querySelector("#" + id)
//     element.nextElementSibling.innerHTML = ""
// }