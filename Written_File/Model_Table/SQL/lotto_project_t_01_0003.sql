-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: lotto_project
-- ------------------------------------------------------
-- Server version	5.7.43-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `t_01_0003`
--

DROP TABLE IF EXISTS `t_01_0003`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_01_0003` (
  `t_serial_number_1` int(11) NOT NULL,
  `t_code_1` varchar(45) DEFAULT NULL,
  `t_code_2` varchar(45) DEFAULT NULL,
  `t_describe_1` varchar(45) DEFAULT NULL,
  `t_describe_2` varchar(45) DEFAULT NULL,
  `t_describe_3` varchar(45) DEFAULT NULL,
  `t_describe_4` varchar(45) DEFAULT NULL,
  `total_several_numbers` int(11) DEFAULT NULL,
  `winning_several_numbers` int(11) DEFAULT NULL,
  `top_winning_total_several_numbers` int(11) DEFAULT NULL,
  `special_total_several_numbers` int(11) DEFAULT NULL,
  `generally_total_several_numbers` int(11) DEFAULT NULL,
  `t_date_1` datetime DEFAULT NULL,
  `t_date_2` datetime DEFAULT NULL,
  `table_name` varchar(45) DEFAULT NULL,
  `t_special_treatment_1` varchar(45) DEFAULT NULL,
  `delete_bol` varchar(255) DEFAULT NULL,
  `lotto_price` int(11) DEFAULT NULL,
  `open_numbers` int(11) DEFAULT NULL,
  PRIMARY KEY (`t_serial_number_1`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_01_0003`
--

LOCK TABLES `t_01_0003` WRITE;
/*!40000 ALTER TABLE `t_01_0003` DISABLE KEYS */;
INSERT INTO `t_01_0003` VALUES (1,'01','01-A','樂透-A- EX: 大樂透_改','樂透-A- EX: 大樂透 (英文)_改','樂透-A- EX: 大樂透 (玩法描述)_改','樂透-A- EX: 大樂透 (玩法描述) (英文)_改',49,2,6,1,6,'2024-05-17 15:28:52','2024-05-22 11:41:55','T_01_0003','','N',50,7),(5,'01','01-B','樂透-B- EX: 小樂透_改','樂透-B- EX: 小樂透 (英文)_改','樂透-B- EX: 小樂透 (玩法描述)_改','樂透-B- EX: 小樂透 (玩法描述) (英文)_改',20,3,5,0,5,'2024-05-22 10:33:32','2024-05-22 11:39:22','T_01_0003','','N',20,5);
/*!40000 ALTER TABLE `t_01_0003` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-27 16:12:18
