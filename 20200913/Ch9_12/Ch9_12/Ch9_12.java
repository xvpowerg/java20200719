/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20200913;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Comparator;
public class Ch9_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Product p1 = new Product("A1",100,2);
	Product p2 = new Product("A2",50,2);
	Product p3 = new Product("A3",61,2);
	Product p4 = new Product("A2",50,1);
	Product p5 = new Product("A1",60,2);
	Product p6 = new Product("A4",57,3);
	Product p7 = new Product("A4",57,3);
	//作業..............
	System.out.println("1 遞增排序");
	System.out.println("2 遞減排序");
	Scanner scan = new Scanner(System.in);	
	int order = scan.nextInt();
	Comparator<Product> comp = 
		Comparator.<Product,String>comparing(v->v.getName()).
			thenComparing(v->v.getPrice()).
			thenComparing(v->v.getLocation());
	if (order == 2){
	    comp = comp.reversed();
	}
	TreeSet<Product> set = new TreeSet<>(comp);
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
