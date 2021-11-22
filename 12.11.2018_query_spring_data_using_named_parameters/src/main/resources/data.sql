DROP DATABASE IF EXISTS demojpaquery;
CREATE DATABASE demojpaquery CHARACTER SET utf8 COLLATE utf8_general_ci;

USE demojpaquery;

DROP TABLE IF EXISTS person_table;
CREATE TABLE person_table
(
  person_id INT AUTO_INCREMENT
    PRIMARY KEY ,
  creation_date TIMESTAMP NOT NULL,
  email VARCHAR(100) NOT NULL,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(100) NOT NULL,
  CONSTRAINT person_id_UNIQUE
    UNIQUE (person_id)
)
  ENGINE = innoDB
  DEFAULT CHARACTER SET = utf8
;

INSERT INTO person_table (creation_date, email, first_name, last_name) VALUES
('2038-01-19 03:14:07',
 'maya.m2018@gmail.com',
 'Maya',
 'Almadovar');

INSERT INTO person_table (creation_date, email, first_name, last_name) VALUES
('2037-02-18 04:11:08',
 'jack.m2018@gmail.com',
 'Jack',
 'Sparrow');