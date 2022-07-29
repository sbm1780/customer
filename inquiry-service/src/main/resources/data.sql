DROP TABLE IF EXISTS dealers;


CREATE TABLE `dealers` (
  `id` int AUTO_INCREMENT  PRIMARY KEY,
  `dlr_Name` varchar(100) NOT NULL,
  `city` varchar(100) DEFAULT NULL,  
  `street` varchar(100) DEFAULT NULL
);

INSERT INTO `dealers` (`dlr_Name`,`city`,`street`)
 VALUES ('star motors','Mumbai','parkstreet');
 
