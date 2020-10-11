/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20201011;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class Ch13_3 {

 
    public static void main(String[] args) {
	//最少要填年月日
	     LocalDate localdate = LocalDate.of(2020, 10, 18);
	     //最少要填寫 小時與分鐘
	      LocalTime localTime = LocalTime.of(15, 26);
	      //不會改變原本的localTime
	      LocalTime newLocalTime = localTime.minusHours(2);
	      System.out.println(localTime);
	      System.out.println(newLocalTime);
	
    }
    
}
