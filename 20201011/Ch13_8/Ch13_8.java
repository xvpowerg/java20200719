/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20201011;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
public class Ch13_8 {

    public static void main(String[] args) {
	ExecutorService es = Executors.newFixedThreadPool(5);
	es.execute(()->{
	    for (int i =1;i<=4;i++){
		    System.out.println(i);
		    try{
			TimeUnit.SECONDS.sleep(1);
		    }catch(Exception ex){}		 
	    }	
	});
	es.shutdown();
	
    }
    
}
