# 使用lambda限制跟語法變形
## 使用lambda的限制
 必須是functional Interface 類型才可使用
 `Function Interface 表示介面當中抽象的方法只有一個 可使用@FunctionalInterface  標籤檢查是否為FunctionalInterface`
 ### 案例如下
 ``` java
@FunctionalInterface
public interface CopyFile {
    void copy(int[] data);
}
 ```
# 語法變形
## Function Interface 的方法參數只有一組且無回傳值
介面如下
```java
@FunctionalInterface
public interface CopyFile {
    void copy(int[] data);
}
```
### 標準寫法
``` java
 int[] data = {56,30,92};
	   CopyFile c1 = (int[] a)->{	       
	       System.out.println("C1:"+a[0]);
	   };	   
```
###簡寫1
```大括號內只有一條命令，所以可以使用以下方式簡寫可把{}移除 也要注意{}內部命令;記得要移除```
``` java
 int[] data = {56,30,92};
 //給予變數
 CopyFile c2 = (int[] a)->       
	       System.out.println("C2:"+a[0]);
 //直接用於方法       
 testCopy(data,(int[] a)->System.out.println("C2:"+a[0]));
```


