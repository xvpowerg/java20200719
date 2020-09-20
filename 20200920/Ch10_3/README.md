# Map 的compute,computeIfAbsent,computeIfPresent方法討論
## Map宣告如下
```java
	Map<Integer,String> hashMap = new HashMap();
	hashMap.put(10, "A1");
	hashMap.put(15, "B2");
	hashMap.put(76, "C3");
	hashMap.put(19, "D4");
```
## 假設Key 不存在
```java
	Map<Integer,String> hashMap = new HashMap();
	hashMap.put(10, "A1");
	hashMap.put(15, "B2");
	hashMap.put(76, "C3");
	hashMap.put(19, "D4");
```
### compute 當Key不存在 
* 會執行BiFunction 但是v2 為null
* 會將BiFunction的return 寫回Map
```java
	hashMap.compute(17, (v1,v2)->{
	    System.out.println("compute Key不存在:"+v1+":"+v2);
	    return "X5";}
	);
	System.out.println(hashMap);//{17=X5, 19=D4, 10=A1, 76=C3, 15=B2}
```
### computeIfAbsent 當Key不存在
* 會執行Function 
* 會將Function的return 寫回Map
```java
hashMap.computeIfAbsent(80, k->{
	    System.out.println("computeIfAbsent K:"+k);
	    return "Y6";
	});
	System.out.println(hashMap);//{80=Y6, 17=X5, 19=D4, 10=A1, 76=C3, 15=B2}	
```
