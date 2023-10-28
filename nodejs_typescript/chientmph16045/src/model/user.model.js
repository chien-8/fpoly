import mongoose from "mongoose";
import { createHmac } from "crypto";
const UserShema=mongoose.Schema({
    email:String,
    password:String
})
UserShema.methods={
    authenticate(password){
        return this.password ===this.createHmacUser(password)
    },
    createHmacUser(password){
        if(!password) return "";
        return createHmac("sha256","123456").update(password).digest("hex")
    }
}
UserShema.pre("save",function(next){
    this.password =this.createHmacUser(this.password);
    next()
}
)
export default mongoose.model("User",UserShema)