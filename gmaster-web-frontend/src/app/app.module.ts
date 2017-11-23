import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpModule } from '@angular/http'
import { HttpClientModule }from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatTableModule} from '@angular/material/table';
import {MatInputModule} from '@angular/material/input';
import { AppHome } from './app.home';
import { HelloWorldComponent } from './hello-world/hello-world.component';
import { MainMenuComponent } from './main-menu/main-menu.component';
import { RaceListComponent } from './race-list/race-list.component';
import { CharacterSheetComponent } from './character-sheet/character-sheet.component';
import { CsheaderComponent } from './character-sheet/csheader/csheader.component';
import { CharacterService } from './character-sheet/character-service/character.service';

@NgModule({
  declarations: [
    AppHome,
    HelloWorldComponent,
    MainMenuComponent,
    RaceListComponent,
    CharacterSheetComponent,
    CsheaderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
  MatTableModule,MatInputModule,BrowserAnimationsModule],
  providers: [CharacterService],
  bootstrap: [AppHome]
})
export class AppModule { }
