/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20200830;

import java.util.function.Consumer;

/**
 *
 * @author xvpow
 */
public interface MyIterator {
    int size();
    //是否有下一筆
    boolean hasNext();
    //取的下一筆資料
    String next();
    //預設為public
    default void foreach(Consumer<String> consumer){	
	while(hasNext()){
	    consumer.accept(next());
	}	
    }
    
    static MyIterator createMyIterator(String ... values){
	MyIterator myit = new MyIteratorObj(values);
	return myit;
    }
}
