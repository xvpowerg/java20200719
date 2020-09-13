/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20200913;
import java.util.ArrayList;
public class Ch9_5 {

    public static void main(String[] args) {
	Student st1 = new Student("Ken",20);
	Student st2 = new Student("Vivin",70);
	Student st3 = new Student("Lindy",84);
	Student st4 = new Student("Vivin",70);
	//1 請幫我把 st1 st2 st3 放到 ArrayList
	ArrayList<Student> list = new ArrayList<>();
	list.add(st1);
	list.add(st2);
	list.add(st3);
	//無移除的原因 因為st2 跟 st4 equals不相同
	System.out.println(st2.equals(st4));
	//list 的remove是比較 equals 如果為true就移除
	list.remove(st4);
	//2 幫我印出 所有學生的資料 
	list.forEach(System.out::println);
    }
    
}
