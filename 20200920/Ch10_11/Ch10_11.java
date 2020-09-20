/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20200920;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch10_11 {
    //T extends List 表示 T類型限定為 List
    static class Test<T extends List<V>,V>{
	public void add(T c,V v){
	    c.add(v);
	}
	public void print(T c){
	    c.forEach(System.out::println);
	}
    }	   
    
    public static void main(String[] args) {
	Test<List<String>,String> t1 = new Test();
	ArrayList<String> aList = new ArrayList();
	t1.add(aList, "AA");
	t1.add(aList, "BB");
	t1.print(aList);
    }
    
}
