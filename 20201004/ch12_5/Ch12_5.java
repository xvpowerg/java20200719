/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201004;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author xvpow
 */
public class Ch12_5 {


    public static void main(String[] args) {
	File file = new File("C:\\MyDir\\test.zip");
	File target = new File("C:\\MyDir\\test_copy.zip");
	InputStream in = null;
	 OutputStream out = null;
	try{	    
	      in = new FileInputStream(file);
	    //Buffered 會比較快
	     in = new BufferedInputStream(in);
	     out = new FileOutputStream(target);
	     out = new BufferedOutputStream(out);	     
	     int data =-1;
	     while( (data = in.read()) != -1 ){
		    out.write(data);
	     }	   
	}catch(FileNotFoundException ex){
	    System.out.println(ex);
	}catch(IOException ex){
	    System.out.println(ex);
	}finally{//一定會執行一次	    
	    try{
		out.close();	  //關閉順序由內往外關閉  
		in.close();//會呼叫flush() 並且會關閉連線
	    }catch(IOException ex){
		System.out.println("ex:"+ex);
	    }	     
	}	
    }
    
}
