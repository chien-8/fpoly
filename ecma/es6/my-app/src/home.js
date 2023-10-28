import { getAll } from "./api/products"

const HomePage={
    async render(){
        const productList=(await getAll()).data;
        console.log(productList)
        return /*html */ `
             <div class="product-list">  
                ${productList.map((item)=>{
                    return `
                        <div class="item">
                            <img src="${item.image}">
                            <a href="">${item.title}</a>
                            <p>${item.content}</p>
                        </div>
                    `
                }).join("")}


             </div>
        `
    }
}

export default HomePage