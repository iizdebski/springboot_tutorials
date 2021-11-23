DROP DATABASE IF EXISTS springbootdb;
CREATE DATABASE springbootdb CHARACTER SET utf8 COLLATE utf8_general_ci;

USE springbootdb;

DROP TABLE IF EXISTS ticket;
CREATE TABLE ticket
(
  ticket_Id      INT AUTO_INCREMENT
    PRIMARY KEY,
  passenger_name VARCHAR(100) NOT NULL,
  source_station VARCHAR(100) NOT NULL,
  booking_date   TIMESTAMP NOT NULL,
  dest_station   VARCHAR(100) NOT NULL,
  email VARCHAR (100) NOT NULL,
  CONSTRAINT ticket_id_UNIQUE
    UNIQUE (ticket_id)
);