/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20200927;

/**
 *
 * @author xvpow
 */
public class Item {
   private  int price;
   private String name;

    public Item(int price, String name) {
	this.price = price;
	this.name = name;
    }

    public int getPrice() {
	return price;
    }

    public void setPrice(int price) {
	this.price = price;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

   public String toString(){
       return name+":"+price;
   }
    public boolean equals(Object obj){
	if (obj == null || obj instanceof Item == false ) return false;
        Item tmp = (Item)obj;		
	return tmp.name.equals(name) && tmp.price == price ;
    }
    public int hashCode(){
	return name.hashCode() + price;
    }
    
}
