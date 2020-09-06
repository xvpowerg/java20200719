/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20200906;

/**
 *
 * @author xvpow
 */
public class Ch8_4 {
    interface IntegerCompare{
	void compare(int a,int b);
    }
    
    public static void main(String[] args) {
	//Function Interface 的方法參數有兩組且無回傳值
	  //標準寫法
	  IntegerCompare ic1 = (int a,int b)->{
		if (a > b){
		    System.out.println("a 大於 ｂ");
		}else{
		     System.out.println("a 不大於 ｂ");
		}
	  };
	 //簡寫1 大括號內只有一條命令，所以可以使用以下方式簡寫
	  //可把{}移除 也要注意{}內部命令;記得要移除
	   IntegerCompare ic2 = (int a,int b)->
		   System.out.println(a>b?"a 大於 ｂ":"a 不大於 ｂ"  );
		    
	//簡寫2  可以把參數的類型移除
	IntegerCompare ic3 = (a, b)->
		System.out.println(a>b?"a 大於 ｂ":"a 不大於 ｂ"  );
    }
    
}
