package edu;

import java.util.ArrayList;

public class Lodowka {
    private  ArrayList<String> products;

    public Lodowka(ArrayList<String> products) {
        this.products = products;
    }

    public Lodowka(){
        products = new ArrayList <>();
    }

    public ArrayList<String> getProducts() {
        return products;
    }


    public void addProduct(String productName){
        products.add(productName);
    }

    public void removeProduct(String productName) throws NoSuchFieldException {
        if (products.contains(productName)){
            products.remove(productName);
        }
        else {
            throw new NoSuchFieldException("Nie ma takiego produktu");
        }

    }

}
