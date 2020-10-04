# Serializable
自訂能序列畫物件必須implements Serializable
```java
public class Student implements Serializable{


}

```
# transient
可忽略不餐與序列化
public class Student implements Serializable{
    private String name;
    private int score;
    //因為不想Book序列化所以加上transient
    private transient Book book = new Book();
    
    }
