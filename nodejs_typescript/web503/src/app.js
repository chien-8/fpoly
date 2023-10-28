import express from "express";
import morgan from "morgan";
import productRouter from "./routes/product.route";
import mongoose from "mongoose";
import authRouter from "./routes/auth.route";
const app = express();


mongoose
    .connect("mongodb://localhost:27017/web17201")
    .then(()=>console.log("kết nối db thành công"))
    .catch((error)=>console.log("kết nối db thất bại",error))
app.use(express.json());
app.use(morgan("tiny"));

app.use("/api", productRouter);
app.use("/api", authRouter);
app.listen(8080, () => {
    console.log("Server is running on port 8080");
});