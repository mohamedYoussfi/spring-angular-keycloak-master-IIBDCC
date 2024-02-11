import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ProductsComponent} from "./ui/products/products.component";
import {CustomersComponent} from "./ui/customers/customers.component";
import {AuthGuard} from "./guards/auth.guard";
import {OrdersComponent} from "./ui/orders/orders.component";
import {OrderDetailsComponent} from "./ui/order-details/order-details.component";

const routes: Routes = [
  {path : "products", component : ProductsComponent, canActivate : [AuthGuard], data : {roles :['ADMIN']}},
  {path : "customers", component : CustomersComponent, canActivate : [AuthGuard], data : {roles : ['USER']}},
  {path : "orders", component : OrdersComponent, canActivate : [AuthGuard], data : {roles : ['USER']}},
  {path : "order-details/:id", component : OrderDetailsComponent, canActivate : [AuthGuard], data : {roles : ['USER']}},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
