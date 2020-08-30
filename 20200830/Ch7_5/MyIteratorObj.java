/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20200830;

public class MyIteratorObj implements MyIterator {
    private String[] arrays;
    private int index = 0;
    public MyIteratorObj(String[] arrays){
	this.arrays = arrays;
    }
    public int size(){
	return arrays.length;
    }
    public boolean hasNext(){
	return index < size();
    }
    public String next(){
	return arrays[index++];
    }
}
