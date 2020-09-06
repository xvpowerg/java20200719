/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20200906;

import java.util.function.Consumer;
public class Ch8_7 {
    //Lambda 與 匿名類 區域變數的使用
    public static void main(String[] args) {
	// TODO code application logic here
	String names = new String();
	//匿名類或lambda 使用區域變數時 只可唯讀
	Consumer<String> c1 = new Consumer<String>(){
	    public void accept(String str){
		   // names += str+" ";
		  // names = names + str;
	    }
	};
	c1.accept("Ken");
	c1.accept("Vivin");	
	System.out.println(names);//Ken Vivin 
	
	StringBuffer sb = new StringBuffer();
	Consumer<String> c2 = new Consumer<String>(){
	    public void accept(String str){
		   sb.append(str);
		   sb.append(" ");
	    }
	};
	c2.accept("Ken");
	c2.accept("Vivin");	
	System.out.println(sb);//Ken Vivin 
    }
    
}
