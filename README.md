# DB環境


DBクライアントにて以下を実行して下さい
```sql
CREATE DATABASE IF NOT EXISTS task;

USE task;

CREATE TABLE IF NOT EXISTS task (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  task varchar(255),
  due date,
  status boolean,
  PRIMARY KEY (id)
);
```

テストデータが必要な場合は以下も追加で実行しましょう

```sql
insert into task(task, due, status) values 
  ("Springの課題", "2035/08/22", 0),
  ("Javaの復習", "2032/04/02", 0),
  ("勤怠表提出", "2029/11/19", 0)
;
```

