/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20201011;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.Calendar;
public class Ch13_2 {

    public static void main(String[] args) {
	//LocalDate 處裡日期
	//LocalTime 處裡時間
	//LocalDateTime 日期時間同時處理
	
	Calendar calendar = Calendar.getInstance();
	int year = calendar.get(Calendar.YEAR);
	//由0為1月
	int month = calendar.get(Calendar.MONTH) + 1;
	int date = calendar.get(Calendar.DATE);
	
	int hour = calendar.get(Calendar.HOUR_OF_DAY);
	int minute= calendar.get(Calendar.MINUTE);
	int second = calendar.get(Calendar.SECOND);
	System.out.printf("%d/%02d/%02d %02d:%02d:%02d %n",
		year,month,date,hour,minute,second);
	
	
	  LocalDate localDate = LocalDate.now();
	  System.out.println(localDate.toString());
	  
	  //目前是這個月的第幾天
	  System.out.println(localDate.getDayOfMonth());
	  //目前是星期幾
	  System.out.println(localDate.getDayOfWeek());
	  //目前今年的第幾天
	  System.out.println(localDate.getDayOfYear());
	  //取得月
	  System.out.println(localDate.getMonthValue());
	  //取得年
	  System.out.println(localDate.getYear());
	
	  
    }
    
}
