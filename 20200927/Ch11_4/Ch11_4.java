/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20200927;
import java.util.stream.Stream;
import java.util.ArrayList;
public class Ch11_4 {
    public static void main(String[] args) {
	    
	 //Stream<String> str = Stream.of("Ken","Vivin","Lindy","Join");
	 //str.forEach(System.out::println);
	//Stream 特性
	//不可重複使用
	//Stream 方法不會修改來源
	//Stream 分為 Lazy與Terminal類型
	
	//不可重複使用
	//str.forEach(System.out::println);
	//不會修改來源
	 ArrayList<String> list = new ArrayList<>();
	 list.add("Howard");
	 list.add("Vivin");
	 list.add("Lindy");
	 list.add("Ken");
	 list.add("Tom");
	 list.stream().filter(v->v.length() >3).forEach(System.out::println);
	 System.out.println(list.size());
    }
    
}
