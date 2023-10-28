import { HttpClient } from '@angular/common/http';
import { Component,OnInit } from '@angular/core';
import { Test } from '../interface/test';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit{
  
  data:any
  ngOnInit():void{
    this.list()
  }
  constructor(private http:HttpClient){}
  list(){
     this.http.get<Test>("http://localhost:3000/test").subscribe(p=>{
        this.data=p
     })
  }
  
  remove(id:number){
    this.http.delete<Test>("http://localhost:3000/test/"+id).subscribe(p=>{
      this.list()
    })
  }
}
