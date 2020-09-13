/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20200913;
import java.util.TreeSet;
public class Ch9_8 {
    public static void main(String[] args) {
	//TreeSet 可排序 預設 由小到大 (遞增)
	
	/*TreeSet<Integer> tSte = new TreeSet<>();
	tSte.add(100);
	tSte.add(12);
	tSte.add(16);
	tSte.add(85);
	tSte.add(9);
	tSte.forEach(System.out::println);*/
	
	Student st1 = new Student("Ken",20);
	Student st2 = new Student("Vivin",70);
	Student st3 = new Student("Lindy",84);
	Student st4 = new Student("Vivin",70);
	Student st5 = new Student("Join",20);
	TreeSet<Student> stSte = new TreeSet<>();
	stSte.add(st1);
	stSte.add(st2);
	stSte.add(st3);
	stSte.add(st4);
	stSte.add(st5);
	stSte.forEach(System.out::println);
	
    }
    
}
