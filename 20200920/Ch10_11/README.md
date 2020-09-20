# 限定可設定的泛型類別
有時需要限定特殊的類別作為我們泛型的類型
## 選告泛型語法
類別<T extends 限定的類型> Ｔ可用任意英文字母約定俗成使用T ，
```java
 class Test<T extends List<V>,V>{
}
```
以上限定Test的泛型可以是List類型或是List的子類型