package com.example.ulearnshoppinglistspringboot;

import com.example.ulearnshoppinglistspringboot.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private static final List<Product> ProductList = new ArrayList<>();
    private String name;
    private final int id;

    public ShoppingList(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public static void add(String text){
        ProductList.add(new Product(ProductList.size()+1,text));
    }

    public static void add(Product item){
        ProductList.add(item);
    }

    public static void remove(int id){
        ProductList.remove(id-1);
    }

    public static List<Product> getProductList(){
        return ProductList;
    }

    public static Product get(int id){
        return ProductList.get(id-1);
    }

}
