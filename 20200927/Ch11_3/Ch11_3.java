/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20200927;
import java.util.function.Function;
public class Ch11_3 {
//方法泛型
    static <N,R> R test1(N v,Function<N,R> f){
	return f.apply(v);
    }
    public static void main(String[] args) {
	// TODO code application logic here
	String msg =  test1(100,(v)->{
	     return "price:"+v;
	 });	
	System.out.println(msg);
	//利用以下方是去限定泛型
	String msg2 =  Ch11_3.<Float,String>test1(
		26.5F,(v)->{return "price:"+v;
	 });
	System.out.println(msg2);
    }
    
}
