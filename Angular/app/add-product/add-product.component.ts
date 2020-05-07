/*This component Contains the Add Product Functionality
In this TypeScrip File I have Subscribed the data from the Fetch.Service.*/ 



import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import {FormControl,FormGroup,Validators} from '@angular/forms';  
import { Product } from '../product';
import {FetchService} from '../fetch.service';
@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  constructor(private service: FetchService) { }
  
  product : Product=new Product();  
  submitted = false;  
  
  ngOnInit() {  
    this.submitted=false;  
  }  
  
  productsaveform=new FormGroup({  
    //productId:new FormControl('' , [Validators.required , Validators.minLength(2) ] ), 
    name:new FormControl('' , [Validators.required , Validators.minLength(3) ] ), 
    productQuantity:new FormControl('' , [Validators.required , Validators.maxLength(3) ] ),  
    productMRP:new FormControl(),
    productManufacturer:new FormControl(),
    productSize:new FormControl()
  });  
  
  saveProduct(saveProduct){  
    this.product=new Product();     
    //this.product.productId=this.ProductId.value;
    this.product.name=this.ProductName.value;
    this.product.productQuantity=this.ProductQuantity.value;
    this.product.productMRP=this.ProductMRP.value;
    this.product.productManufacturer=this.ProductManufacturer.value;
    this.product.productSize=this.ProductSize.value;  
    this.submitted = true;  
    this.save();  
  }  
  
    
  
  save() {  
    this.service.createProduct(this.product)  
      .subscribe(data => console.log(data), error => console.log(error));  
    this.product = new Product();  
  }  
  
  //get ProductId(){  
    //return this.productsaveform.get('productId');  
  //}  
  
  get ProductName(){  
    return this.productsaveform.get('name');  
  }  
  
  get ProductQuantity(){  
    return this.productsaveform.get('productQuantity');  
  }  
  
  get ProductMRP(){  
    return this.productsaveform.get('productMRP');  
  }  

  get ProductManufacturer(){  
    return this.productsaveform.get('productManufacturer');  
  }  

  get ProductSize(){  
    return this.productsaveform.get('productSize');  
  }  

   
  
  addProductForm(){  
    this.submitted=false;  
    this.productsaveform.reset();  
  }  
 
}
