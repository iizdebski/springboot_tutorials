DROP DATABASE IF EXISTS springbootjerseydb;
CREATE DATABASE springbootjerseydb CHARACTER SET utf8 COLLATE utf8_general_ci;

USE springbootjerseydb;

DROP TABLE IF EXISTS topics;
CREATE TABLE topics
(
  topic_Id      INT AUTO_INCREMENT
    PRIMARY KEY,
  title VARCHAR(100) NOT NULL,
  category VARCHAR(100) NOT NULL,
  CONSTRAINT topic_Id_UNIQUE
    UNIQUE (topic_Id)
)
  ENGINE = innoDB
  DEFAULT CHARACTER SET = utf8
;