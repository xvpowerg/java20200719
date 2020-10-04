/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201004;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class Ch12_10 {
    
    
    public static void main(String[] args) throws Exception{
	    //要序列化的物件 必須實作Serializable
	Student st1 = new Student("Ken",96);
	File file = new File("C:\\MyDir\\student.obj");
	try(FileOutputStream fout = new FileOutputStream(file);
	   ObjectOutputStream ooput = new ObjectOutputStream(fout);){
	    ooput.writeObject(st1);
	}
    }
    
}
