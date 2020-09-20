# Map 的merge方法討論
假設Map如下
```java
	Map<Integer,String> hashMap = new HashMap();
	hashMap.put(10, "A1");
	hashMap.put(15, "B2");
	hashMap.put(76, "C3");
	hashMap.put(19, "D4");
```
## Key如果存在 merge的行為:`會依照BiFunction的行為去合併Map`
```java
hashMap.merge(19, "K5",(oldValue,newValue)->oldValue+newValue );
	System.out.println(hashMap);//{19=D4K5, 10=A1, 76=C3, 15=B2}
```
## Key如果不存在 merge的行為:`會將merge的value寫回Map`
```java
hashMap.merge(60, "K9",(oldValue,newValue)->oldValue+newValue );
	System.out.println(hashMap);//{19=D4K5, 10=A1, 60=K9, 76=C3, 15=B2}
```


