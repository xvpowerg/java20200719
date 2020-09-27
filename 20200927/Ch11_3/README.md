# 方法泛型
可動態決定方法的參數與回傳值如下
```java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20200927;
import java.util.function.Function;
public class Ch11_3 {
//方法泛型
    static <N,R> R test1(N v,Function<N,R> f){
	return f.apply(v);
    }
 }
```