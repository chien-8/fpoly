import User from "../models/user"
import Jwt from "jsonwebtoken"

export const signup=async(req,res)=>{
    try {
        const body= req.body;

        const exisUser=await User.findOne({email:body.email})
        if(exisUser){
            return res.status(404).json({
                message:"email đã tồn tại"
            });
        }
        const user= await new User(body).save();
        return res.status(200).json({
            data:user,
        });
    } catch (error) {
        res.status(404).json({
            message:"không thể thêm mới user"
        })
    }
}

export const signin =async (req,res)=>{
    try {
        const body=req.body;
        console.log(body)
        const user= await User.findOne({email:body.email});
        // check email có tồn tại hay không
        if(!user){
            return res.status(404).json({
                message:"email không tồn tại"
            });
        }
        
        console.log("authenticate",user.authenticate(body.password));
        // check mật khẩu

        if(!user.authenticate(body.password)){
            return res.status(404).json({
                message:"mật khẩu không chính xác"
            })
        }


        const token=Jwt.sign({_id:user._id},"123456");

        // user.password=undefined;

        return res.status(200).json({
            data:user,
            accessToken:token,
        })
    } catch (error) {
        
    }
}


