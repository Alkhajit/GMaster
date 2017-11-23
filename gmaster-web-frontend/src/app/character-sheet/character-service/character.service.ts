import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/do';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import { HttpErrorResponse } from '@angular/common/http/src/response';

@Injectable()
export class CharacterService {

  constructor(private _http:HttpClient) { 
  }
  
  public getCharacter(id: number):Observable<Character>{
    return this._http.get<Character>('/api/character/'+id)
    .do(data=> console.log(data))
    .catch(this.handleError);
  }
  private handleError(err:HttpErrorResponse){
    console.log(err);
    return Observable.throw(err.message)
  }
}

export interface Character{
  characterName: String,
  characterLevel: Number,
  alignment: String,
  player: String,
  deity: String,
  homeland: String,
  race: String,
  size: String,
  gender: String,
  age: string,
  height: number,
  weight: number,
  hair: string,
  eyes: string
}
