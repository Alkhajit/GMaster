import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-abilities',
  templateUrl: './abilities.component.html',
  styleUrls: ['./abilities.component.css']
})
export class AbilitiesComponent implements OnInit {
 abilities = [1,2,3]
  constructor() { }

  ngOnInit() {
  }

}
