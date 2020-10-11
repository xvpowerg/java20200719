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
# LocalDate java7取得年月日
```java
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
