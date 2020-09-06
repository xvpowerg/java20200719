/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20200906;

public class Ch8_6 {
     interface SpawnValue {
	    int spawn();
     }

     interface PrintMsg {
	    void print();
     }
    public static void main(String[] args) {
	//Function Interface的方法無參數且有回傳值	
	//標準
	SpawnValue sv1 =  ()->{
	    int ran = (int)(Math.random() * 1000); //0~999
	    return ran;
	};
	System.out.println(sv1.spawn());
	//簡寫1 記得移除 return
	SpawnValue sv2 =  ()->(int)(Math.random() * 1000); 
	
	//Function Interface 的方法無參數且無回傳值
	PrintMsg pm1 = ()->{
		    System.out.println("Msg1");	
	};
	//簡寫1
	PrintMsg pm2 = ()-> System.out.println("Msg1");	
	
    }
    
}
