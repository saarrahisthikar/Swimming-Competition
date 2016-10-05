--1) Create a data base with the name swimming_competition
--2) Create the following table the database: swimming_competition
--3) Please update username/password in DataStorage.java [ note: default password for root will be empty]

CREATE TABLE IF NOT EXISTS `competition_result` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `competition_no` int(11) NOT NULL,
  `rank` int(11) NOT NULL,
  `name` varchar(32) NOT NULL,
  `lane_no` int(11) NOT NULL,
  `time_duration` double NOT NULL,
  `gender` varchar(32) NOT NULL,
  `stroke` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) 
