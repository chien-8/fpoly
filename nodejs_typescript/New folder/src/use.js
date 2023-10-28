import User from "./user.model"

export const signup =async(req,res)=>{
    try {
        const body=req.body
        const check= await User.findOne({email:body.email})
        if(check){
            return res.status(404).json({
                message:"email đã tồn tại"
            })
        }
        const user =await User(body).save()
        return res.status(200).json({
            user
        })
    } catch (error) {
        return res.status(404).json({
            message:"không thể thêm mới"
        })
    }
}