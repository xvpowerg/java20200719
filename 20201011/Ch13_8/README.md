# 執行序池
可幫助我們減省執行序數量
```java
//固定生成5個執行序

ExecutorService es = Executors.newFixedThreadPool(5);
//可透過execute 運行生成的執行序 
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
