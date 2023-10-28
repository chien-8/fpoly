import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { IVideo } from '../interface/data';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit{
  constructor(private http:HttpClient){}
  data:any
  ngOnInit(): void {
    this.getList()
  }
  getList(){
    this.http.get<IVideo>("http://localhost:3000/video").subscribe(p=>{
      this.data=p
    })
  }
  ondelete(id:number){
    this.http.delete("http://localhost:3000/video/"+id).subscribe(p=>{
      this.getList()
    })
  }
  

}
