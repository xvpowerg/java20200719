/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20201011;

/**
 *
 * @author xvpow
 */
public class Ch13_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//Process 程式
	
	//Thread 程式小幫手 放在Process
	   //Thread 啟動需要開啟Stack資源
	//Goroutine 放在Thread
	    //比Thread小 速度比較快
	    
	    
	    //運行執行序時時，作業系統會幫忙選擇要執行的CPU核心
	    //Thread運時只會在其中一顆核心執行Thread
	    //建立執行序	   
	    Thread th1 = new Thread(){
		public void run(){
		    //新Thread要做的事
		    System.out.println("Test!!!");
		}	    
	    };
	th1.start();
    }
    
}
