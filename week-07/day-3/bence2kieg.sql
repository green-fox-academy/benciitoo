show databases;

use todolist;

show tables;
select * from tasks;
select * from persons;

CREATE TABLE todos (
	person_id INT NOT NULL,
	task_id INT NOT NULL,
	is_it_finished ENUM ("NO", "YES") NOT NULL,
    FOREIGN KEY (person_id) REFERENCES persons (id),
	FOREIGN KEY (task_id) REFERENCES tasks (id)
);


SELECT DISTINCT * FROM tasks, persons;

INSERT INTO todos VALUES
	(1, 1, "yes"),
    (1, 3, "Yes"),
    (2, 2, "no"),
    (4, 4, "yes"),
    (3, 3, "no"
);

SELECT  * FROM todos;

