package edu;

import java.util.ArrayList;

public class Lodowka {
    ArrayList<String> products = new ArrayList <>();

    public void addProduct(String productName){
        products.add(productName);
    }

    public void removeProduct(String productName){
        products.remove(productName);
    }

}
