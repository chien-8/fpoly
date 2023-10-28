import { getAll } from "./api"

const adminsp={
    async render(){
        const products=(await getAll()).data;
        return `
            <a href="/add">them moi</a>
            <table>
                 <thead>
                      <tr>
                        <td>stt</td>
                        <td>name</td>
                        <td>image</td>
                        <td>content</td>
                        <td>hành động</td>
                      </tr>
                 </thead>
                <tbody>
                     ${products.map((item,index)=>{
                        return `
                              <tr>
                                  <td>${index+1}</td>
                                  <td>${item.title}</td>
                                  <td><img src="${item.image}"></td>
                                  <td>${item.content}</td>
                                  <td>
                                       <a href="/update/${item.id}">sửa</a>
                                       <a href="/remove/${item.id}">xóa</a>
                                  </td>
                              </tr>
                        `
                     }).join("")}
                
                </tbody>
            </table>
        `
    }
}

export default adminsp