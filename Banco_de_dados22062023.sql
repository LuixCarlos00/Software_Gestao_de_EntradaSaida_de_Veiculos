-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: gestao_de_carros
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `empresas`
--

DROP TABLE IF EXISTS `empresas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empresas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `cnpj` varchar(18) NOT NULL,
  `fax` varchar(20) NOT NULL,
  `endereco` varchar(120) NOT NULL,
  `uf` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresas`
--

LOCK TABLES `empresas` WRITE;
/*!40000 ALTER TABLE `empresas` DISABLE KEYS */;
INSERT INTO `empresas` VALUES (6,'Oficina Auto Mecanica','12.345.582/0000-25','37 33235589','R Manoel Braga','Minas Gerais (MG)'),(7,'Roda Livre','68.451.354/0000-58','11 998162514','R. Conselheiro Áureliano Oliveira, 334-512, Mutuípe ','Bahia (BA)'),(8,'AutoParts Brasil','56.132.065/0000-78','33 33254875','R. João Muniz Barreto, 94 - Centro, Santaluz ','Bahia (BA)'),(9,'Mecânica do Motor','25.465.254/0000-11','12 312255165','R Paraiba Cabral, Espirito Novo, 522','Mato Grosso (MT)'),(10,'Minas Motores LTDA','64.554.354/0010-25','42 33691587','R. Doze de Outubro, 11-9, São Domingos do Maranhão ','Maranhão (MA)'),(11,'Kade Peças ','55.487.238/1000-45','61 32568975','R. Belchior de Faria, 63-1, Centralina ','Minas Gerais (MG)'),(12,'Retifica Motores','44.165.384/0000-35','15 998524682','Av. Salvador Goulart Guedes - Bairro Alvorada, Pains - MG','Paraná (PR)');
/*!40000 ALTER TABLE `empresas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionarios`
--

DROP TABLE IF EXISTS `funcionarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `cpf` varchar(45) NOT NULL,
  `data_nascimento` varchar(45) NOT NULL,
  `setor` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionarios`
--

LOCK TABLES `funcionarios` WRITE;
/*!40000 ALTER TABLE `funcionarios` DISABLE KEYS */;
INSERT INTO `funcionarios` VALUES (10,'L.Hamilton','457.485.742-57','25/03/1996','Contabilidade'),(11,'Iniesta','554.875.468-76','16/02/1963','Moagem'),(12,'Messi de Souza','856.546.873-58','02/05/1988','Administração'),(13,'C Ronaldo','458.432.184-51','01/02/1995','Segurança do Trabalho'),(14,'Neymar Jr','659.856.265-49','01/02/1999','Oficina de Auto'),(16,'Fredd','265.484.956-56','07/09/1999','Forno'),(17,'Pele','545.846.549-85','12/06/1972','Almoxarifado'),(18,'Buffon','549.843.218-43','11/08/1980','Britagem'),(19,'Tafarel','654.843.269-83','22/04/1977','Almoxarifado'),(20,'Maape','595.956.595-62','12/19/2000','Moagem'),(21,'Ronaldinho','865.435.451-84','12/05/1967','Contabilidade'),(22,'kaka','254.821.654-35','12/08/1999','Moagem'),(23,'teste','111.111.111-11','11/11/1111','Administração'),(24,'Michael Jordan','154.985.352-45','15/12/1988','Administração'),(25,'Messi de oliveira','489.638.635-98','18/11/1983','Britagem'),(26,'Messi da silva','659.562.658-55','18/11/1983','Almoxarifado'),(28,'Lebrom','564.646.546-28','29/06/1988','Laboratorio'),(29,'Guilherme Pereira Alves','123.123.123-12','25/10/1999','Segurança do Trabalho'),(30,'Laura pereira','151.845.985-45','15/09/1998','Diretoria'),(31,'Renato Abani','154.851.313-54','28/07/1963','Terceirizado'),(32,'unifor','285.733.370-60','01/01/2001','Terceirizado');
/*!40000 ALTER TABLE `funcionarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movimentacoes`
--

DROP TABLE IF EXISTS `movimentacoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movimentacoes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tipo` varchar(20) NOT NULL,
  `id_veiculo` int NOT NULL,
  `id_funcionario` int NOT NULL,
  `data` varchar(45) NOT NULL,
  `hora` varchar(10) NOT NULL,
  `destino` varchar(45) NOT NULL,
  `quilometragem` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_veiculo_idx` (`id_veiculo`),
  KEY `id_funcionario_idx` (`id_funcionario`),
  CONSTRAINT `id_funcionario` FOREIGN KEY (`id_funcionario`) REFERENCES `funcionarios` (`id`),
  CONSTRAINT `id_veiculo` FOREIGN KEY (`id_veiculo`) REFERENCES `veiculos` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimentacoes`
--

LOCK TABLES `movimentacoes` WRITE;
/*!40000 ALTER TABLE `movimentacoes` DISABLE KEYS */;
INSERT INTO `movimentacoes` VALUES (4,'ENTRADA',5,10,'22/22/2222','11:25','empresa',220),(5,'SAIDA',16,10,'27/05/2023','10:00','GECAL SERRA',1000),(6,'ENTRADA',16,10,'27/05/2023','11:00','',1100),(7,'SAIDA',6,11,'11/11/1111','11:11','centro',100),(8,'ENTRADA',6,11,'11/11/1111','11:11','Empresa',101),(9,'SAIDA',10,10,'01/02/2000','12:00','centro',1000),(10,'ENTRADA',10,10,'13/02/2000','12:00','Empresa',1001);
/*!40000 ALTER TABLE `movimentacoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `requisicao`
--

DROP TABLE IF EXISTS `requisicao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `requisicao` (
  `id` int NOT NULL AUTO_INCREMENT,
  `itens` varchar(120) NOT NULL,
  `quantidade` float NOT NULL,
  `valor_unitario` float NOT NULL,
  `empresa` varchar(45) NOT NULL,
  `veiculo` varchar(45) NOT NULL,
  `placa_veiculo` varchar(45) NOT NULL,
  `funcionario` varchar(45) NOT NULL,
  `data` varchar(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `requisicao`
--

LOCK TABLES `requisicao` WRITE;
/*!40000 ALTER TABLE `requisicao` DISABLE KEYS */;
INSERT INTO `requisicao` VALUES (1,'embreagem',1,1200,'Oficina Auto Mecanica','Palio','VML6985','Neymar Jr','05/06/2023'),(2,'peças de motores',5,250,'Minas Motores LTDA','Palio','VML6985','L.Hamilton','02/04/2023'),(3,'pneu mirelle',4,250,'Oficina Auto Mecanica','Palio','VML6985','L.Hamilton','02/05/2023'),(4,'manutenção na pastilha de freio ',4,89.9,'Mecânica do Motor','coroa','CBD1238','Buffon','26/05/2023'),(5,'oleo castrol ',5,432,'Oficina Auto Mecanica','mustang','WKT5194','Pele','05/02/2023'),(6,'rodas de liga leve aro 17',6,685,'Roda Livre','skyline','YJK5584','Iniesta','25/04/2023'),(8,'peças de freio ',8,300,'AutoParts Brasil','Nissan 350Z','LKH8524','Fredd','02/04/2023'),(9,'peças de motores',5,250,'Minas Motores LTDA','Palio','VML6985','Neymar Jr','25/05/2023'),(10,'pistao de motor',10,150,'Retifica Motores','Corola','SFA5284','C Ronaldo','16/05/2023'),(11,'Cabeçote de motor refificado ',1,1854,'Retifica Motores','honda','CBD1238','Fredd','02/06/2021'),(13,'MOTOR',1,1000,'Kade Peças ','TESTE','OQC2122','L.Hamilton','27/05/2023'),(14,'TURBO',1,12,'Minas Motores LTDA','TESTE','OQC2122','Messi de Souza','29/05/2023'),(15,'RODA DE LIGA LEV AR0 17',4,250,'Minas Motores LTDA','Corola','WSD9878','L.Hamilton','02/04/2023');
/*!40000 ALTER TABLE `requisicao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabela_adm`
--

DROP TABLE IF EXISTS `tabela_adm`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabela_adm` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL,
  `admin` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabela_adm`
--

LOCK TABLES `tabela_adm` WRITE;
/*!40000 ALTER TABLE `tabela_adm` DISABLE KEYS */;
INSERT INTO `tabela_adm` VALUES (1,'root','root','');
/*!40000 ALTER TABLE `tabela_adm` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL,
  `admin` varchar(45) DEFAULT NULL,
  `cpf` varchar(45) NOT NULL,
  PRIMARY KEY (`id`,`cpf`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (28,'w','a','N','111.111.111-11'),(29,'a','a','N','222.222.222-22'),(30,'h','a','N','333.333.333-33'),(31,'a','a','N','444.444.444-44'),(32,'a','a','N','555.555.555-55'),(33,'a','a','N','666.666.666-66'),(34,'a','a','N','777.777.777-77'),(35,'q','a','N','147.768.156-64'),(37,'unifor','123456','N','614.487.450.04'),(38,'unifor','a','N','285.733.370-60');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `veiculos`
--

DROP TABLE IF EXISTS `veiculos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `veiculos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `placa` varchar(8) NOT NULL,
  `marca` varchar(45) NOT NULL,
  `modelo` varchar(45) NOT NULL,
  `ano` varchar(45) NOT NULL,
  `status` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `veiculos`
--

LOCK TABLES `veiculos` WRITE;
/*!40000 ALTER TABLE `veiculos` DISABLE KEYS */;
INSERT INTO `veiculos` VALUES (3,'WML6985','Fiat','Palio','2008','DISPONIVEL'),(5,'LKH8524','Nissan','Nissan 350Z','2005','DISPONIVEL'),(6,'MJF8421','fiat','doblo','2013','DISPONIVEL'),(10,'WSD9878','Chevrolet','Corola','2023','DISPONIVEL'),(11,'XRT5245','chevrolet','opala','1988','DISPONIVEL'),(12,'SFA5284','corola','honda','2010','DISPONIVEL'),(13,'CBD1238','honda','coroa','2005','DISPONIVEL'),(14,'WKT5194','ford','mustang','2019','DISPONIVEL'),(15,'YJK5584','Nissan','skyline','2011','DISPONIVEL'),(16,'OQC2122','VOLVO','AE104','2021','DISPONIVEL'),(17,'RTF1536','Lamborguine','Huracán','2023','DISPONIVEL'),(18,'APK1289','Porsche ','Porche 911','2017','DISPONIVEL'),(19,'HTV8A54','MCLaren','McLaren 720S','2015','DISPONIVEL'),(20,'CMG2564','toyota','novo','2000','DISPONIVEL'),(21,'VML6985','Fiat','Cronos','2015','DISPONIVEL');
/*!40000 ALTER TABLE `veiculos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'gestao_de_carros'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-22 16:30:02
