# Map<K,V>
## Map特性
可把Map想像成一個經緯度與地址的關係 一個經緯度 為Kye 地址為 Value
* *以下所有的Key都簡寫K 所有value都簡寫V
* Map的結構是Key 與 Value的組合
* 寫入map使用put(K,V)
* 取得map使用get(K)
* K如果重複會覆蓋v 如下
```java
HashMap<Integer,String> map = new HashMap<>();
	//寫入map使用put
	map.put(25, "Howard");
	map.put(10, "Vivin");
	map.put(20, "Join");
	//取得map使用get
	System.out.println(map.get(10));
	//key如果重複會覆蓋value
	map.put(10, "Lucy");
	System.out.println(map.get(10));
```
* 可搭配containsKey(key) 查找key是否重複
如下
```java
	int key = 13;
	if (!map.containsKey(key)){
	    System.out.println("不存在Key");
	    map.put(key, "Yumi");
	}else{
	    System.out.println("存在Key");
	}
```
*java8開始提供 putIfAbsent 如果key不存在 就將value寫入map	
如下
```java
	map.putIfAbsent(16, "Iris");//16key 不存在 所以寫入
	map.putIfAbsent(20, "Gigi");//20 key存在 所以不寫入
	System.out.println(map)//{16=Iris, 20=Join, 25=Howard, 10=Lucy, 13=Yumi}
```
## 輪巡Map
1. java8之前 可使用entrySet
```java
	   //使用entrySet 輪巡Map
	Set<Entry<Integer,String>> entrySet = map.entrySet();
	    for (Entry<Integer,String> entry :entrySet){
		System.out.println(entry.getKey()+":"+entry.getValue());
	    }     
	  }
```

