/*Service is mapped to Backend's Controller class (Rest Api)
It is providing following services for now:
1.Get all product list
2.Create a New Product
3.Delete a Product
4.Update a Product
In next Phase: TODO:::   1.Search
*/


import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import {Product} from './product';

@Injectable({
  providedIn: 'root'
})
export class FetchService {
  product:Product = new Product();

  private baseUrl = 'http://localhost:1136/product/';  
  
  constructor(private http:HttpClient) { }

  getProductList():Observable<any>{
    return this.http.get(`${this.baseUrl}`);
  }

  createProduct(product: object):Observable<object>{
    return this.http.post(`${this.baseUrl}new`, product);
  }

  deleteProduct(id: number): Observable<any>{
    return this.http.delete(`${this.baseUrl}delete/${id}`, { responseType: 'text'});
  }

 

  updateProduct(value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}update`,value);
  }

  setProduct(product:Product)
  {
    this.product = product;
  }
  getProduct():Product
 {
   return this.product;   
 }
 
}
