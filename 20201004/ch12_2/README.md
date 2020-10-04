	# reduce 與 parallel
 parallel 使用fork join技術
 * fork 把長的元素分散為小的放在多核心計算
 * join 元素分散計算後合併
 適於於
 * 計算複雜度高
 ##reduce
+ 如果呼叫 list.parallelStream()  reduce會變為無順序
```java  
Optional<Integer> op=	list.stream().reduce((a,b)->{
	    System.out.println(a+":"+b);
	    return a+b;
	});
	System.out.println("ans:"+op.get());
```
+ 可給予初始
   + 如果是parallel() 會先將12與stream內容相加，計算完成後 再將數值相加
   + 把Stream內容都加上12
    + 把Stream內容全部加總
```java    
Integer ans = list.stream().reduce(12, (a,b)->{
	    System.out.println(a+":"+b);
	    return a+b;
	});
    System.out.println(ans);
```
  
+ 可給予初始
   + 如果是parallel() 會先將12與stream內容相加，計算完成後 再將數值相加
   + 把Stream內容都加上12
    + 把Stream內容全部加總
    + 如果不是parallel只會呼叫BF　
 ```java    
   Integer ans2 =  list.stream().reduce(12, (a,b)->{
	    System.out.println("BF-"+a+":"+b);//把Stream內容都加上12
	    return a+b;
    }, (c,f)->{
	System.out.println("CM-"+c+":"+f);//把Stream內容加總
	return c +f;
    });
    System.out.println(ans2);
```    

