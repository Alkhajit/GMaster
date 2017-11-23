import { Component, OnInit } from '@angular/core';
import { CharacterService, Character } from './character-service/character.service';

@Component({
  selector: 'app-character-sheet',
  templateUrl: './character-sheet.component.html',
  styleUrls: ['./character-sheet.component.css']
})
export class CharacterSheetComponent implements OnInit {
  character: Character
  constructor(private _characterService: CharacterService) { }

  ngOnInit() {
    this._characterService.getCharacter(1)
    .subscribe(
      character => this.character=character)
  }

}
