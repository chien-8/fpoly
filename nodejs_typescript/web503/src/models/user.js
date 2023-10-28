import mongoose from "mongoose";
import {createHmac} from "crypto"
const UserShema=new mongoose.Schema({
    name:{
        type:String,
    },
    password:{
        type:String
    },
    email:{
        type:String,
        minLength:6,
        maxLength:255,
        require:true,
        unique:true
    }
},
{timestamps:true}
);
UserShema.methods={
    authenticate(password){
        console.log("mật khẩu client gửi lên",password);
        console.log("mật khẩu trong database",this.password);
        console.log("mâtj khẩu đã mã hóa",this.ecryptPassword(password));
        return this.password===this.ecryptPassword(password);
    },
    ecryptPassword(password){
        if(!password) return "";
        return createHmac("sha256", "123456").update(password).digest("hex");
    }
}
UserShema.pre("save",function(next){
    this.password=this.ecryptPassword(this.password);
    next();
})

export default mongoose.model("User",UserShema)