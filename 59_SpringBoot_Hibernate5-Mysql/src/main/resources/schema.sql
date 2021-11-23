CREATE TABLE IF NOT EXISTS employee_table(
    id BIGINT auto_increment NOT NULL PRIMARY KEY,
    date_of_joining DATETIME(6),
    name VARCHAR(40),
    salary VARCHAR(100)
);