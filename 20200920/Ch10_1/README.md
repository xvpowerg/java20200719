# Map<K,V>
## Map特性
可把Map想像成一個經緯度與地址的關係 一個經緯度 為Kye 地址為 value
* *以下所有的Key都簡寫K 所有value都簡寫v
* Map的結構是Key 與 value的組合
* 寫入map使用put(K,V)
* 取得map使用get(k)
* k如果重複會覆蓋v 如下
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
