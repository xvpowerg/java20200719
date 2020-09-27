/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20200927;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch11_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	 ArrayList<String> list = new ArrayList<>();
	 list.add("Howard");
	 list.add("Vivin");
	 list.add("Lindy");
	 list.add("Ken");
	 list.add("Tom");
	 //全部符合條件回傳true
	boolean b1 = 
		list.stream().peek(v->System.out.println("Peek:"+v)).allMatch(n->n.length() >2);
	System.out.println(b1);
	 //其中之一符合條件回傳true
	//list.stream().peek(v->System.out.println(v)).anyMatch(predicate)
	//所有條件都不符合回傳true
	//list.stream().peek(v->System.out.println(v)).noneMatch(predicate)
	 
    }
    
}
