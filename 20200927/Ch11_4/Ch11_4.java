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
	//Stream �S��
	//���i���ƨϥ�
	//Stream ��k���|�ק�ӷ�
	//Stream ���� Lazy�PTerminal����
	
	//���i���ƨϥ�
	//str.forEach(System.out::println);
	//���|�ק�ӷ�
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
