import mongoose from "mongoose";

const productcShema = mongoose.Schema({
    name:String,
    price:Number,
    description:String
})
export default mongoose.model("Baithi",productcShema)