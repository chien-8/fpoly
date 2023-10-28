import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { IVideo } from '../interface/data';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent  implements OnInit{
  
  onadd:FormGroup
  constructor(private http:HttpClient,private router:Router){
    this.onadd= new FormGroup({})
  }
  ngOnInit(): void {
    this.onadd= new FormGroup({
      "name": new FormControl(null,Validators.required),
      "image": new FormControl(null,Validators.required),
      "url": new FormControl(null,Validators.required),
      "description": new FormControl(null,Validators.required),
      "view": new FormControl(null,Validators.required)
    })
  }
  
  onSubmit(){

    this.http.post<IVideo>("http://localhost:3000/video/",this.onadd.value).subscribe(p=>{})
    this.router.navigate(["/"])
  }
}
