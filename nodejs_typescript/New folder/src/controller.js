import Product from "./model"

export const list=async(req,res)=>{
    try {
        const product= await Product.find()
        return res.status(200).json({
            product
        })
    } catch (error) {
        res.status(404).json({
            message:"error"
        })
    }
}
export const add=async(req,res)=>{
    try {
        const body=req.body
        const product= await Product(body).save()
        return res.status(200).json({
            product
        })
    } catch (error) {
        res.status(404).json({
            message:"error"
        })
    }
}
export const update=async(req,res)=>{
    try {
        const id=req.params.id
        const body=req.body
        const product= await Product.findOneAndUpdate({_id:id},body,{new:true})
        return res.status(200).json({
            product
        })
    } catch (error) {
        res.status(404).json({
            message:"error"
        })
    }
}
export const remove=async(req,res)=>{
    try {
        const id=req.params.id
        const product= await Product.findOneAndRemove(({_id:id}))
        return res.status(200).json({
            product
        })
    } catch (error) {
        res.status(404).json({
            message:"error"
        })
    }
}
export const read=async(req,res)=>{
    try {
        const id=req.params.id
        const product= await Product.findOne({_id:id})
        return res.status(200).json({
            product
        })
    } catch (error) {
        res.status(404).json({
            message:"error"
        })
    }
}