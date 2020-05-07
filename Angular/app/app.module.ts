import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddProductComponent } from './add-product/add-product.component';

import { ViewProductComponent } from './view-product/view-product.component';

import { HttpClientModule } from '@angular/common/http';
//import{ MatToolbarModule} from '@angular/material/toolbar';

//import { SortPipe } from './sort.pipe';
import { FormsModule, ReactiveFormsModule  } from '@angular/forms';
import { UpdateproductComponent } from './updateproduct/updateproduct.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
  declarations: [
    AppComponent,
   // SortPipe,
    AddProductComponent,
    ViewProductComponent,
    UpdateproductComponent
   // MatToolbarModule
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
