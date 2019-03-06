CREATE DATABASE todolist;

SET SQL_SAFE_UPDATES = 0;

USE todolist;

CREATE TABLE tasks (
	id INT PRIMARY KEY AUTO_INCREMENT,
    task_name VARCHAR(30) NOT NULL,
    description TEXT
);

 INSERT INTO tasks VALUES 
	(NULL, "showering", "Thorough body cleaning to make yourself
    and everybody around you happy."),
    (NULL, "breakfast", "Fill your belly to be happy!"),
    (NULL, "work", "We all need to do something useless in
    our lives..."),
    (NULL, "have fun", "Something to live for.");
    
SELECT * FROM tasks;
 
 CREATE TABLE persons (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(50) NOT NULL,
    age TINYINT UNSIGNED,
    occupation VARCHAR(50) NOT NULL
);
    
INSERT INTO persons VALUES 
	(NULL, "Masztur Bálint", 30, "hangyatenyésztő"),
    (NULL, "Eszet Lenke", 46, "aranyásó"),
    (NULL, "Illatos Ibolya", 24, "lekvármelegítő"),
    (NULL, "Nagy Árpi", 52, "tésztahúzogató"
);
 
 SELECT * FROM persons;

ALTER TABLE tasks
	ADD COLUMN needed_time INT AFTER task_name;
    
UPDATE tasks
	SET needed_time = 10
    where task_name = "breakfast";
 