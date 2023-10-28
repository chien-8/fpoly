// api get image
function getImageCallback(url, cb) {
    fetch(url).then(function (res) {
        cb(res)
    })
}

function renderImage(selector, value) {
    document.querySelector(selector).src = value
}

getImageCallback('https://picsum.photos/400/300', function (res) {
    // anonymous function
    console.log(res, 'resssssssssss');
    renderImage("#image1", res.url)

})
// Thực hiện getImage2 => Sau khi ảnh 1 được load xong thì ảnh 2 mới được load
// function getImage2(url,cb2){
//     fetch(url).then(function(res2){
//         cb2(res2)
//     })     
// }
// getImage2('https://picsum.photos/400/300',function(res2){
//     // console.log(res2,'resssssssssss');
//     setTimeout(function(){
//         renderImage("#image2",res2.url)
//     },2000)
// });
// ảnh kích thước to hơn thì lo
// nested callback
getImageCallback('https://picsum.photos/1400/800', function (res) {
    // anonymous function
    renderImage("#image1", res.url)
    getImageCallback('https://picsum.photos/400/300', function (res) {
        renderImage("#image2", res.url)
    })
})

