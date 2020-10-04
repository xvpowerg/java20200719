/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201004;
import java.io.Serializable;
public class Student implements Serializable{
    private String name;
    private int score;

    public Student(String name, int score) {
	this.name = name;
	this.score = score;
    }
    
    @Override
    public String toString() {
	return "Student{" + "name=" + name + ", score=" + score + '}';
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getScore() {
	return score;
    }

    public void setScore(int score) {
	this.score = score;
    }
    
    
}
