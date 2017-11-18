import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {MatTableModule, MatTableDataSource} from '@angular/material/table';

@Component({
  selector: 'app-race-list',
  templateUrl: './race-list.component.html',
  styleUrls: ['./race-list.component.css']
})
export class RaceListComponent implements OnInit {
  public list: any
  public dataSource;
  public displayedColumns;
  constructor(private http: HttpClient) { 
    this.displayedColumns = ['name','description']
  }

  ngOnInit() {
    this.http.get('/api/races').subscribe(
      data =>{
        this.list = data;
        this.dataSource = new MatTableDataSource<Race>(this.list as Race[])
      }
    )
  }

}

export interface Race {
  name: String,
  description: String
}
