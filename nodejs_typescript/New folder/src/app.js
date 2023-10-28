import express from "express"
import mongoose from "mongoose";
import morgan from "morgan";
import router from "./router";
import routerUser from "./use.router";
const app=express();
mongoose
    .connect("mongodb://localhost:27017/newtest")
    .then(()=>console.log("kết nối db thành công"))
    .catch((error)=>console.log("kết nối db thất bại",error))
app.use(express.json())
app.use(morgan("tiny"))
app.use("/api",router)
app.use("/api",routerUser)
app.listen(8088,()=>console.log("server is running"))