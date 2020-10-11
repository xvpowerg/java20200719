# Calendar
舊版取得年月日的方式
```java
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

```
# LocalDate 取得年月日
```java
LocalDate localDate = LocalDate.now();
 System.out.println(localDate.toString());
	  
	  //目前是這個月的第幾天
	  System.out.println(localDate.getDayOfMonth());
	  //目前是星期幾
	  System.out.println(localDate.getDayOfWeek());
	  //目前今年的第幾天
	  System.out.println(localDate.getDayOfYear());
	  //取得月分
	  System.out.println(localDate.getMonthValue());
	  System.out.println(localDate.getYear());

```
# LocalTime 取得時間
```java
    LocalTime localTime = LocalTime.now();
	    System.out.println(localTime.getHour());
	    System.out.println(localTime.getMinute());
	    System.out.println(localTime.getSecond());
	    System.out.println(localTime);
	    
	    LocalTime time1120 = LocalTime.of(11,20);
	    //目前的時間是參數時間之前嗎?
	   System.out.println(localTime.isBefore(time1120));
	    //目前的時間是參數時間之後嗎?
	     System.out.println(localTime.isAfter(time1120));
```   
