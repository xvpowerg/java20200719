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
public class Student implements Comparable<Student>{
    private int age;
    private String name;  
   //假設age一樣 name 也一樣就是同一位學生
   public Student(String name,int age){
	this.age = age;
	this.name = name;
   } 
   
   //如果目前數值大於傳入的數值回傳正數
   //如果目前數值小於傳入的數值回傳負數
   //如果目前數值等於傳入的數值回傳0
   
   //比完年齡 比姓名
   public int compareTo(Student st){
       if (age > st.getAge()){
	   return 1;
       }else if(age < st.getAge()){
	   return -1;
       }       
       return name.compareTo(st.getName());
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
   
   public int hashCode(){
       return name.hashCode() + age;
   }
   public boolean equals(Object obj){
       Student tmpSt = (Student)obj;
       return tmpSt.name.equals(this.name) && tmpSt.age == this.age;
   }

}
