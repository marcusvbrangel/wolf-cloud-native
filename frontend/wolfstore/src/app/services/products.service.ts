import {inject, Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Product} from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  // httpClient = inject(HttpClient)

  constructor(private httpClient: HttpClient) { }

  // kubectl exec -it wolfstore-frontend-deployment-6b9858bf59-4vxp5 -- curl http://wolfstore-backend-service:8096/api/v1/products
  // kubectl exec -it wolfstore-frontend-deployment-6b9858bf59-4vxp5 -- curl http://10.106.136.1:8096/api/v1/products

  getProducts():Observable<Product[]> {
    // const url = 'http://localhost:8080/api/v1/products';
    // const url = 'http://wolfstore-backend-service:8096/api/v1/products'
    const url = 'http://10.106.136.1:8096/api/v1/products';
    // const url = 'http://wolfstore.backend.ingress/api/v1/products';
    return this.httpClient.get<Product[]>(url);
  }



}
