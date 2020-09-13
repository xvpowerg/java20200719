/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20200913;

import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch9_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	Product p1 = new Product("A1",100,2);
	Product p2 = new Product("A2",50,2);
	Product p3 = new Product("A3",61,2);
	Product p4 = new Product("A2",50,1);
	Product p5 = new Product("A1",60,2);
	Product p6 = new Product("A4",57,3);
	Product p7 = new Product("A4",57,3);
	Comparator<Product> cp = (cp1,cp2)->{
	    int cmp = cp1.getName().compareTo(cp2.getName());
	  if (cmp != 0) return cmp;
	   cmp = cp1.getPrice() - cp2.getPrice();
	  if (cmp == 0) cmp = cp1.getLocation() - cp2.getLocation();
	    return cmp;
	};
	
	TreeSet<Product> set = new TreeSet<>(cp);
	set.add(p1);
	set.add(p2);
	set.add(p3);
	set.add(p4);
	set.add(p5);
	set.add(p6);
	set.add(p7);
	set.forEach(System.out::println);
    }
    
}
