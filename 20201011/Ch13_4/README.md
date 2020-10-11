# Thread
幫我們處理可能會中斷或是時間較長的工作
* Process 主應用程式

* Thread Process小幫手 Thread放在Process
* Thread 啟動需要開啟Stack資源 會消耗一定的資源
* Thread運行時，作業系統會幫忙選擇要執行的CPU核心
* 同一Thread運時只會在其中一顆核心執行Thread
* 建立執行序方式一
```java
    Thread th1 = new Thread(){
		public void run(){
		    //新Thread要做的事
		    System.out.println("Test!!!");
		}	    
	    };
	th1.start();
```

