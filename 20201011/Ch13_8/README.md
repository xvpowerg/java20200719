# 執行序池
可幫助我們減省執行序數量
```java
//固定生成5各執行序
ExecutorService es = Executors.newFixedThreadPool(5);
	es.execute(()->{
	    for (int i =1;i<=4;i++){
		    System.out.println(i);
		    try{
			TimeUnit.SECONDS.sleep(1);
		    }catch(Exception ex){}		 
	    }	
	});
	es.shutdown();

```
