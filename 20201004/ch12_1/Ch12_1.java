/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201004;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch12_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Student st1 = new Student("Ken",70);
	Student st2 = new Student("Lindy",80);
	Student st3 = new Student("Iris",76);
	Student st4 = new Student("Vivin",85);
	Student st5 = new Student("Tom",90);
	Student st6 = new Student("Lucy",98);
	List<Student> list = new ArrayList<>();
	list.add(st1);
	list.add(st2);
	list.add(st3);
	list.add(st4);
	list.add(st5);
	list.add(st6);
	
	
    }
    
}

