
import mongoose from "mongoose"


const productShema=mongoose.Schema({
    name:String,
    image:String,
    price:Number,
    description:String
})

export default mongoose.model("Product",productShema)