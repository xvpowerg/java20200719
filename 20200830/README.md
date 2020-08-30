## 常用java內建介面
* Consumer<T> void	accept(T t) //負責接收
* Supplier<T> T	get() //的到某個東西
* Function<T,R> R apply(T t) //用來轉換
* Predicate<T> boolean	test(T t)//用驗證
* UnaryOperator<T>  apply(T t)//對本身做計算
## 程式碼內大綱
1. Ch7_1 作業使用Supplier 產生樂透數字
2. Ch7_2 練習使用Function分割字串並轉為大寫
3. Ch7_3  練習使用UnaryOperator對陣列做乘2的動作
4. Ch7_4  練習使用Predicate 只顯示長度大於3的字串
5. Ch7_5 介面default方法與static方法
6. Ch7_6 實驗如果實作的介面當中 default方法有重複名稱會產生錯誤
7. Ch7_7 static內部類 static Inner class
8. Ch7_8 非static內部類 non static Inner class
9. Ch7_9 匿名內部類
