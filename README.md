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
  ("Springの勉強", "2018/08/22", 0),
  ("JavaScriptの勉強", "2018/08/22", 0),
  ("来期目標提出", "2018/08/22", 0)
;
```

