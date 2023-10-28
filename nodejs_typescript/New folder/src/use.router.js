import express from "express"
import { signin, signup } from "./use";

const routerUser=express.Router();
 
// routerUser.post("/signin",signin)
routerUser.post("/signup",signup)

export default routerUser