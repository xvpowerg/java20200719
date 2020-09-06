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


