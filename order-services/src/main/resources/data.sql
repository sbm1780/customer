DROP TABLE IF EXISTS orders;


CREATE TABLE `orders` (
  `id` int AUTO_INCREMENT  PRIMARY KEY,
  `created_By_User` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `dealer_id` varchar(100) DEFAULT NULL,
  `create_dt` date DEFAULT NULL
);

INSERT INTO `orders` (`created_By_User`,`email`,`create_dt`)
 VALUES ('Shanti Bhusan','sbm@xyz.com',CURDATE());
 
