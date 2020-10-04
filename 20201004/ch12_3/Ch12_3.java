/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201004;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class Ch12_3 {
    //InputStream
    //OutputStream
    
    public static void main(String[] args) {
	File file = new File("C:\\MyDir\\msg.txt");
	//是否存在
	System.out.println(file.exists());
	//是否為目錄
	System.out.println(file.isDirectory());
	//是否為檔案
	System.out.println(file.isFile());
	try{
	    InputStream in = new FileInputStream(file);
	    
	}catch(FileNotFoundException fex){
	    System.out.println(fex);
	}
	
	
    }
    
}
