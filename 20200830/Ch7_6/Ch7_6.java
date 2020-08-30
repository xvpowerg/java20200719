/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20200830.testdefault;

/**
 *
 * @author xvpow
 */
public class Ch7_6 implements TestIF,TestIF2 {
    //如果實作的介面當中 default方法有重複名稱
    //解決方案
    //1. 不要有重複的方法
    //2. 覆寫重複的方法
    public static void main(String[] args) {
	Ch7_6 ch76 = new Ch7_6();
	ch76.print();
    }
//    public void print(){
//	System.out.println("Ch7_6");
//    }
}
