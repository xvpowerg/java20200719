# AutoCloseable 執行順序與Suppressed討論
* Suppressed AutoCloseable時會將第一個例外之外的其他例外放置於Suppressed
''' java
   Throwable[] array =  ex.getSuppressed();
	      for (Throwable th : array){
		   System.out.println("Throwable:"+th);	   
	      }
	    System.out.println("Exception:"+ex);	   
'''
