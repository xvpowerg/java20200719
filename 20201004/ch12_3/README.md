# 說明InputStream與OutputStream用法
* InputStream 讀入資料
* OutputStream 輸出資料
因為InputStream 與 OutputStream都是抽象類別無法直接使用，所以通常此用子類型如
```java
try{
	    InputStream in = new FileInputStream(file);	    
	    OutputStream out = new FileOutputStream(target);
	    //-1表示資料結尾
	    int data = -1;
	    
	    while( (data = in.read()) !=-1  ){
		//System.out.println(data);
		out.write(data);
	    }
	   
	}catch(FileNotFoundException fex){
	    System.out.println(fex);
	}catch(IOException ex){
	    System.out.println(ex);
	}

```
