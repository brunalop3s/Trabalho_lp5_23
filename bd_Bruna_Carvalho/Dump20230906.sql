CREATE DATABASE  IF NOT EXISTS `db_bruna_carvalho` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `db_bruna_carvalho`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: 10.7.0.51    Database: db_bruna_carvalho
-- ------------------------------------------------------
-- Server version	5.7.43

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
-- Table structure for table `Compra_BLF`
--

DROP TABLE IF EXISTS `Compra_BLF`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Compra_BLF` (
  `id_compra_BLF` int(11) NOT NULL,
  `dataCompra_BLF` date NOT NULL,
  `totalCompra_BLF` decimal(10,2) NOT NULL,
  `statusPagamento_BLF` varchar(10) NOT NULL,
  `metodoPagamento_BLF` varchar(45) NOT NULL,
  `fk_fornecedor_BLF` int(11) NOT NULL,
  `fk_usuario_BLF` int(11) NOT NULL,
  PRIMARY KEY (`id_compra_BLF`),
  KEY `fK_fornecedor _idx` (`fk_fornecedor_BLF`),
  KEY `fk_usuario _idx` (`fk_usuario_BLF`),
  CONSTRAINT `fK_fornecedor ` FOREIGN KEY (`fk_fornecedor_BLF`) REFERENCES `Fornecedor_BLF` (`id_fornecedor_BLF`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuario ` FOREIGN KEY (`fk_usuario_BLF`) REFERENCES `Usuario_BLF` (`id_usuario_BLF`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Compra_BLF`
--

LOCK TABLES `Compra_BLF` WRITE;
/*!40000 ALTER TABLE `Compra_BLF` DISABLE KEYS */;
/*!40000 ALTER TABLE `Compra_BLF` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Compra_Produto_BLF`
--

DROP TABLE IF EXISTS `Compra_Produto_BLF`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Compra_Produto_BLF` (
  `id_compraProduto_BLF` int(11) NOT NULL,
  `fk_compra_BLF` int(11) NOT NULL,
  `fk_produto_BLF` int(11) NOT NULL,
  `quantidade_BLF` int(11) NOT NULL,
  `valorUnitario_BLF` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id_compraProduto_BLF`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Compra_Produto_BLF`
--

LOCK TABLES `Compra_Produto_BLF` WRITE;
/*!40000 ALTER TABLE `Compra_Produto_BLF` DISABLE KEYS */;
/*!40000 ALTER TABLE `Compra_Produto_BLF` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Fornecedor_BLF`
--

DROP TABLE IF EXISTS `Fornecedor_BLF`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Fornecedor_BLF` (
  `id_fornecedor_BLF` int(11) NOT NULL,
  `cnpj_BLF` varchar(20) NOT NULL,
  `empresa_ou_pessoa_BLF` varchar(45) NOT NULL,
  `telefone_BLF` varchar(15) NOT NULL,
  `endereco_BLF` varchar(40) NOT NULL,
  `bairro_BLF` varchar(25) NOT NULL,
  `cidade_BLF` varchar(25) NOT NULL,
  `uf_BLF` varchar(2) NOT NULL,
  `cep_BLF` varchar(10) NOT NULL,
  `email_BLF` varchar(20) NOT NULL,
  PRIMARY KEY (`id_fornecedor_BLF`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Fornecedor_BLF`
--

LOCK TABLES `Fornecedor_BLF` WRITE;
/*!40000 ALTER TABLE `Fornecedor_BLF` DISABLE KEYS */;
INSERT INTO `Fornecedor_BLF` VALUES (1,'11.111.111/1111-11','Complexo','(99) 9999-9999 ','Lagoa','Jacaré','Rio de Janeiro','ms','77777-777','Complexo@gmail.com');
/*!40000 ALTER TABLE `Fornecedor_BLF` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Produto_BLF`
--

DROP TABLE IF EXISTS `Produto_BLF`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Produto_BLF` (
  `id_produto_BLF` int(11) NOT NULL,
  `nome_BLF` varchar(35) NOT NULL,
  `categoria_BLF` varchar(20) NOT NULL,
  `marca_BLF` varchar(30) NOT NULL,
  `preco_BLF` decimal(10,2) NOT NULL,
  `genero_BLF` varchar(1) NOT NULL,
  `tamanho_BLF` varchar(3) NOT NULL,
  `quantidade_BLF` int(11) NOT NULL,
  PRIMARY KEY (`id_produto_BLF`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Produto_BLF`
--

LOCK TABLES `Produto_BLF` WRITE;
/*!40000 ALTER TABLE `Produto_BLF` DISABLE KEYS */;
/*!40000 ALTER TABLE `Produto_BLF` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Usuario_BLF`
--

DROP TABLE IF EXISTS `Usuario_BLF`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Usuario_BLF` (
  `id_usuario_BLF` int(11) NOT NULL,
  `nome_BLF` varchar(45) NOT NULL,
  `apelido_BLF` varchar(45) NOT NULL,
  `cpf_BLF` varchar(15) NOT NULL,
  `dataNascimento_BLF` date NOT NULL,
  `senha_BLF` varchar(15) NOT NULL,
  `nivel_BLF` int(11) NOT NULL,
  `ativo_BLF` varchar(1) NOT NULL,
  PRIMARY KEY (`id_usuario_BLF`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Usuario_BLF`
--

LOCK TABLES `Usuario_BLF` WRITE;
/*!40000 ALTER TABLE `Usuario_BLF` DISABLE KEYS */;
INSERT INTO `Usuario_BLF` VALUES (1,'Carla Araujo','Araujo','123.654.789-63','2012-01-12','123654',1,'S');
/*!40000 ALTER TABLE `Usuario_BLF` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario_BLF`
--

DROP TABLE IF EXISTS `funcionario_BLF`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionario_BLF` (
  `id_funcionario_BLF` int(11) NOT NULL,
  `nome_BLF` varchar(45) NOT NULL,
  `apelido_BLF` varchar(45) NOT NULL,
  `sexo_BLF` varchar(10) NOT NULL,
  `dataNascimento_BLF` date NOT NULL,
  `cpf_BLF` varchar(11) NOT NULL,
  `celular_BLF` varchar(9) NOT NULL,
  `telefoneResidencial_BLF` varchar(8) NOT NULL,
  `cep_BLF` varchar(9) NOT NULL,
  `endereco_BLF` varchar(40) NOT NULL,
  `bairro_BLF` varchar(25) NOT NULL,
  `cidade_BLF` varchar(25) NOT NULL,
  `uf_BLF` varchar(2) NOT NULL,
  `email_BLF` varchar(45) NOT NULL,
  `ativo_BLF` varchar(1) NOT NULL,
  PRIMARY KEY (`id_funcionario_BLF`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario_BLF`
--

LOCK TABLES `funcionario_BLF` WRITE;
/*!40000 ALTER TABLE `funcionario_BLF` DISABLE KEYS */;
INSERT INTO `funcionario_BLF` VALUES (1,'Reinaldo','Rei','M','3906-01-14','22233344455','488465465','34315684','551515','carlos','ferroviaria','ponta','MS','reidelass@gmail.com','T'),(5,'Reinaldo','Rei','M','3906-01-14','22233344455','488465465','34315684','551515','carlos','ferroviaria','ponta','MS','reidelass@gmail.com','T'),(15,'Reinaldo','Rei','M','3906-01-14','22233344455','488465465','34315684','551515','carlos','ferroviaria','ponta','MS','reidelass@gmail.com','T');
/*!40000 ALTER TABLE `funcionario_BLF` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-06  9:01:10
