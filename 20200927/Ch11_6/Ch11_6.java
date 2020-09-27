/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20200927;

import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch11_6 {

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
	 
//	 Optional<String> anyOpt =  list.parallelStream().findAny();
//	 Optional<String> firstOpt =  list.stream().findFirst();
//	 System.out.println(anyOpt.get());
//	 System.out.println(firstOpt.get());
	 
	  list.stream().limit(3).forEach(System.out::println); //只取三個
	  list.stream().skip(3).forEach(System.out::println); //跳過前三個
	  list.stream().sorted().forEach(System.out::println); //排序
	 
    }
    
}
