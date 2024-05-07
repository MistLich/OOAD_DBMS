-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: projectwf
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `user_story`
--

DROP TABLE IF EXISTS `user_story`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_story` (
  `storyid` int NOT NULL AUTO_INCREMENT,
  `description` varchar(255) NOT NULL,
  `assignedto` varchar(255) NOT NULL,
  `status` varchar(50) NOT NULL,
  `sprintid` int NOT NULL,
  `startdate` date NOT NULL,
  `enddate` date DEFAULT NULL,
  `storypoints` int NOT NULL,
  `createdby` int DEFAULT NULL,
  PRIMARY KEY (`storyid`),
  KEY `fk_user_story_assignedto` (`assignedto`),
  KEY `fk_user_story_sprint` (`sprintid`),
  KEY `fk_createdby_employee_user_story` (`createdby`),
  CONSTRAINT `fk_createdby_employee_user_story` FOREIGN KEY (`createdby`) REFERENCES `employee` (`employeeid`),
  CONSTRAINT `fk_user_story_assignedto` FOREIGN KEY (`assignedto`) REFERENCES `employee` (`username`),
  CONSTRAINT `fk_user_story_sprint` FOREIGN KEY (`sprintid`) REFERENCES `sprint` (`sprintid`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_story`
--

LOCK TABLES `user_story` WRITE;
/*!40000 ALTER TABLE `user_story` DISABLE KEYS */;
INSERT INTO `user_story` VALUES (1,'User story 1 for Sprint 1 in Project 1','JaneSmith','To Do',1,'2024-05-01','2024-05-05',5,1),(2,'User story 2 for Sprint 1 in Project 1','JaneSmith','In Progress',1,'2024-05-06','2024-05-10',8,1),(3,'User story 3 for Sprint 1 in Project 1','AliceJones','Done',1,'2024-05-11','2024-05-15',3,1),(4,'User story 1 for Sprint 2 in Project 1','AliceJones','To Do',2,'2024-05-16','2024-05-20',5,1),(5,'User story 2 for Sprint 2 in Project 1','BobBrown','In Progress',2,'2024-05-21','2024-05-25',8,7),(6,'User story 1 for Sprint 3 in Project 1','BobBrown','To Do',3,'2024-06-01','2024-06-05',5,1),(7,'User story 2 for Sprint 3 in Project 1','EvaWilson','In Progress',3,'2024-06-06','2024-06-10',8,7),(8,'User story 1 for Sprint 4 in Project 1','EvaWilson','To Do',4,'2024-06-16','2024-06-20',5,7),(9,'User story 2 for Sprint 4 in Project 1','JaneSmith','In Progress',4,'2024-06-21','2024-06-25',8,1),(10,'User story 1 for Sprint 5 in Project 1','JaneSmith','To Do',5,'2024-07-01','2024-07-05',5,1),(11,'User story 2 for Sprint 5 in Project 1','AliceJones','In Progress',5,'2024-07-06','2024-07-10',8,1),(12,'User story 1 for Sprint 1 in Project 2','AliceJones','To Do',6,'2024-06-15','2024-06-20',5,1),(13,'User story 2 for Sprint 1 in Project 2','BobBrown','In Progress',6,'2024-06-21','2024-06-25',8,7),(14,'User story 1 for Sprint 2 in Project 2','BobBrown','To Do',7,'2024-07-01','2024-07-05',5,7),(15,'User story 2 for Sprint 2 in Project 2','JaneSmith','In Progress',7,'2024-07-06','2024-07-10',8,1),(16,'User story 1 for Sprint 3 in Project 2','JaneSmith','To Do',8,'2024-07-16','2024-07-20',5,7),(17,'User story 2 for Sprint 3 in Project 2','AliceJones','In Progress',8,'2024-07-21','2024-07-25',8,1),(18,'User story 1 for Sprint 1 in Project 3','AliceJones','To Do',9,'2024-07-01','2024-07-05',5,7),(19,'User story 2 for Sprint 1 in Project 3','BobBrown','In Progress',9,'2024-07-06','2024-07-10',8,7),(20,'User story 1 for Sprint 2 in Project 3','BobBrown','To Do',10,'2024-07-16','2024-07-20',5,1),(21,'User story 2 for Sprint 2 in Project 3','JaneSmith','In Progress',10,'2024-07-21','2024-07-25',8,1),(22,'User story 1 for Sprint 3 in Project 3','JaneSmith','To Do',11,'2024-08-01','2024-08-05',5,7),(23,'User story 2 for Sprint 3 in Project 3','AliceJones','In Progress',11,'2024-08-06','2024-08-10',8,1),(24,'User story 1 for Sprint 1 in Project 4','AliceJones','To Do',12,'2024-08-01','2024-08-05',5,7),(25,'User story 2 for Sprint 1 in Project 4','BobBrown','In Progress',12,'2024-08-06','2024-08-10',8,7),(26,'User story 1 for Sprint 2 in Project 4','BobBrown','To Do',13,'2024-08-16','2024-08-20',5,1),(27,'User story 2 for Sprint 2 in Project 4','JaneSmith','In Progress',13,'2024-08-21','2024-08-25',8,1),(28,'User story 1 for Sprint 1 in Project 5','JaneSmith','To Do',14,'2024-09-15','2024-09-20',5,1),(29,'User story 2 for Sprint 1 in Project 5','AliceJones','In Progress',14,'2024-09-21','2024-09-25',8,1);
/*!40000 ALTER TABLE `user_story` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-07 15:07:53
