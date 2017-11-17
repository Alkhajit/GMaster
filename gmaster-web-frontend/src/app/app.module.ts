import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpModule } from '@angular/http'
import { HttpClientModule }from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppHome } from './app.home';
import { HelloWorldComponent } from './hello-world/hello-world.component';
import { MainMenuComponent } from './main-menu/main-menu.component';
import { RaceListComponent } from './race-list/race-list.component';

@NgModule({
  declarations: [
    AppHome,
    HelloWorldComponent,
    MainMenuComponent,
    RaceListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule],
  providers: [],
  bootstrap: [AppHome]
})
export class AppModule { }
