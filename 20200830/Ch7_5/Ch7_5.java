/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20200830;
import java.util.function.Consumer;
public class Ch7_5 {
//  舊的方式
    static void foreach(MyIterator mit,Consumer<String> consumer){	
	while(mit.hasNext()){
	    consumer.accept(mit.next());
	}	
    }
    public static void main(String[] args) {
	 ItemList its = new ItemList();	
	 its.foreach(System.out::println);
	 //foreach(its,System.out::println);
	 
	MyIterator myitor = 
		MyIterator.createMyIterator("Ken","Vivin","Lindy","Join");
	myitor.foreach(System.out::println);
	MyIterator.
		createMyIterator("Facebook","Google","GitHub","Micsoft").
		foreach(System.out::println);
	
    }
    
}
