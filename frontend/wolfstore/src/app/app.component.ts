import {Component, inject, OnInit} from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {Product} from './model/product';
import {ProductsService} from './services/products.service';
import {CurrencyPipe, NgForOf} from '@angular/common';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, CurrencyPipe, NgForOf],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent implements OnInit {

  title = 'WOLFSTORE';
  release_date: string = '31/03/2025 23:01';

  products: Product[] = [];

  productService = inject(ProductsService);

  ngOnInit() {
    this.loadProducts();
  }

  private loadProducts() {

    this.productService.getProducts().subscribe(data => {
      this.products = data;
      console.log(this.products);
    });


  }

}











