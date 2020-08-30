/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20200830;
import java.util.function.Supplier;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class MyLotto implements Supplier<Integer> {
    private Random ran = new Random();
    public Integer get(){
	return ran.nextInt(49)+1;
    }
}
