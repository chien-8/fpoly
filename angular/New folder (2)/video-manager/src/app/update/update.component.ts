import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit{
  onupdate: FormGroup
  id:any
  dataOne:any
  constructor(private http:HttpClient,private router:Router,private Activate:ActivatedRoute){
    this.onupdate=new FormGroup({})
  }
  ngOnInit(): void {
    this.id=this.Activate.snapshot.params
    console.log(this.id.id)
    this.http.get("http://localhost:3000/video/"+this.id.id).subscribe(p=>{
      this.dataOne=p
      console.log(this.dataOne)
      this.onupdate=new FormGroup({
        "name":new FormControl(this.dataOne.name,Validators.required),
        "image":new FormControl(this.dataOne.image,Validators.required),
        "url":new FormControl(this.dataOne.url,Validators.required),
        "description":new FormControl(this.dataOne.description,Validators.required),
        "view":new FormControl(this.dataOne.view,Validators.required)
      })
    })

    this.onupdate=new FormGroup({
      "name":new FormControl(null,Validators.required),
        "image":new FormControl(null,Validators.required),
        "url":new FormControl(null,Validators.required),
        "description":new FormControl(null,Validators.required),
        "view":new FormControl(null,Validators.required)
    })
  }
  
  
  onSubmit(){
      this.http.put("http://localhost:3000/video/"+this.id.id,this.onupdate.value).subscribe(p=>{

      })
  }
}
