/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20200927;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch11_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//	Teacher t1 = new Teacher(null,20);
//	if ( t1.getName().length() < 0 || t1.getName().length() > 10) {
//	    System.out.println("錯誤的姓名!");
//	}
// Optional用台統一化避免null問題
  Optional<String> nameOption =   Optional.empty();
      // System.out.println(nameOption.get());
    if (nameOption.isPresent()){
	System.out.println(nameOption.get());
    }

    }
    
}
