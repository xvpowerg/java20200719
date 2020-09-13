/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20200913;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author xvpow
 */
public class Ch9_11 {

    public static void main(String[] args) {	
	Product p1 = new Product("A1",100,2);
	Product p2 = new Product("A2",50,2);
	Product p3 = new Product("A3",61,2);
	Product p4 = new Product("A2",50,1);
	Product p5 = new Product("A1",60,2);
	Product p6 = new Product("A4",57,3);
	Product p7 = new Product("A4",57,3);
	//comparing 回傳要排序的物件
	//thenComparing 回傳要排序的物件
	// reversed()由大到小 遞減排序
	Comparator<Product> cp =
		Comparator.<Product,String>comparing(p->p.getName()).
			thenComparing(p->p.getPrice()).
			thenComparing(p->p.getLocation()).reversed();	
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
