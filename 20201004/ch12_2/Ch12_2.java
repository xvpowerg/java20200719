/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201004;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Ch12_2 {

    public static void main(String[] args) {
	List<Integer> list = new ArrayList();
	list.add(25);
	list.add(100);
	list.add(20);
	list.add(10);
	// Fork join 
	//計算複雜度高
	//如果呼叫 list.parallelStream()  reduce會變為無順序
Optional<Integer> op=	list.stream().reduce((a,b)->{
	    System.out.println(a+":"+b);
	    return a+b;
	});
	System.out.println("ans:"+op.get());
System.out.println("==================================");
//可給予初始
//如果是parallel() 會先將12與stream內容相加，計算完成後 再將數值相加
//把Stream內容都加上12
//把Stream內容全部加總
Integer ans = list.stream().reduce(12, (a,b)->{
	    System.out.println(a+":"+b);
	    return a+b;
	});
    System.out.println(ans);
    
    System.out.println("==================================");
    
   Integer ans2 =  list.stream().parallel().reduce(12, (a,b)->{
	    System.out.println("BF-"+a+":"+b);//把Stream內容都加上12
	    return a+b;
    }, (c,f)->{
	System.out.println("CM-"+c+":"+f);//把Stream內容加總
	return c +f;
    });
    
    System.out.println(ans2);
   
    }
  
    
}
