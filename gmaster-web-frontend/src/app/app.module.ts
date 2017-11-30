import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpModule } from '@angular/http'
import { HttpClientModule }from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { MatCardModule } from '@angular/material/card';
import {MatTableModule} from '@angular/material/table';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import { InputTextModule } from 'primeng/primeng'

import { AppHome } from './app.home';
import { HelloWorldComponent } from './hello-world/hello-world.component';
import { MainMenuComponent } from './main-menu/main-menu.component';
import { RaceListComponent } from './race-list/race-list.component';
import { CharacterSheetComponent } from './character-sheet/character-sheet.component';
import { CsheaderComponent } from './character-sheet/csheader/csheader.component';
import { CharacterService } from './character-sheet/character-service/character.service';
import { AbilitiesComponent } from './character-sheet/abilities/abilities.component';
import { AbilityComponent } from './character-sheet/abilities/ability/ability.component';

@NgModule({
  declarations: [
    AppHome,
    HelloWorldComponent,
    MainMenuComponent,
    RaceListComponent,
    CharacterSheetComponent,
    CsheaderComponent,
    AbilitiesComponent,
    AbilityComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    HttpClientModule,
    MatTableModule,
    MatInputModule,
    MatCardModule,
    InputTextModule,
    MatFormFieldModule,
    ],
  providers: [CharacterService],
  bootstrap: [AppHome]
})
export class AppModule { }
