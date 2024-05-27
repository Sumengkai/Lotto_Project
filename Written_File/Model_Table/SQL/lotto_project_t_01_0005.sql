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
-- Table structure for table `t_01_0005`
--

DROP TABLE IF EXISTS `t_01_0005`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_01_0005` (
  `t_uuid_1` varchar(36) NOT NULL,
  `t_code_1` varchar(45) DEFAULT NULL,
  `t_code_2` varchar(45) DEFAULT NULL,
  `t_describe_1` varchar(45) DEFAULT NULL,
  `t_describe_2` varchar(45) DEFAULT NULL,
  `lotto_sort` int(11) DEFAULT NULL,
  `t_date_1` datetime DEFAULT NULL,
  `t_date_2` datetime DEFAULT NULL,
  `t_special_treatment_1` varchar(45) DEFAULT NULL,
  `table_name` varchar(45) DEFAULT NULL,
  `delete_bol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`t_uuid_1`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_01_0005`
--

LOCK TABLES `t_01_0005` WRITE;
/*!40000 ALTER TABLE `t_01_0005` DISABLE KEYS */;
INSERT INTO `t_01_0005` VALUES ('3f3d09d6-33b9-495a-80ef-04ab55a08878','01','01-B','第 1 期','第 1 期(英文)',1,'2024-05-24 16:17:34','2024-05-24 16:17:34','','T_01_0005','N'),('73cc70d9-fc9a-4131-8058-84465e0931f9','01','01-A','第 2 期','第 2 期(英文)',2,'2024-05-24 16:18:35','2024-05-24 16:18:35','','T_01_0005','N'),('f52acffc-ea79-401b-8d38-c4d5791e0745','01','01-B','第 2 期','第 2 期(英文)',2,'2024-05-24 16:18:35','2024-05-24 16:18:35','','T_01_0005','N'),('fa460a65-001c-425f-9a38-a201084ad5fa','01','01-A','第 1 期','第 1 期(英文)',1,'2024-05-24 16:17:34','2024-05-24 16:17:34','','T_01_0005','N');
/*!40000 ALTER TABLE `t_01_0005` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-27 16:12:19
