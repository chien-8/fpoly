import { HttpClient } from '@angular/common/http';
import { Component,OnInit } from '@angular/core';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit{
  data:any
  datalength:any

  ngOnInit(): void {
    
    this.list()
  }
  constructor(private http:HttpClient){}
  list(){
      this.http.get("http://localhost:3000/data").subscribe(p=>{
          this.data=p
          this.datalength=(this.data).length
      })
  }
  remove(id:number){
    if(confirm("ban co chac muon xoa")==true){
      this.http.delete("http://localhost:3000/data/"+id).subscribe(p=>{
          this.list()
       })
    }
     
  }
}
