import { getAll } from "./api"

const homepage={
    async render(){
        const products = (await getAll()).data
        return /*html*/`
             <div class="container">
                <div class="product_list">
                    ${products.map((item)=>{
                        return `
                            <div class="product_l">
                                <img src="${item.image}" alt="">
                                <a>${item.title}</a>
                                <p>${item.content}</p>
                            </div>
                        `
                    }).join("")}
                </div>

             </div>
        `
    }
}
export default homepage