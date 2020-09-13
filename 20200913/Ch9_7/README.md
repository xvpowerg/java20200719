# Set說明
## Set特性
+ 內容不可重複
+ 不可使用index取值
+ 查詢速度比List好
## HashSet 特性
+ 無一定順序
+ 比較是否相等的順序如下
  + hashCode 如果數字一樣
  + equals 看是否一樣
  ---------------------------
`因為hashCode回傳的是整數,等於比較效率比equals高`

