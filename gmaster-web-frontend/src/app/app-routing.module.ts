import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppHome } from './app.home';
import { HelloWorldComponent } from './hello-world/hello-world.component'
import {RaceListComponent } from './race-list/race-list.component'

const routes: Routes = [
  {path:'helloworld', component: HelloWorldComponent},
  {path:'races', component: RaceListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
