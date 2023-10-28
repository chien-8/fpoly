import { getAll } from "./api/products"

const addmin={
    async render(){
        const productList= (await getAll()).data;
        console.log(productList);
        return /* html */`
            <div>
                <a href="./products/add">thêm mới</a>
                 <table>
                    <thead>
                        <tr>
                            <td>stt</td>
                            <td>tên</td>
                            <td>ảnh</td>
                            <td>content</td>
                            <td>hành động</td>
                        </tr>
                    </thead>
                    <tbody>
                        ${productList.map((item,index)=>{
                            return `
                                <tr>
                                    <td>${index+1}</td>
                                    <td>${item.title}</td>
                                    <td><img src="${item.image}"></td>
                                    <td>${item.content}</td>
                                    <td>
                                        <a href="./products/${item.id}/update">sửa</a>
                                        <a href="">xóa</a>
                                    </td>
                                </tr>
                            `
                        }).join("")}
                    </tbody>
                 </table>
             
            </div>
        `
    }
}

export default addmin