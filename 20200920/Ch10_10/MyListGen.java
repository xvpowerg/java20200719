/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20200920;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *
 * @author xvpow
 */
//選告一個T動態類型的方式:<T>
public class MyListGen<T> {
        private ArrayList<T> list = new ArrayList<>();
    public void add(T str){
	list.add(str);
    }
   
    public T get(int index){
	return list.get(index);
    }
    
    public void foreach(Consumer<T> consumer){
	list.forEach(consumer);
    }
}
