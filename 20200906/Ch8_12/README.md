# lambda 與 method reference 練習
1. 使用lambda 語法 實作Predicate，條件只顯示偶數，如果沒有任何偶數顯示無偶數
 方法約如下 
 ```java
 void test1(Predicate p,int ... v){
 }
 ````
2. 使用method reference 語法 將字串陣列的內容轉為大寫
 方法約如下 
 ```java
 void arrayToUp(UnaryOperator p,String ... v){
 
 }
 ````
3. 使用 method reference new語法 產生一組Student 
## 建構式如下
```java
Student(String name,float height){ 
}
```
## 可能會有一個類似的介面
```java
 interface ToStudent{
    xxxx  toStudent();
 }
````
## 呼叫產生Student的方法
```java
static void generateStudent(ToStudent tos,float height)(
  Student st =   tos.toStudent()
  System.out.println(st)
}

```
