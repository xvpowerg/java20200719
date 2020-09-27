/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20200927;

import java.util.ArrayList;
import java.util.stream.IntStream;
public class Ch11_7 {


    public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<>();
	 list.add("Howard");
	 list.add("Vivin");
	 list.add("Lindy");
	 list.add("Ken");
	 list.add("Tom");
	//透過map可轉換成另一種類型
	list.stream().map(n->n.toUpperCase()).forEach(System.out::println);
    
	
	
    }
    
}
