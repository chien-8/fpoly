import { HttpClient } from '@angular/common/http';
import { Component,OnInit } from '@angular/core';
import {FormGroup,FormControl} from "@angular/forms"
import { ActivatedRoute, Router } from '@angular/router';
import { Test } from '../interface/test';
@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit{
  id:any
  update:FormGroup
  dataOne:any
  constructor(private http:HttpClient,private router:Router,private active:ActivatedRoute){
    this.update= new FormGroup({})
  }
  ngOnInit(): void {
    this.id=this.active.snapshot.params
    console.log(this.id)
    this.http.get<Test>("http://localhost:3000/test/"+this.id.id).subscribe(p=>{
      this.dataOne=p
      console.log(this.dataOne.name)
      this.update = new FormGroup({
         "name":new FormControl(this.dataOne.name),
         "price":new FormControl(this.dataOne.price),
         "descriprion":new FormControl(this.dataOne.descriprion),
      })
    })
    this.update= new FormGroup({
      "name":new FormControl(),
      "price":new FormControl(),
      "descriprion":new FormControl(),
    })
  }
  onUpdate(){
    this.http.put("http://localhost:3000/test/"+this.id.id,this.update.value).subscribe(p=>{
      this.router.navigate(["/"])
    })
  }
}
