import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {CommonModule} from '@angular/common';
import {HttpModule} from '@angular/http'
import { AppRoutingModule } from './app-routing.module';
import { AppHome } from './app.home';
import { HelloWorldComponent } from './hello-world/hello-world.component';
import { MainMenuComponent } from './main-menu/main-menu.component';

@NgModule({
  declarations: [
    AppHome,
    HelloWorldComponent,
    MainMenuComponent
  ],
  imports: [
    BrowserModule,
  AppRoutingModule],
  providers: [],
  bootstrap: [AppHome]
})
export class AppModule { }
