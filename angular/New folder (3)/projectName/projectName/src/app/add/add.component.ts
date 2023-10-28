import { HttpClient } from '@angular/common/http';
import { Component,OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {FormGroup, FormControl} from "@angular/forms"
import { Test } from '../interface/test';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit{
  add:FormGroup
  constructor(private http:HttpClient,private router:Router){
    this.add=new FormGroup({})
  }
  ngOnInit(): void {
    this.add= new FormGroup({
      "name":new FormControl(""),
      "price":new FormControl(""),
      "descriprion":new FormControl("")
    })
  }
  
  onAdd(){
    this.http.post<Test>("http://localhost:3000/test/",this.add.value).subscribe(p=>{
      console.log(p)
    })
    this.router.navigate(["/"])
  }
}
