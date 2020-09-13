/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20200913;

/**
 *
 * @author xvpow
 */
public class Student {
    private int age;
    private String name;  
   //假設age一樣 name 也一樣就是同一位學生
   public Student(String name,int age){
	this.age = age;
	this.name = name;
   } 
   public String getName(){
       return this.name;
   }
   public int getAge(){
       return this.age;
   }
   
   public String toString(){
       return this.name+":"+this.age;
   }
   
   public boolean equals(Object obj){
       Student tmpSt = (Student)obj;
       return tmpSt.name.equals(this.name) && tmpSt.age == this.age;
   }
}
