/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201004;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Ch12_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//序列化
	//把物件變檔案
	String name = "Ken";
	File file = new File("C:\\MyDir\\name.obj");
	
	try(FileOutputStream fout = new FileOutputStream(file);
	  ObjectOutputStream oout = new ObjectOutputStream(fout);){
	    oout.writeObject(name);
	}catch(FileNotFoundException ex){
	    System.out.println(ex);
	}catch(IOException ex){
	    System.out.println(ex);
	}
	//反序列化
	//把檔案變物件
    }
    
}
