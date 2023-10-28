import Baithi  from "../model/books"

export const list =async(req,res)=>{
    try {
        const product= await Baithi.find()
        return res.status(200).json({
            product
        })
    } catch (error) {
        return res.status(404).json({
            message:"error"
        })
    }
}
export const read =async(req,res)=>{
    try {
        const id=req.params.id
        const product= await Baithi.findOne({_id:id})
        return res.status(200).json({
            product
        })
    } catch (error) {
        return res.status(404).json({
            message:"error"
        })
    }
}

export const add =async(req,res)=>{
    try {
        const body=req.body
        const product= await Baithi(body).save()
        return res.status(200).json({
            product
        })
    } catch (error) {
        return res.status(404).json({
            message:"error"
        })
    }
}

export const update =async(req,res)=>{
    try {
        const id=req.params.id
        const body=req.body
        const product= await Baithi.findOneAndUpdate({_id:id},body,{new:true})
        return res.status(200).json({
            product
        })
    } catch (error) {
        return res.status(404).json({
            message:"error"
        })
    }
}
export const remove =async(req,res)=>{
    try {
        const id=req.params.id
        const product= await Baithi.findOneAndDelete({_id:id})
        return res.status(200).json({
            product
        })
    } catch (error) {
        return res.status(404).json({
            message:"error"
        })
    }
}