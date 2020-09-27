# Stream方法
## findAny 與 findFirst
* findAny 與 findFirst 都回傳Optional
* findAny 與 findFirst 在未使用parallel都回傳第一筆
* findAny 與 findFirst 在使用parallel後findAny會是隨機值 findFirst回傳第一筆
##  limit skip sorted
* limit 只取前n筆
* skip 跳過前n筆
* sorted 排序
