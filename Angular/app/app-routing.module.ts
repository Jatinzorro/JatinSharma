/*In this Routing Module i have done Routing for following components
1.View Product
2.Add Product
3.Update Product*/



import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddProductComponent } from './add-product/add-product.component';
import { ViewProductComponent } from './view-product/view-product.component';
import { UpdateproductComponent } from './updateproduct/updateproduct.component';


const routes: Routes = [
  {path: 'addProduct', component:AddProductComponent},
  {path: 'viewProduct', component:ViewProductComponent},
  {path: 'updateproduct', component:UpdateproductComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingcomponent =[ AddProductComponent,ViewProductComponent,UpdateproductComponent]
