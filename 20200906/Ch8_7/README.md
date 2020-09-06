# Lambda 與 匿名類 區域變數的使用
```匿名類或lambda 使用區域變數時 只可唯讀```
### 以下程式碼在accept內會產生錯誤
```java
      	String names = new String();
	//匿名類或lambda 使用區域變數時 只可唯讀
	Consumer<String> c1 = new Consumer<String>(){
	    public void accept(String str){
		   names += str+" ";//產生錯誤
	    }
	};
	c1.accept("Ken");
	c1.accept("Vivin");	
	System.out.println(names);//Ken Vivin 
```
