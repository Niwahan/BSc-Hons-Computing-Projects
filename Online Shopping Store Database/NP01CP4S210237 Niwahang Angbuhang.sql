-- MariaDB dump 10.19  Distrib 10.4.18-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: TakutonOnline
-- ------------------------------------------------------
-- Server version	10.4.18-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `CustomerID` int(11) NOT NULL AUTO_INCREMENT,
  `FullName` varchar(255) NOT NULL,
  `PhoneNumber` varchar(255) NOT NULL,
  `Address` varchar(255) NOT NULL,
  PRIMARY KEY (`CustomerID`),
  UNIQUE KEY `PhoneNumber` (`PhoneNumber`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'Niwahang Angbuhang','9818284883','Kathmandu'),(2,'Sandesh Shrestha','9823088370','Lalitpur'),(3,'Bikesh Shrestha','9841859741','Bhaktapur'),(4,'Sikum Hang Angdembe','9818585774','Panchthar'),(5,'Bibek Ale Magar','9823056972','Sindhuli'),(6,'Niraj Sigdel','9841256741','Sindhupalchok'),(7,'Suaagra Neupane','9867153408','Ramechhap'),(8,'Nima Sherpa','9842357910','Solukhumbu'),(9,'Bikash Lama','9814526873','Morang'),(10,'Arun Subedi','9818247603','Ilam');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `delivery`
--

DROP TABLE IF EXISTS `delivery`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `delivery` (
  `DeliveryID` int(11) NOT NULL,
  `Confirmation` varchar(255) DEFAULT 'Not Delivered',
  `DeliveryDate` date DEFAULT NULL,
  PRIMARY KEY (`DeliveryID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delivery`
--

LOCK TABLES `delivery` WRITE;
/*!40000 ALTER TABLE `delivery` DISABLE KEYS */;
INSERT INTO `delivery` VALUES (104,'Delivered','2019-11-12'),(147,'Delivered','2019-12-29'),(163,'Delivered','2020-01-11'),(169,'Delivered','2020-01-19'),(185,'Delivered','2020-01-30'),(200,'Delivered','2020-02-08'),(209,'Delivered','2020-02-14'),(224,'Delivered','2020-02-25'),(239,'Delivered','2020-03-15'),(376,'Delivered','2020-05-01'),(399,'Delivered','2020-05-24');
/*!40000 ALTER TABLE `delivery` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `EmployeeID` int(11) NOT NULL,
  `FullName` varchar(255) NOT NULL,
  `Address` varchar(255) DEFAULT 'Address not given',
  PRIMARY KEY (`EmployeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (4,'Ragav Baskota','Jhapa'),(15,'Ram Bhujel','Chitwan'),(30,'Manoj Rai','Taplejung'),(36,'Nikita Pokhrel','Pokhara'),(44,'Apsara Tamang','Doti'),(49,'Sapana Gurung','Kavrepalanchok'),(57,'Anusha Sapkota','Achaam'),(61,'Hari Limbu','Terathum'),(66,'Pasang Lama','Solukhumbu'),(69,'Dhan Bahadur Rai','Morang');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `ItemID` int(11) NOT NULL,
  `ItemName` varchar(255) NOT NULL,
  `ItemPrice` int(11) NOT NULL,
  PRIMARY KEY (`ItemID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES (7,'PlayStation 5',60000),(21,'Smart OLED 4K TV',40000),(24,'Washing Machine',7000),(32,'Vacuum Cleaner',5000),(48,'iPhone 12',180000),(64,'Guitar',15000),(84,'Hoodie',3500),(85,'Jacket',4200),(103,'Whisky',5300),(145,'MacBook Pro',325000),(210,'Blanket',2000);
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order` (
  `OrderID` int(11) NOT NULL,
  `Customer` int(11) DEFAULT NULL,
  `Item` int(11) DEFAULT NULL,
  `OrderDate` date DEFAULT NULL,
  `Employee` int(11) DEFAULT NULL,
  `Delivery` int(11) DEFAULT NULL,
  PRIMARY KEY (`OrderID`),
  KEY `Customer` (`Customer`),
  KEY `Item` (`Item`),
  KEY `Employee` (`Employee`),
  KEY `Delivery` (`Delivery`),
  CONSTRAINT `order_ibfk_1` FOREIGN KEY (`Customer`) REFERENCES `customer` (`CustomerID`),
  CONSTRAINT `order_ibfk_2` FOREIGN KEY (`Item`) REFERENCES `item` (`ItemID`),
  CONSTRAINT `order_ibfk_3` FOREIGN KEY (`Employee`) REFERENCES `employee` (`EmployeeID`),
  CONSTRAINT `order_ibfk_4` FOREIGN KEY (`Delivery`) REFERENCES `delivery` (`DeliveryID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
INSERT INTO `order` VALUES (1,1,7,'2019-11-08',4,104),(2,1,21,'2019-12-24',15,147),(3,2,24,'2020-01-07',30,163),(4,3,32,'2020-01-15',36,169),(5,4,48,'2020-01-26',44,185),(6,5,64,'2020-02-06',49,200),(7,6,84,'2020-02-06',49,209),(8,7,85,'2020-02-21',57,224),(9,8,103,'2020-03-11',61,239),(10,9,145,'2020-04-29',66,376),(11,10,210,'2020-05-20',69,399);
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-27 14:08:05
