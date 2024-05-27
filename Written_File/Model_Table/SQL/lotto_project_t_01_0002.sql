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
-- Table structure for table `t_01_0002`
--

DROP TABLE IF EXISTS `t_01_0002`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_01_0002` (
  `t_serial_number_1` int(11) NOT NULL AUTO_INCREMENT,
  `t_code_1` varchar(45) DEFAULT NULL,
  `t_code_2` varchar(45) DEFAULT NULL,
  `t_describe_1` varchar(45) DEFAULT NULL,
  `t_describe_2` varchar(45) DEFAULT NULL,
  `table_name` varchar(45) DEFAULT NULL,
  `t_date_1` datetime DEFAULT NULL,
  `t_date_2` datetime DEFAULT NULL,
  `t_user` varchar(45) DEFAULT NULL,
  `t_special_treatment_1` varchar(45) DEFAULT NULL,
  `delete_bol` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`t_serial_number_1`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_01_0002`
--

LOCK TABLES `t_01_0002` WRITE;
/*!40000 ALTER TABLE `t_01_0002` DISABLE KEYS */;
INSERT INTO `t_01_0002` VALUES (7,'01','01-A','樂透-A','樂透-A(英文)','T_01_0002','2024-05-17 09:33:04','2024-05-17 09:33:04','','','N'),(8,'01','01-B','樂透-B_改','樂透-B(英文)_改','T_01_0002','2024-05-17 09:33:37','2024-05-20 14:51:19','','','N'),(9,'02','Y','是','是(英文)','T_01_0002','2024-05-20 14:17:10','2024-05-20 14:17:10','','','N'),(10,'02','N','不是','不是(英文)','T_01_0002','2024-05-20 14:17:25','2024-05-20 14:17:25','','','N'),(11,'03','M','男生','男生(英文)','T_01_0002','2024-05-23 10:16:36','2024-05-23 10:16:36','','','N'),(12,'03','G','女生','女生(英文)','T_01_0002','2024-05-23 10:16:52','2024-05-23 10:17:30','','','N'),(13,'04','01','測試信件-主旨','測試信件-主旨(英文)','T_01_0002','2024-05-24 14:03:33','2024-05-24 14:04:01','','','N'),(14,'05','01','測試信件-內容','測試信件-內容(英文)','T_01_0002','2024-05-24 14:04:21','2024-05-24 14:04:21','','','N');
/*!40000 ALTER TABLE `t_01_0002` ENABLE KEYS */;
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
