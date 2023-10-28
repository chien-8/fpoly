import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{
  login:FormGroup
  data:any
  constructor(private http:HttpClient,private router:Router){
    this.login=new FormGroup({})
  }
  ngOnInit(): void {
    this.login=new FormGroup({
      "email":new FormControl("",Validators.required),
      "pass":new FormControl("",Validators.required),
    })
    
  }
  onLogin(){
    this.http.get<any>("http://localhost:3000/signup").subscribe(p=>{
      this.data=p
      const user =this.data.find((a:any)=>{
        return a.email ===this.login.value.email && a.pass === this.login.value.pass
      })
      if(user){
        alert("dang nhap thanh cong")
        this.router.navigate([""])
      }else{
        alert("dang nhap that bai")
        this.router.navigate(["/login"])
      }
    })
  }

  get email(){return this.login.get("email")}
  get pass(){return this.login.get("pass")}
}
