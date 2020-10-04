# close
io 開啟一定要lose所以會將close放置於fubally如下:
```java
try{	    
	      in = new FileInputStream(file);
	    //Buffered 會比較快
	     in = new BufferedInputStream(in);
	     out = new FileOutputStream(target);
	     out = new BufferedOutputStream(out);	     
	     int data =-1;
	     while( (data = in.read()) != -1 ){
		    out.write(data);
	     }	   
	}catch(FileNotFoundException ex){
	    System.out.println(ex);
	}catch(IOException ex){
	    System.out.println(ex);
	}finally{//一定會執行一次	    
	    try{
		out.close();	  //關閉順序由內往外關閉  
		in.close();//會呼叫flush() 並且會關閉連線
	    }catch(IOException ex){
		System.out.println("ex:"+ex);
	    }	     
	}	

```

