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
	//list.parallelStream()
Optional<Integer> op=	list.stream().reduce((a,b)->{
	    System.out.println(a+":"+b);
	    return a+b;
	});
	System.out.println("ans:"+op.get());
    }
    
}
