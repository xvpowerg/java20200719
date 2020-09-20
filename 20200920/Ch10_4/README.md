# Map 的compute,computeIfAbsent,computeIfPresent方法討論
## Map宣告如下
```java
	Map<Integer,String> hashMap = new HashMap();
	hashMap.put(10, "A1");
	hashMap.put(15, "B2");
	hashMap.put(76, "C3");
	hashMap.put(19, "D4");
```
## 假設Key 存在
### compute 當Key存在
* 會執行BiFunction v2數值是目前Key所對應的value 
* 會將BiFunction的return 寫回Map
```java
hashMap.compute(15, (v1,v2)->{
	    System.out.println("compute Key存在:"+v1+":"+v2);
	    return "X5";}
	);
	System.out.println(hashMap);//{19=D4, 10=A1, 76=C3, 15=X5}
```
### computeIfAbsent 當Key存在 
* 不會執行Function 
```java
	hashMap.computeIfAbsent(76, k->{
	    System.out.println("computeIfAbsent K:"+k);
	    return "Y6";
	});
System.out.println(hashMap);//{19=D4, 10=A1, 76=C3, 15=X5}	
```
###  computeIfPresent 當Key存在
* 會執行BiFunction 
* 會將BiFunction的return 寫回Map	
```java
hashMap.computeIfPresent(19, (k1,k2)->{
	    System.out.println(k1+":"+k2);
	    return "G7";
	});
	System.out.println(hashMap);//{19=G7, 10=A1, 76=C3, 15=X5}
```