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
-- Table structure for table `t_01_0004`
--

DROP TABLE IF EXISTS `t_01_0004`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_01_0004` (
  `t_serial_number_1` int(11) NOT NULL,
  `winning_number` varchar(45) DEFAULT NULL,
  `special_winning_number_bol` varchar(45) DEFAULT NULL,
  `t_describe_1` varchar(45) DEFAULT NULL,
  `t_describe_2` varchar(45) DEFAULT NULL,
  `t_date_1` datetime DEFAULT NULL,
  `t_date_2` datetime DEFAULT NULL,
  `table_name` varchar(45) DEFAULT NULL,
  `t_special_treatment_1` varchar(45) DEFAULT NULL,
  `delete_bol` varchar(255) DEFAULT NULL,
  `t_code_1` varchar(45) DEFAULT NULL,
  `t_code_2` varchar(45) DEFAULT NULL,
  `number_sort` int(11) DEFAULT NULL,
  `t_uuid_1` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`t_serial_number_1`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_01_0004`
--

LOCK TABLES `t_01_0004` WRITE;
/*!40000 ALTER TABLE `t_01_0004` DISABLE KEYS */;
INSERT INTO `t_01_0004` VALUES (25,'15','N','第 1 個數字','第 1 個數字(英文)','2024-05-24 16:18:13','2024-05-24 16:18:13','T_01_0004','','N','01','01-B',1,'3f3d09d6-33b9-495a-80ef-04ab55a08878'),(26,'09','N','第 2 個數字','第 2 個數字(英文)','2024-05-24 16:18:13','2024-05-24 16:18:13','T_01_0004','','N','01','01-B',2,'3f3d09d6-33b9-495a-80ef-04ab55a08878'),(27,'07','N','第 3 個數字','第 3 個數字(英文)','2024-05-24 16:18:13','2024-05-24 16:18:13','T_01_0004','','N','01','01-B',3,'3f3d09d6-33b9-495a-80ef-04ab55a08878'),(28,'17','N','第 4 個數字','第 4 個數字(英文)','2024-05-24 16:18:13','2024-05-24 16:18:13','T_01_0004','','N','01','01-B',4,'3f3d09d6-33b9-495a-80ef-04ab55a08878'),(29,'04','N','第 5 個數字','第 5 個數字(英文)','2024-05-24 16:18:13','2024-05-24 16:18:13','T_01_0004','','N','01','01-B',5,'3f3d09d6-33b9-495a-80ef-04ab55a08878'),(30,'25','N','第 1 個數字','第 1 個數字(英文)','2024-05-24 16:18:13','2024-05-24 16:18:13','T_01_0004','','N','01','01-A',1,'fa460a65-001c-425f-9a38-a201084ad5fa'),(31,'38','N','第 2 個數字','第 2 個數字(英文)','2024-05-24 16:18:13','2024-05-24 16:18:13','T_01_0004','','N','01','01-A',2,'fa460a65-001c-425f-9a38-a201084ad5fa'),(32,'34','N','第 3 個數字','第 3 個數字(英文)','2024-05-24 16:18:13','2024-05-24 16:18:13','T_01_0004','','N','01','01-A',3,'fa460a65-001c-425f-9a38-a201084ad5fa'),(33,'45','N','第 4 個數字','第 4 個數字(英文)','2024-05-24 16:18:13','2024-05-24 16:18:13','T_01_0004','','N','01','01-A',4,'fa460a65-001c-425f-9a38-a201084ad5fa'),(34,'32','N','第 5 個數字','第 5 個數字(英文)','2024-05-24 16:18:13','2024-05-24 16:18:13','T_01_0004','','N','01','01-A',5,'fa460a65-001c-425f-9a38-a201084ad5fa'),(35,'21','N','第 6 個數字','第 6 個數字(英文)','2024-05-24 16:18:13','2024-05-24 16:18:13','T_01_0004','','N','01','01-A',6,'fa460a65-001c-425f-9a38-a201084ad5fa'),(36,'43','Y','第 7 個數字','第 7 個數字(英文)','2024-05-24 16:18:13','2024-05-24 16:18:13','T_01_0004','','N','01','01-A',7,'fa460a65-001c-425f-9a38-a201084ad5fa'),(37,'39','N','第 1 個數字','第 1 個數字(英文)','2024-05-24 16:19:18','2024-05-24 16:19:18','T_01_0004','','N','01','01-A',1,'73cc70d9-fc9a-4131-8058-84465e0931f9'),(38,'35','N','第 2 個數字','第 2 個數字(英文)','2024-05-24 16:19:18','2024-05-24 16:19:18','T_01_0004','','N','01','01-A',2,'73cc70d9-fc9a-4131-8058-84465e0931f9'),(39,'10','N','第 3 個數字','第 3 個數字(英文)','2024-05-24 16:19:18','2024-05-24 16:19:18','T_01_0004','','N','01','01-A',3,'73cc70d9-fc9a-4131-8058-84465e0931f9'),(40,'31','N','第 4 個數字','第 4 個數字(英文)','2024-05-24 16:19:18','2024-05-24 16:19:18','T_01_0004','','N','01','01-A',4,'73cc70d9-fc9a-4131-8058-84465e0931f9'),(41,'29','N','第 5 個數字','第 5 個數字(英文)','2024-05-24 16:19:18','2024-05-24 16:19:18','T_01_0004','','N','01','01-A',5,'73cc70d9-fc9a-4131-8058-84465e0931f9'),(42,'37','N','第 6 個數字','第 6 個數字(英文)','2024-05-24 16:19:18','2024-05-24 16:19:18','T_01_0004','','N','01','01-A',6,'73cc70d9-fc9a-4131-8058-84465e0931f9'),(43,'08','Y','第 7 個數字','第 7 個數字(英文)','2024-05-24 16:19:18','2024-05-24 16:19:18','T_01_0004','','N','01','01-A',7,'73cc70d9-fc9a-4131-8058-84465e0931f9'),(44,'17','N','第 1 個數字','第 1 個數字(英文)','2024-05-24 16:19:18','2024-05-24 16:19:18','T_01_0004','','N','01','01-B',1,'f52acffc-ea79-401b-8d38-c4d5791e0745'),(45,'03','N','第 2 個數字','第 2 個數字(英文)','2024-05-24 16:19:18','2024-05-24 16:19:18','T_01_0004','','N','01','01-B',2,'f52acffc-ea79-401b-8d38-c4d5791e0745'),(46,'08','N','第 3 個數字','第 3 個數字(英文)','2024-05-24 16:19:18','2024-05-24 16:19:18','T_01_0004','','N','01','01-B',3,'f52acffc-ea79-401b-8d38-c4d5791e0745'),(47,'04','N','第 4 個數字','第 4 個數字(英文)','2024-05-24 16:19:18','2024-05-24 16:19:18','T_01_0004','','N','01','01-B',4,'f52acffc-ea79-401b-8d38-c4d5791e0745'),(48,'18','N','第 5 個數字','第 5 個數字(英文)','2024-05-24 16:19:18','2024-05-24 16:19:18','T_01_0004','','N','01','01-B',5,'f52acffc-ea79-401b-8d38-c4d5791e0745');
/*!40000 ALTER TABLE `t_01_0004` ENABLE KEYS */;
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
