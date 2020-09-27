#  Optional
## Optional用來統一化避免null問題的方法
可使用以下方是建立新Optional 注意不可new
*  Optional.empty() 取得空白Optional
* Optional.of(args) 參數不可null
* Optional.ofNullable(args)參數可null

## Optional內的物件方法
* ifPresent 判定是否存在
* get 可取值 如果 Optional內無數值會拋出錯誤
* ifPresent 如果Optional存在數值會呼叫ifPresent參數的方法
* orElse 如果存在會回傳Optional內的數值 如果不存在會回傳orElse的參數
