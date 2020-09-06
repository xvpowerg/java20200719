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
public class Ch8_5 {
    
    interface MapToValue{
	int map(String v);
    }
    
    interface Calculate{
	int calcu(int a,int b);
    }
	    

    public static void main(String[] args) {
	//Function Interface 的方法參數有一組且有回傳值	
	//標準
	MapToValue mp1 = (String str)->{
	    return str.hashCode();
	};
	//簡寫1  注意要移除return
	MapToValue mp2 = (String str)-> str.hashCode();
	//簡寫2  
	MapToValue mp3 =  str->{
	    return str.hashCode();
	};
	//簡寫3  注意要移除return
	MapToValue mp4 = str-> str.hashCode();

	
	//Function Interface 的方法參數有兩組且有回傳值
	//以上簡寫條件跟無回傳值一樣
	
	
    }
    
}
