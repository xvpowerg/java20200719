# Stream方法

## flatmap
* flatMap 會展開回傳的Stream
* floatMap系列只能回傳Stream
```java
ArrayList<HashSet<String>> list = new ArrayList<>();
	HashSet<String> set1 = new HashSet<>();
	set1.add("Apple");
	set1.add("Banana");
	HashSet<String> set2 = new HashSet<>();
	set2.add("Tomato");
	HashSet<String> set3 = new HashSet<>();
	set3.add("Broccoli");
	set3.add("Kiwi");
	list.add(set1);
	list.add(set2);
	list.add(set3);
	//如果是map  回傳Stream不會展開
	
	//flatMap 會展開回傳的Stream
	//floatMap系列只能回傳Stream
	long count = list.stream().flatMap(set->set.stream()).count();
	System.out.println(count);
```