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
import java.io.IOException;
public class Ch12_3 {
    //InputStream
    //OutputStream
    
    public static void main(String[] args) {
	File file = new File("C:\\MyDir\\msg.txt");
	File target = new File("C:\\MyDir\\msg_copy.txt");
	//是否存在
	System.out.println(file.exists());
	//是否為目錄
	System.out.println(file.isDirectory());
	//是否為檔案
	System.out.println(file.isFile());
	try{
	    InputStream in = new FileInputStream(file);	    
	    OutputStream out = new FileOutputStream(target);
	    //-1表示資料結尾
	    int data = -1;
	    
	    while( (data = in.read()) !=-1  ){
		//System.out.println(data);
		out.write(data);
	    }
	   
	}catch(FileNotFoundException fex){
	    System.out.println(fex);
	}catch(IOException ex){
	    System.out.println(ex);
	}
	
	
    }
    
}
