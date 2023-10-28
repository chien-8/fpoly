import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import {FormControl,FormGroup, Validators} from "@angular/forms"
import { Router } from '@angular/router';
@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit{
  add:FormGroup
  constructor(private http:HttpClient,private router: Router){
    this.add=new FormGroup({})
  }
   ngOnInit(): void {
    this.add=new FormGroup({
      "name":new FormControl("",Validators.required),
      "image":new FormControl("",Validators.required),
      "price":new FormControl("",Validators.required),
      "author":new FormControl("",Validators.required),
      "description":new FormControl("",Validators.required)
    })
   }
   onAdd(){
    this.http.post<any>("http://localhost:3000/data",this.add.value).subscribe(p=>{
      alert("add new ok")
      this.router.navigate([""])
    })
   }
   get name(){return this.add.get("name")}
   get image(){return this.add.get("image")}
   get price(){return this.add.get("price")}
   get author(){return this.add.get("author")}
   get description(){return this.add.get("description")}
}
