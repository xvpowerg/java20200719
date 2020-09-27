/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20200927;
import java.util.Optional;
public class Teacher {
    private String name;
    private int age;
   
    public Teacher(String name, int age) {
	this.name = name;
	this.age = age;
    }

    public Optional<String> getName() {
	return Optional.ofNullable(name);
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }
    
    public String toString(){
	return getName()+":"+getAge();
    }
    
}
