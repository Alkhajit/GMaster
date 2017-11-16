import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppHome } from './app.home';
import { HelloWorldComponent } from './hello-world/hello-world.component'

const routes: Routes = [
  {path:'helloworld', component: HelloWorldComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
