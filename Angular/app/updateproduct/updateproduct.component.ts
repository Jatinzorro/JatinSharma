/*This Component is redirected from the VIEW component(Update Button)
This TS file is taking data from the form of its HTML Code and Subscribing it to Service(fetch.service) */




import { Component, OnInit, ViewChild } from '@angular/core';
import { NgForm} from '@angular/forms';  
import { Product } from '../product';
import {FetchService} from '../fetch.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-updateproduct',
  templateUrl: './updateproduct.component.html',
  styleUrls: ['./updateproduct.component.css']
})
export class UpdateproductComponent implements OnInit {

  @ViewChild("#formdata")
  form:NgForm;

  constructor(private service:FetchService) { }

  product:Product = new Product();

  ngOnInit(): void {
    this.product= this.service.getProduct();
  }

 updateProduct()
 {
   this.service.updateProduct(this.product).subscribe(data=>
    {
      alert("updated successfully");
    },
    error=>
    {
      alert("can't update");
      console.log("error occured", error);
    })
 }
}
