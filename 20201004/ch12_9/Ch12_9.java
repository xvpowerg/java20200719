/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201004;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
public class Ch12_9 {

    //反序列化
    //檔案變物件
    public static void main(String[] args) {
	File file = new File("C:\\MyDir\\name.obj");
	try(FileInputStream fin = new FileInputStream(file);
	  ObjectInputStream objInput = new ObjectInputStream(fin);	){
	  String name = (String)  objInput.readObject();
	  System.out.println(name);
	    //| 左右兩邊不能有繼承關係
	}catch(FileNotFoundException | ClassNotFoundException ex){
	    System.out.println(ex);
	}catch(IOException ex){
	    System.out.println(ex);
	}
	
    }
    
}
