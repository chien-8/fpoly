import { getOne, remove } from "./api";

const removesp={
    async render(id){
        const products=(await getOne(id)).data;
        const data={
            id:id,
            title:products.title,
            image:products.image,
            content:products.content
        }
        remove(data).then(function(){
            location.assign("http://127.0.0.1:5173/admin")
        })
    }
}
export default removesp