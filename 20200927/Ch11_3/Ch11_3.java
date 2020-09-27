/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20200927;
import java.util.function.Function;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Ch11_3 {
//��k�x��
    static <N,R> R test1(N v,Function<N,R> f){
	return f.apply(v);
    }
    //1 �ڪ�List�Ʊ�O��� ����:�Ҧ����ƪ��~�^��
    //2 �ڪ�List�Ʊ�O�ۦ� ����:�Ҧ����פj��3�~�^��
    static <T> List<T> filter(List<T> list,Predicate<T> p){
	List<T> result = new ArrayList<>();
	for(T v : list){
	  if (p.test(v)){
	      result.add(v);
	  }
	}
	return result;
    }
    public static void main(String[] args) {
	// TODO code application logic here
	String msg =  test1(100,(v)->{
	     return "price:"+v;
	 });	
	System.out.println(msg);
	//�Q�ΥH�U��O�h���w�x��
	String msg2 =  Ch11_3.<Float,String>test1(
		26.5F,(v)->{return "price:"+v;
	 });
	System.out.println(msg2);
	
	List<Integer> myList = new ArrayList();
	myList.add(10);
	myList.add(19);
	myList.add(5);
	myList.add(12);
	myList.add(40);
	
	myList = filter(myList,(v)->v % 2 ==0);
	System.out.println(myList);
	
	List<String> myList2 = new ArrayList();
	myList2.add("Ken");
	myList2.add("Vivin");
	myList2.add("Lindy");
	myList2.add("Join");
	myList2.add("Lucy");
	myList2 = filter(myList2,(v)->v.length() > 3);
	System.out.println(myList2);
    }
    
}

