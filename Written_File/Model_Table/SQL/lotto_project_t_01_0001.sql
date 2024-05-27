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
-- Table structure for table `t_01_0001`
--

DROP TABLE IF EXISTS `t_01_0001`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_01_0001` (
  `t_serial_number_1` int(11) NOT NULL AUTO_INCREMENT,
  `t_code_1` varchar(45) DEFAULT NULL,
  `t_describe_1` varchar(45) DEFAULT NULL,
  `t_describe_2` varchar(45) DEFAULT NULL,
  `t_date_1` datetime DEFAULT NULL,
  `t_date_2` datetime DEFAULT NULL,
  `table_name` varchar(45) DEFAULT NULL,
  `t_user` varchar(45) DEFAULT NULL,
  `t_special_treatment_1` varchar(45) DEFAULT NULL,
  `delete_bol` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`t_serial_number_1`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_01_0001`
--

LOCK TABLES `t_01_0001` WRITE;
/*!40000 ALTER TABLE `t_01_0001` DISABLE KEYS */;
INSERT INTO `t_01_0001` VALUES (3,'01','樂透_樂透種類_改','樂透_樂透種類(英文)_改','2024-05-17 09:31:27','2024-05-20 14:51:19','T_01_0001','','','N'),(4,'02','是或否','是或否(英文)','2024-05-20 14:16:19','2024-05-23 10:08:08','T_01_0001','','','N'),(5,'03','性別','性別(英文)','2024-05-23 10:10:16','2024-05-23 10:10:16','T_01_0001','','','N'),(6,'04','寄信主旨','寄信主旨(英文)','2024-05-24 14:02:15','2024-05-24 14:02:15','T_01_0001','','','N'),(7,'05','寄信內容','寄信內容(英文)','2024-05-24 14:02:49','2024-05-24 14:02:49','T_01_0001','','','N');
/*!40000 ALTER TABLE `t_01_0001` ENABLE KEYS */;
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
