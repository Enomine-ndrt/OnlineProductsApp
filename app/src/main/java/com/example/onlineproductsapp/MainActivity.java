package com.example.onlineproductsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.onlineproductsapp.adapter.ProductAdapter;
import com.example.onlineproductsapp.adapter.ProductCategoryAdapter;
import com.example.onlineproductsapp.model.ProductCategory;
import com.example.onlineproductsapp.model.Products;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ProductCategoryAdapter productCategoryAdapter;
    RecyclerView productCatRecyclerView,productItemRecycler;
    ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<ProductCategory> productCategoryList = new ArrayList<>();
        productCategoryList.add(new ProductCategory(1,"Most Popular"));
        productCategoryList.add(new ProductCategory(2,"All Body Products"));
        productCategoryList.add(new ProductCategory(3,"Skin Care"));
        productCategoryList.add(new ProductCategory(4,"hair"));
        setProductRecyclerView(productCategoryList);

        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(1,"Japanese Cherry Blossom","250 ml","$ 17.00",R.drawable.prod2));
        productsList.add(new Products(2,"African Mango Shower Gel","350 ml","$ 25.00",R.drawable.prod1));
        productsList.add(new Products(1,"Japanese Cherry Blossom","250 ml","$ 17.00",R.drawable.prod2));
        productsList.add(new Products(2,"African Mango Shower Gel","350 ml","$ 25.00",R.drawable.prod1));

        setProdutItemRecycler(productsList);
    }

    private void setProductRecyclerView(List<ProductCategory> productCategoryList){
        productCatRecyclerView = findViewById(R.id.cat_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        productCatRecyclerView.setLayoutManager(layoutManager);
        productCategoryAdapter = new ProductCategoryAdapter(this,productCategoryList);
        productCatRecyclerView.setAdapter(productCategoryAdapter);
    }

    private void setProdutItemRecycler(List<Products> productsList){

        productItemRecycler = findViewById(R.id.product_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        productItemRecycler.setLayoutManager(layoutManager);
        productAdapter = new ProductAdapter(this,productsList);
        productItemRecycler.setAdapter(productAdapter);
    }

}