/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201004;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author xvpow
 */
public class Ch12_11 {

    public static void main(String[] args) throws Exception{
	File file = new File("C:\\MyDir\\student.obj");
	try(FileInputStream fin = new FileInputStream(file);
	    ObjectInputStream objIn = new ObjectInputStream(fin);){
	    Student st = (Student) objIn.readObject();
	    System.out.println(st);
    }
	
    }
    
}
