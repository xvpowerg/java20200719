# 介面default方法與static方法
 因為過去介面不能有實體方法，所以一定要先實作後才能產生實體方法，這樣十分麻煩
於是java8新增了default方法如下
```java
interface MyIterator{

//預設為public
   default void foreach(Consumer<String> consumer){	
    while(hasNext()){
        consumer.accept(next());
    }	
    }
}

```
