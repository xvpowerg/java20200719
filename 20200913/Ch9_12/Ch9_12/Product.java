/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20200913;

/**
 *
 * @author xvpow
 */
public class Product {
    private String name;
    private int price;
    private int location;
    
    public Product(String name,int price,int location){
	this.name = name;
	this.price = price;
	this.location = location;
    }
    public String getName(){
	return name;
    }
    public int getPrice(){
	return price;
    }
    public int getLocation(){
	return location;
    }
    
    public String toString(){
	return name+":"+price+":"+location;
    }
    
}
