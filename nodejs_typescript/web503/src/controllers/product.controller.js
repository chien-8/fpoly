
import Product from "../models/product"

// const products = [
//     { id: 1, name: "Product 1" },
//     { id: 2, name: "Product 2" },
// ];

export const list = async (req, res) => {
    try{
        const product=await Product.find();
        return res.status(200).json({
            data:product,
        })
    }catch (error){
        res.status(404).json({
            message:error
        })
    }
    
};
export const read = async(req, res) => {
    try {
        const id = req.params.id;
        const product = await Product.findOne({_id:id});
        return res.status(200).json({
            data:product,
        })
    } catch (error) {
        res.status(400).json({
            message: "Product not found",
        });
    }
};
export const add = async (req, res) => {
    //mongoose
    try{
        const body=req.body;
        const products =await new Product(body).save();
        return res.status(200).json({
            products,
        });
    }catch (error){
        res.status(404).json({
            message:"không thể thêm mới sản phẩm"
        })
    }

    // try {
    //     const product = req.body;
    //     products.push(product);
    //     res.json(product);
    // } catch (error) {
    //     res.status(400).json({
    //         messsage: "Không thêm được sản phẩm",
    //     });
    // }
};
export const update = async (req, res) => {
    console.log("update controller");
    const id = req.params.id;
    const body=req.body;
    const newProducts =await Product.findOneAndUpdate({_id:id},body,{new:true});
    res.status(200).json({newProducts})

    // const product = req.body;

    // Tìm sản phẩm trong mảng, và cập nhật ( nếu cùng ID ngược lại thì bỏ qua)
    // const newProducts =await product.findOneAndUpdate((item) => (item.id == id ? product : item));

    // Tìm sản phẩm trong mảng mới, và trả về
    // const currentProduct = newProducts.find((item) => item.id == id);
    // res.json(currentProduct);
};
export const remove = async (req, res) => {
    try{
        const id = req.params.id;
        const product= await Product.findByIdAndDelete({_id:id});
        return res.status(200).json({
            data:product,
        })
    }catch(error){
        res.status(404).json({
            message:"xóa không thành công"
        })
    }
    // trả về 1 mảng mới, không bao gồm sản phẩm có id gửi lên
    // res.json(products.filter((item) => item.id != id));
};