/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201004;

/**
 *
 * @author xvpow
 */
public class Ch12_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	    /*Body...
	    name:Test2
	    name:Test1*/
//	try(TestClose t1 = new TestClose("Test1",false);
//	TestClose t2 = new TestClose("Test2",false);){
//	    System.out.println("Body...");	   	    
//	}catch(Exception ex){
//	    System.out.println("Exception:"+ex);	   
//	}
    
	    /*
	如果Body拋出例外的順序
	Body...
	name:Test2
	name:Test1
	Exception:java.lang.Exception: Body...ex
	
	*/
	try(TestClose t1 = new TestClose("Test1",false);
	TestClose t2 = new TestClose("Test2",false);){
	    System.out.println("Body...");	
	   throw new Exception("Body...ex");
	}catch(Exception ex){
	    System.out.println("Exception:"+ex);	   
	}
	
	
    }
    
}
