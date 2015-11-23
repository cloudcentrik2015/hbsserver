/* create user */
CREATE USER 'hbs_admin'@'localhost' IDENTIFIED BY 'open123';
CREATE USER 'hbs_admin'@'%' IDENTIFIED BY 'open123';
GRANT ALL ON hbs.* TO 'hbs_admin'@'localhost';
GRANT ALL ON hbs.* TO 'hbs_admin'@'%';
FLUSH PRIVILEGES;

/*create database */
CREATE DATABASE hbs;
USE hbs;
/*================hbs_customer Table===========================*/

CREATE TABLE `hbs_customer` (
  `customer_Id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_user_name` varchar(255) NOT NULL,
  `customer_password` varchar(255) NOT NULL,
  `customer_email` varchar(255) NOT NULL,
  `customer_first_name` varchar(255) DEFAULT NULL,
  `customer_last_name` varchar(255) DEFAULT NULL,
  `customer_age` int(11) DEFAULT NULL,
  `customer_sex` varchar(255) DEFAULT NULL,
  `customer_phone` varchar(255) DEFAULT NULL,
  `customer_address` varchar(255) DEFAULT NULL,
  `customer_postcode` int(11) DEFAULT NULL,
  `customer_city` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`customer_Id`),
  UNIQUE KEY `user_Id_UNIQUE` (`customer_Id`),
  UNIQUE KEY `user_name_UNIQUE` (`customer_user_name`),
  UNIQUE KEY `user_email_UNIQUE` (`customer_email`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;


/* ALTER TABLE hbs_customer AUTO_INCREMENT=10001; */

/* insert ismail
INSERT INTO `hbs`.`hbs_customer`
(
`customer_user_name`,
`customer_password`,
`customer_email`,
`customer_first_name`,
`customer_last_name`,
`customer_age`,
`customer_sex`,
`customer_phone`,
`customer_address`,
`customer_postcode`,
`customer_city`)
VALUES
('ismail',
'open123',
'ismail@cloudcentrik.net',
'Ismail',
'Fakir',
30,
'male',
0704358842,
'vårvädersgatan 17',
41831,
'göteborg');
*/

/* select * from hbs_customer; */

/*================hbs_shop Table===========================*/

CREATE TABLE `hbs_shop` (
  `shop_id` int(11) NOT NULL AUTO_INCREMENT,
  `shop_user_name` varchar(255) NOT NULL,
  `shop_passward` varchar(255) NOT NULL,
  `shop_email` varchar(255) NOT NULL,
  `shop_name` varchar(255) DEFAULT NULL,
  `shop_address` varchar(255) DEFAULT NULL,
  `shop_postcode` int(11) DEFAULT NULL,
  `shop_city` varchar(45) DEFAULT NULL,
  `shop_phone` varchar(45) DEFAULT NULL,
  `shop_mobile` varchar(45) DEFAULT NULL,
  `shop_opening_hours` varchar(45) DEFAULT NULL,
  `shop_hourly_rate` int(11) DEFAULT NULL,
  PRIMARY KEY (`shop_id`),
  UNIQUE KEY `shop_email_UNIQUE` (`shop_email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/* ALTER TABLE hbs_shop AUTO_INCREMENT=1501; */

/* insert vasa */
INSERT INTO `hbs`.`hbs_shop`
(
`shop_user_name`,
`shop_passward`,
`shop_email`,
`shop_name`,
`shop_address`,
`shop_postcode`,
`shop_city`,
`shop_phone`,
`shop_mobile`,
`shop_opening_hours`,
`shop_hourly_rate`)
VALUES
('vasa',
'asd2015',
'info@vasahairdresser.se',
'Vasa Hair Dresser',
'vasagatan 10',
41460,
'göteborg',
031-57932,
07399605,
'mån-sön : 10-18',
120);
/* select * from hbs_shop; */

/*================hbs_booking Table===========================*/

CREATE TABLE `hbs_booking` (
  `booking_id` int(11) NOT NULL AUTO_INCREMENT,
  `shop_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `booking_date` date NOT NULL,
  `booking_start_time` time NOT NULL,
  `booking_end_time` time NOT NULL,
  PRIMARY KEY (`booking_id`),
  UNIQUE KEY `booking_id_UNIQUE` (`booking_id`),
  KEY `fk_booking_shop_id_idx` (`shop_id`),
  KEY `fk_booking_customer_id_idx` (`customer_id`),
  CONSTRAINT `fk_booking_shop_id` FOREIGN KEY (`shop_id`) REFERENCES `hbs_shop` (`shop_id`),
  CONSTRAINT `fk_booking_customer_id` FOREIGN KEY (`customer_id`) REFERENCES `hbs_customer` (`customer_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/* ALTER TABLE hbs_booking AUTO_INCREMENT=110001; */

/* insert new booking*/
INSERT INTO `hbs`.`hbs_booking`
(
`shop_id`,
`customer_id`,
`booking_date`,
`booking_start_time`,
`booking_end_time`)
VALUES
(
1501,
10001,
'2015-11-07',
'10:00:00',
'11:00:00');

/* select *from hbs_booking; */

/*================hbs_user Table===========================*/

CREATE TABLE `hbs_user` (
  `user_name` varchar(255) NOT NULL,
  `user_passward` varchar(255) NOT NULL,
  `user_email` varchar(255) NOT NULL,
  `user_type` enum('admin','customer','shop') NOT NULL,
  PRIMARY KEY (`user_email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/* insert ismail */
INSERT INTO `hbs`.`hbs_user`
(`user_name`,
`user_passward`,
`user_email`,
`user_type`)
VALUES
('ismail',
'open123',
'ismail.fakir@cloudcentrik.net',
'admin');

/* select * from hbs_user; */



