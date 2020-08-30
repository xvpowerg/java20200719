/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20200830;

/**
 *
 * @author xvpow
 */
public class ItemList implements MyIterator {
    private String[] items = {"Item1","Item2","Item3","Item4","Item5"};
     private int index=0;
    public int size(){
	return items.length;
    }    
    public boolean hasNext(){
	return index < size();
    }    
    public String next(){
	return items[index++];
    }
}
