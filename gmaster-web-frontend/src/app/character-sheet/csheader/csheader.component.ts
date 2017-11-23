import { Component, OnInit, Input } from '@angular/core';
import { HttpClient } from '@angular/common/http/src/client';
import { Character } from '../character-service/character.service';
import {MatInputModule} from '@angular/material/input'
@Component({
  selector: 'app-csheader',
  templateUrl: './csheader.component.html',
  styleUrls: ['./csheader.component.css']
})
export class CsheaderComponent implements OnInit {

  @Input() character: Character
  constructor() { }

  ngOnInit() {
   
  }

}
