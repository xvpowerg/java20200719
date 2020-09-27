# Stream方法
## findAny 與 findFirst
* findAny 與 findFirst 都回傳Optional
* findAny 與 findFirst 在未使用parallel都回傳第一筆
* findAny 與 findFirst 在使用parallel後findAny會是隨機值 findFirst回傳第一筆