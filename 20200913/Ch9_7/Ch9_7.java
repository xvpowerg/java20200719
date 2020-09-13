/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20200913;
import java.util.HashSet;

public class Ch9_7 {

    public static void main(String[] args) {
	//Set 結構
	//Set 內容不可重複　無法使用index取值
	//Set 查詢速度比List好
	/*HashSet<Integer> set = new HashSet<>();
	set.add(95);
	set.add(15);
	set.add(700);
	set.add(15);
	set.add(81);
	set.add(62);
	set.forEach(System.out::println);*/
	
	Student st1 = new Student("Ken",20);
	Student st2 = new Student("Vivin",70);
	Student st3 = new Student("Lindy",84);
	Student st4 = new Student("Vivin",70);
	
	//HashSet 判定是否相等順序是
	//hashCode
	//equals
	HashSet<Student> set2 = new HashSet<>();
	set2.add(st1);
	set2.add(st2);
	set2.add(st3);
	set2.add(st4);
	
	set2.forEach(System.out::println);
    }
    
}
