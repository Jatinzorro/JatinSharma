/*This Component Is Subscribing data from fetch.Service and giving it to View.html So that it can be displayed 
on the screen.
Its Parent Component is root Component*/

import { Component, OnInit } from '@angular/core';
import { FetchService } from '../fetch.service';
import { Product } from '../product';
import {Observable, Subject} from "rxjs";

import { FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-view-product',
  templateUrl: './view-product.component.html',
  styleUrls: ['./view-product.component.css']
})
export class ViewProductComponent implements OnInit {

  constructor(private service:FetchService) { }

  productsArray: any[] =[];

  products:Product[];
  product:Product=new Product();
  deleteMessage=false;
  productlist:any;
  

  ngOnInit() {
    
    this.service.getProductList().subscribe(data =>{
      this.products=data;
    })
  }

  deleteProduct(id: number){
    this.service.deleteProduct(id).subscribe(data=>{
      console.log(data);
      this.deleteMessage=true;
      this.service.getProductList().subscribe(data=>{
        this.products=data;
      })
    },
    error =>console.log(error));
  }

  update(index:number)
  {
     
     this.service.setProduct(this.products[index]);
  }

  

}
