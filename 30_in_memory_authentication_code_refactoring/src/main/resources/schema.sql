DROP DATABASE IF EXISTS springbootdb;
CREATE DATABASE springbootdb CHARACTER SET utf8 COLLATE utf8_general_ci;

USE springbootdb;

DROP TABLE IF EXISTS ticket;
CREATE TABLE ticket
(
  ticket_Id      INT AUTO_INCREMENT
    PRIMARY KEY,
  passenger_name VARCHAR(100) NOT NULL,
  booking_date   TIMESTAMP    NOT NULL,
  source_station VARCHAR(100) NOT NULL,
  dest_station   VARCHAR(100) NOT NULL,
  email VARCHAR (100) NOT NULL,
  CONSTRAINT ticket_id_UNIQUE
    UNIQUE (ticket_id)
)
  ENGINE = innoDB
  DEFAULT CHARACTER SET = utf8
;
INSERT INTO ticket(passenger_name,booking_date,source_station,dest_station,email) VALUES('Raul','2017/07/14 15:02:04
','Kyiv','Malorka','raul.s2018@yahoo.com');
INSERT INTO ticket(passenger_name,booking_date,source_station,dest_station,email) VALUES('Sean','2018/08/15','Lviv','Ibiza','sean.s2019@yahoo.com');
INSERT INTO ticket(passenger_name,booking_date,source_station,dest_station,email) VALUES('Andrew','2019/09/16','Odesa','Corsica','andrew.s2020@yahoo.com');
INSERT INTO ticket(passenger_name,booking_date,source_station,dest_station,email) VALUES('Robert','2020/07/14','Dnipro','Hawaii','robert.s2021@yahoo.com');
INSERT INTO ticket(passenger_name,booking_date,source_station,dest_station,email) VALUES('Vlad','2021/07/14','Winnytsa','Playa Del Carmen','vlad.s2022@yahoo.com');
INSERT INTO ticket(passenger_name,booking_date,source_station,dest_station,email) VALUES('Ostap','2022/07/14','Kharkiv','Turtle Bay','ostap.s2023@yahoo.com');