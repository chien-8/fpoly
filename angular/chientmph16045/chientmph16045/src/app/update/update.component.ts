import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import {FormControl,FormGroup, Validators} from "@angular/forms"
import {ActivatedRoute,Router} from "@angular/router"
@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit{
  update:FormGroup
  id:any
  dataOne:any
  constructor(private http:HttpClient,private router: Router,private active:ActivatedRoute){
    this.update=new FormGroup({})
  }
   ngOnInit(): void {
    this.update=new FormGroup({
      "name":new FormControl("",Validators.required),
      "image":new FormControl("",Validators.required),
      "price":new FormControl("",Validators.required),
      "author":new FormControl("",Validators.required),
      "description":new FormControl("",Validators.required)
    })
    this.id=this.active.snapshot.params
    this.http.get<any>("http://localhost:3000/data/"+this.id.id).subscribe(p=>{
      this.dataOne=p
      this.update=new FormGroup({
        "name":new FormControl(this.dataOne.name,Validators.required),
        "image":new FormControl(this.dataOne.image,Validators.required),
        "price":new FormControl(this.dataOne.price,Validators.required),
        "author":new FormControl(this.dataOne.author,Validators.required),
        "description":new FormControl(this.dataOne.description,Validators.required)
      })
    })

   }
   onUpdate(){
    this.http.put<any>("http://localhost:3000/data/"+this.id.id,this.update.value).subscribe(p=>{
      alert("update ok")
      this.router.navigate([""])
    })
   }
   get name(){return this.update.get("name")}
   get image(){return this.update.get("image")}
   get price(){return this.update.get("price")}
   get author(){return this.update.get("author")}
   get description(){return this.update.get("description")}
}
