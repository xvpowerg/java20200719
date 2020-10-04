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
public class Ch12_6 {

    public static void main(String[] args) {
	File file = new File("C:\\MyDir\\test.zip");
	File target = new File("C:\\MyDir\\test_copy.zip");
	
	//try() 內宣告好的變數不可再重新給數值
	try( InputStream in = new BufferedInputStream(new FileInputStream(file));
	    OutputStream out = new BufferedOutputStream(new FileOutputStream(target));	
		){
	     int data =-1;
	     while( (data = in.read()) != -1 ){
		    out.write(data);
	     }
	}catch(FileNotFoundException ex){
	    System.out.println(ex);
	}catch(IOException ex){
	    System.out.println(ex);
	}
    }
    
}
