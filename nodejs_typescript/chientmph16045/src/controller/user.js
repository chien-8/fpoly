import User from "../model/user.model"
import  Jwt  from "jsonwebtoken";
export const signup=async(req,res)=>{
    try {
        const body=req.body;
        const check=await User.findOne({email:body.email})
        if(check){
            return res.status(404).json({
                message:"email da ton tai"
            })
        }
        const user= await User(body).save()
        return res.status(200).json({
            user
        })
    } catch (error) {
        return res.status(404).json({
            message:"khong the them moi user"
        })
    }
}

export const signin=async(req,res)=>{
    try {
        const body=req.body;
        const check=await User.findOne({email:body.email})
        if(!check){
            return res.status(404).json({
                message:"email khong dung"
            })
        }
        if(!check.authenticate(body.password)){
            return res.status(404).json({
                message:"sai mat khau"
            })
        }

        const token=Jwt.sign({_id:body.id},"12346")
        return res.status(200).json({
            check,
            token
        })
    } catch (error) {
        return res.status(404).json({
            message:"khon the dang nhap"
        })
    }
}