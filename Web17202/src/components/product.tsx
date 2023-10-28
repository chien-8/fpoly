import { useEffect } from "react"
import { useSelector } from "react-redux"
import { deleteProduct, fetchProduct } from "../slice/product"
import { useAppDispatch } from "../store/hook"
import { Link } from "react-router-dom"
import { RootState } from "../store/silce"
import { useDeleteProductsMutation, useGetProductsQuery } from "../service/product"
import { IProduct } from "../interface/product"



const ProductList = () => {
    // const { value: product } = useSelector((state: RootState) => state.product)
    // const dispatch = useAppDispatch()
    // useEffect(() => {
    //     dispatch(fetchProduct())
    // }, [])
    // const remove = (id: any) => {
    //     dispatch(deleteProduct(id))
    // }

    const {data:product,isLoading,error} =useGetProductsQuery()
    
    const [deleteProduct,result]=useDeleteProductsMutation()
    const remove=(id:any)=>{
        deleteProduct(id)
    }
    return <>
        <Link to="add">add</Link>
        <table>
            <thead>
                <tr>
                    <td>stt</td>
                    <td>name</td>
                    <td>price</td>
                    <td>description</td>
                    <td>action</td>
                </tr>
            </thead>
            <tbody >
                {product?.map((item:IProduct,index)=>(
                    <tr key={index}>
                        <td>{index+1}</td>
                        <td>{item.name}</td>
                        <td>{item.price}</td>
                        <td>{item.description}</td>
                        <td>
                            <button><Link to={`update/${item.id}`}>update</Link></button>
                            <button onClick={()=>remove(item.id)}>remove</button>
                        </td>
                    </tr>
                ))}
            </tbody>
        </table>
    </>
}



export default ProductList