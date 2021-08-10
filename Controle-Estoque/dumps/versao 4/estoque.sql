-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: estoque
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `fornecedorjuridica`
--

DROP TABLE IF EXISTS `fornecedorjuridica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fornecedorjuridica` (
  `nomefantasia` varchar(45) NOT NULL,
  `categoria` varchar(45) NOT NULL,
  `cep` varchar(45) NOT NULL,
  `endereco` varchar(45) NOT NULL,
  `numero` int NOT NULL,
  `estado` varchar(45) NOT NULL,
  `cidade` varchar(45) NOT NULL,
  `bairro` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `telefone` varchar(45) NOT NULL,
  `celular` varchar(45) NOT NULL,
  `site` varchar(45) NOT NULL,
  `cnpj` varchar(45) NOT NULL,
  `observacao` varchar(45) NOT NULL,
  `razaosocial` varchar(45) NOT NULL,
  `inscest` varchar(45) NOT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=armscii8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fornecedorjuridica`
--

LOCK TABLES `fornecedorjuridica` WRITE;
/*!40000 ALTER TABLE `fornecedorjuridica` DISABLE KEYS */;
INSERT INTO `fornecedorjuridica` VALUES ('1','1','1','1',1,'1','1','1','1','1','1','1','1','1','1','1',1);
/*!40000 ALTER TABLE `fornecedorjuridica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fornecedorpfisica`
--

DROP TABLE IF EXISTS `fornecedorpfisica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fornecedorpfisica` (
  `nome` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `categoria` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `cep` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `endereco` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `numero` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `estado` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `cidade` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `bairro` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `telefone` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `celular` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `site` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `cpf` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `observacao` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fornecedorpfisica`
--

LOCK TABLES `fornecedorpfisica` WRITE;
/*!40000 ALTER TABLE `fornecedorpfisica` DISABLE KEYS */;
INSERT INTO `fornecedorpfisica` VALUES ('1','1','1','1','1','1','1','1','1','1','1','1','1','1',1),('2','12','12','12','12','12','12','12','12','12','12','12','12','1',2);
/*!40000 ALTER TABLE `fornecedorpfisica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionario` (
  `nome` varchar(255) NOT NULL,
  `cpf` varchar(255) NOT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `cargo` varchar(255) NOT NULL,
  `telefone` varchar(255) NOT NULL,
  `usuario` varchar(255) NOT NULL,
  `senha` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` VALUES ('Antonio','3333333333',27,'Admin','3599259558','admin','admin'),('Strauss','11111111111',30,'professor','1111111111','admin','admin');
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto` (
  `nome` varchar(255) NOT NULL,
  `tipo_produto` varchar(255) NOT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `quantidade` int NOT NULL,
  `preco` double NOT NULL,
  `validade` varchar(255) NOT NULL,
  `fornecedor` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES ('Coca cola','Alimentos perecíveis',5,5,8,'22/10/2022','Pepsico'),('teste','Alimentos perecíveis',6,5,5,'15/02/30','Natura'),('Coca cola espumante','Bebidas',7,10,8,'22/07/2025','Pepsico'),('Teste','Higiene Pessoal',8,5,5,'22/11/2026','Teste'),('a','Alimentos perecíveis',9,1,1,'1','1');
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-09 23:53:55
