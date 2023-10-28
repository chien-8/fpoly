import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit{
  signup:FormGroup
  constructor(private http:HttpClient,private router:Router){
    this.signup=new FormGroup({})
  }
  ngOnInit(): void {
    this.signup=new FormGroup({
      "email":new FormControl("",Validators.required),
      "pass":new FormControl("",Validators.required),
    })
    
  }
  onSignup(){
    this.http.post<any>("http://localhost:3000/signup",this.signup.value).subscribe(p=>{
      alert("dang ky thanh cong")
      this.router.navigate(["/login"])
    })
  }
  get email(){return this.signup.get("email")}
  get pass(){return this.signup.get("pass")}
}
