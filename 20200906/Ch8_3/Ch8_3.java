/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20200906;

/**
 *
 * @author xvpow
 */
public class Ch8_3 {

    // Function Interface才可使用lambda
    //Function Interface 介面當中抽象的方法只有一個
    
    static void testCopy(int[] data,CopyFile cp){
	cp.copy(data);
    }
    public static void main(String[] args) {
	//Function Interface 的方法參數只有一組且無回傳值
	   //標準寫法
	   int[] data = {56,30,92};
	   CopyFile c1 = (int[] a)->{	       
	       System.out.println("C1:"+a[0]);
	   };	   
	   testCopy(data,c1);
	   //簡寫1 大括號內只有一條命令，所以可以使用以下方式簡寫
	   //可把{}移除 也要注意{}內部命令;記得要移除
	   //; 表達的是一段命令結束
	     CopyFile c2 = (int[] a)->       
	       System.out.println("C2:"+a[0]);
	    testCopy(data,(int[] a)->System.out.println("C2:"+a[0]));
	   //簡寫2
	   //簡寫3
	   
	
	//Function Interface 的方法參數只有兩組且無回傳值
	
	//Function Interface 的方法參數只有一組且有回傳值
	
	//Function Interface 的方法參數只有兩組且有回傳值
	
	//Function Interface 的無方法參數且有回傳值
	
	//Function Interface 的無方法參數且無回傳值
	
    }
    
}
