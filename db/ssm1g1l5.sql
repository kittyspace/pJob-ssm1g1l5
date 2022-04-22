-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssm1g1l5
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssm1g1l5/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssm1g1l5/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssm1g1l5/upload/picture3.jpg'),(6,'homepage',NULL),(7,'新背景',''),(8,'新背景','');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussliguanxinxi`
--

DROP TABLE IF EXISTS `discussliguanxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussliguanxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615174139915 DEFAULT CHARSET=utf8 COMMENT='离馆信息评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussliguanxinxi`
--

LOCK TABLES `discussliguanxinxi` WRITE;
/*!40000 ALTER TABLE `discussliguanxinxi` DISABLE KEYS */;
INSERT INTO `discussliguanxinxi` VALUES (81,'2021-03-08 03:10:55',1,1,'评论内容1','回复内容1'),(82,'2021-03-08 03:10:55',2,2,'评论内容2','回复内容2'),(83,'2021-03-08 03:10:55',3,3,'评论内容3','回复内容3'),(84,'2021-03-08 03:10:55',4,4,'评论内容4','回复内容4'),(85,'2021-03-08 03:10:55',5,5,'评论内容5','回复内容5'),(86,'2021-03-08 03:10:55',6,6,'评论内容6','回复内容6'),(1615174139914,'2021-03-08 03:28:59',45,1615174069722,'好宽敞',NULL);
/*!40000 ALTER TABLE `discussliguanxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusstushuguanxinxi`
--

DROP TABLE IF EXISTS `discusstushuguanxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusstushuguanxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615174102266 DEFAULT CHARSET=utf8 COMMENT='图书馆信息评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusstushuguanxinxi`
--

LOCK TABLES `discusstushuguanxinxi` WRITE;
/*!40000 ALTER TABLE `discusstushuguanxinxi` DISABLE KEYS */;
INSERT INTO `discusstushuguanxinxi` VALUES (61,'2021-03-08 03:10:55',1,1,'评论内容1','回复内容1'),(62,'2021-03-08 03:10:55',2,2,'评论内容2','回复内容2'),(63,'2021-03-08 03:10:55',3,3,'评论内容3','回复内容3'),(64,'2021-03-08 03:10:55',4,4,'评论内容4','回复内容4'),(65,'2021-03-08 03:10:55',5,5,'评论内容5','回复内容5'),(66,'2021-03-08 03:10:55',6,6,'评论内容6','回复内容6'),(1615174102265,'2021-03-08 03:28:21',25,1615174069722,'环境不错',NULL);
/*!40000 ALTER TABLE `discusstushuguanxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussyuyuexinxi`
--

DROP TABLE IF EXISTS `discussyuyuexinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussyuyuexinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615174122411 DEFAULT CHARSET=utf8 COMMENT='预约信息评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussyuyuexinxi`
--

LOCK TABLES `discussyuyuexinxi` WRITE;
/*!40000 ALTER TABLE `discussyuyuexinxi` DISABLE KEYS */;
INSERT INTO `discussyuyuexinxi` VALUES (71,'2021-03-08 03:10:55',1,1,'评论内容1','回复内容1'),(72,'2021-03-08 03:10:55',2,2,'评论内容2','回复内容2'),(73,'2021-03-08 03:10:55',3,3,'评论内容3','回复内容3'),(74,'2021-03-08 03:10:55',4,4,'评论内容4','回复内容4'),(75,'2021-03-08 03:10:55',5,5,'评论内容5','回复内容5'),(76,'2021-03-08 03:10:55',6,6,'评论内容6','回复内容6'),(1615174122410,'2021-03-08 03:28:41',33,1615174069722,'好漂亮',NULL);
/*!40000 ALTER TABLE `discussyuyuexinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `liguanxinxi`
--

DROP TABLE IF EXISTS `liguanxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `liguanxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xinxibianhao` varchar(200) DEFAULT NULL COMMENT '信息编号',
  `tushuguanmingcheng` varchar(200) DEFAULT NULL COMMENT '图书馆名称',
  `xiangguantupian` varchar(200) DEFAULT NULL COMMENT '相关图片',
  `dizhi` varchar(200) DEFAULT NULL COMMENT '地址',
  `loucengxinxi` varchar(200) DEFAULT NULL COMMENT '楼层信息',
  `zuowei` int(11) DEFAULT NULL COMMENT '座位',
  `gerenzhanghao` varchar(200) DEFAULT NULL COMMENT '个人账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `liguanshijian` date DEFAULT NULL COMMENT '离馆时间',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615174306876 DEFAULT CHARSET=utf8 COMMENT='离馆信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `liguanxinxi`
--

LOCK TABLES `liguanxinxi` WRITE;
/*!40000 ALTER TABLE `liguanxinxi` DISABLE KEYS */;
INSERT INTO `liguanxinxi` VALUES (41,'2021-03-08 03:10:55','信息编号1','图书馆名称1','http://localhost:8080/ssm1g1l5/upload/liguanxinxi_xiangguantupian1.jpg','地址1','一层',1,'个人账号1','姓名1','2021-03-08','是','',1,1),(42,'2021-03-08 03:10:55','信息编号2','图书馆名称2','http://localhost:8080/ssm1g1l5/upload/liguanxinxi_xiangguantupian2.jpg','地址2','一层',2,'个人账号2','姓名2','2021-03-08','是','',2,2),(43,'2021-03-08 03:10:55','信息编号3','图书馆名称3','http://localhost:8080/ssm1g1l5/upload/liguanxinxi_xiangguantupian3.jpg','地址3','一层',3,'个人账号3','姓名3','2021-03-08','是','',3,3),(44,'2021-03-08 03:10:55','信息编号4','图书馆名称4','http://localhost:8080/ssm1g1l5/upload/liguanxinxi_xiangguantupian4.jpg','地址4','一层',4,'个人账号4','姓名4','2021-03-08','是','',4,4),(45,'2021-03-08 03:10:55','信息编号5','图书馆名称5','http://localhost:8080/ssm1g1l5/upload/liguanxinxi_xiangguantupian5.jpg','地址5','一层',5,'个人账号5','姓名5','2021-03-08','是','',6,6),(46,'2021-03-08 03:10:55','信息编号6','图书馆名称6','http://localhost:8080/ssm1g1l5/upload/liguanxinxi_xiangguantupian6.jpg','地址6','一层',6,'个人账号6','姓名6','2021-03-08','是','',6,6),(1615174306875,'2021-03-08 03:31:46','1615174157322','高级图书馆','http://localhost:8080/ssm1g1l5/upload/1615174196541.jpg','市区附近','一层',5,'111','无名','2021-01-01','是','离馆通过',0,0);
/*!40000 ALTER TABLE `liguanxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615174383485 DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
INSERT INTO `storeup` VALUES (1615174383484,'2021-03-08 03:33:03',1615174069722,1615174227988,'tushuguanxinxi','高级图书馆','http://localhost:8080/ssm1g1l5/upload/1615174196541.jpg');
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1615174069722,'111','yonghu','用户','b7kb7izvyis8owbvocssrh1ai76o04tz','2021-03-08 03:27:56','2021-03-08 04:32:58'),(2,1,'abo','users','管理员','mq3hpvin5e1lked1s1kqjgmumlubvl15','2021-03-08 03:29:31','2021-03-08 04:32:02');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tushuguanxinxi`
--

DROP TABLE IF EXISTS `tushuguanxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tushuguanxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xinxibianhao` varchar(200) NOT NULL COMMENT '信息编号',
  `tushuguanmingcheng` varchar(200) NOT NULL COMMENT '图书馆名称',
  `xiangguantupian` varchar(200) DEFAULT NULL COMMENT '相关图片',
  `dizhi` varchar(200) DEFAULT NULL COMMENT '地址',
  `loucengxinxi` varchar(200) DEFAULT NULL COMMENT '楼层信息',
  `zuowei` int(11) NOT NULL COMMENT '座位',
  `yuyuekaishi` datetime DEFAULT NULL COMMENT '预约开始',
  `yuyuejieshu` datetime DEFAULT NULL COMMENT '预约结束',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xinxibianhao` (`xinxibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1615174227989 DEFAULT CHARSET=utf8 COMMENT='图书馆信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tushuguanxinxi`
--

LOCK TABLES `tushuguanxinxi` WRITE;
/*!40000 ALTER TABLE `tushuguanxinxi` DISABLE KEYS */;
INSERT INTO `tushuguanxinxi` VALUES (21,'2021-03-08 03:10:55','信息编号1','图书馆名称1','http://localhost:8080/ssm1g1l5/upload/tushuguanxinxi_xiangguantupian1.jpg','地址1','一层',1,'2021-03-08 11:10:55','2021-03-08 11:10:55',1,1,'2021-03-08 11:10:55',1),(22,'2021-03-08 03:10:55','信息编号2','图书馆名称2','http://localhost:8080/ssm1g1l5/upload/tushuguanxinxi_xiangguantupian2.jpg','地址2','一层',2,'2021-03-08 11:10:55','2021-03-08 11:10:55',2,2,'2021-03-08 11:10:55',2),(23,'2021-03-08 03:10:55','信息编号3','图书馆名称3','http://localhost:8080/ssm1g1l5/upload/tushuguanxinxi_xiangguantupian3.jpg','地址3','一层',3,'2021-03-08 11:10:55','2021-03-08 11:10:55',3,3,'2021-03-08 11:10:55',3),(24,'2021-03-08 03:10:55','信息编号4','图书馆名称4','http://localhost:8080/ssm1g1l5/upload/tushuguanxinxi_xiangguantupian4.jpg','地址4','一层',4,'2021-03-08 11:10:55','2021-03-08 11:10:55',4,4,'2021-03-08 11:10:55',4),(25,'2021-03-08 03:10:55','信息编号5','图书馆名称5','http://localhost:8080/ssm1g1l5/upload/tushuguanxinxi_xiangguantupian5.jpg','地址5','一层',5,'2021-03-08 11:10:55','2021-03-08 11:10:55',6,6,'2021-03-08 11:28:06',6),(26,'2021-03-08 03:10:55','信息编号6','图书馆名称6','http://localhost:8080/ssm1g1l5/upload/tushuguanxinxi_xiangguantupian6.jpg','地址6','一层',6,'2021-03-08 11:10:55','2021-03-08 11:10:55',6,6,'2021-03-08 11:10:55',6),(1615174227988,'2021-03-08 03:30:27','1615174157322','高级图书馆','http://localhost:8080/ssm1g1l5/upload/1615174196541.jpg','市区附近','一层',72,'2021-01-01 07:00:00','2021-01-01 19:00:00',0,0,'2021-03-08 11:33:17',5);
/*!40000 ALTER TABLE `tushuguanxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-03-08 03:10:55');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gerenzhanghao` varchar(200) NOT NULL COMMENT '个人账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shenfenzhenghaoma` varchar(200) DEFAULT NULL COMMENT '身份证号码',
  `shoujihaoma` varchar(200) DEFAULT NULL COMMENT '手机号码',
  `xiangpian` varchar(200) DEFAULT NULL COMMENT '相片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `gerenzhanghao` (`gerenzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1615174069723 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2021-03-08 03:10:55','用户1','123456','姓名1','男','440300199101010001','13823888881','http://localhost:8080/ssm1g1l5/upload/yonghu_xiangpian1.jpg'),(12,'2021-03-08 03:10:55','用户2','123456','姓名2','男','440300199202020002','13823888882','http://localhost:8080/ssm1g1l5/upload/yonghu_xiangpian2.jpg'),(13,'2021-03-08 03:10:55','用户3','123456','姓名3','男','440300199303030003','13823888883','http://localhost:8080/ssm1g1l5/upload/yonghu_xiangpian3.jpg'),(15,'2021-03-08 03:10:55','用户5','123456','姓名5','男','440300199505050005','13823888885','http://localhost:8080/ssm1g1l5/upload/yonghu_xiangpian5.jpg'),(16,'2021-03-08 03:10:55','用户6','123456','姓名6','男','440300199606060006','13823888886','http://localhost:8080/ssm1g1l5/upload/yonghu_xiangpian6.jpg'),(1615174069722,'2021-03-08 03:27:49','111','111','无名','男','445699855663215632','16999999999','http://localhost:8080/ssm1g1l5/upload/1615174150966.png');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuyuexinxi`
--

DROP TABLE IF EXISTS `yuyuexinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuyuexinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xinxibianhao` varchar(200) DEFAULT NULL COMMENT '信息编号',
  `tushuguanmingcheng` varchar(200) DEFAULT NULL COMMENT '图书馆名称',
  `xiangguantupian` varchar(200) DEFAULT NULL COMMENT '相关图片',
  `dizhi` varchar(200) DEFAULT NULL COMMENT '地址',
  `loucengxinxi` varchar(200) DEFAULT NULL COMMENT '楼层信息',
  `zuowei` int(11) DEFAULT NULL COMMENT '座位',
  `gerenzhanghao` varchar(200) DEFAULT NULL COMMENT '个人账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shenqingriqi` date DEFAULT NULL COMMENT '申请日期',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615174394209 DEFAULT CHARSET=utf8 COMMENT='预约信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuyuexinxi`
--

LOCK TABLES `yuyuexinxi` WRITE;
/*!40000 ALTER TABLE `yuyuexinxi` DISABLE KEYS */;
INSERT INTO `yuyuexinxi` VALUES (31,'2021-03-08 03:10:55','信息编号1','图书馆名称1','http://localhost:8080/ssm1g1l5/upload/yuyuexinxi_xiangguantupian1.jpg','地址1','一层',1,'个人账号1','姓名1','2021-03-08','是','',1,1),(32,'2021-03-08 03:10:55','信息编号2','图书馆名称2','http://localhost:8080/ssm1g1l5/upload/yuyuexinxi_xiangguantupian2.jpg','地址2','一层',2,'个人账号2','姓名2','2021-03-08','是','',2,2),(33,'2021-03-08 03:10:55','信息编号3','图书馆名称3','http://localhost:8080/ssm1g1l5/upload/yuyuexinxi_xiangguantupian3.jpg','地址3','一层',3,'个人账号3','姓名3','2021-03-08','是','',4,4),(34,'2021-03-08 03:10:55','信息编号4','图书馆名称4','http://localhost:8080/ssm1g1l5/upload/yuyuexinxi_xiangguantupian4.jpg','地址4','一层',4,'个人账号4','姓名4','2021-03-08','是','',4,4),(35,'2021-03-08 03:10:55','信息编号5','图书馆名称5','http://localhost:8080/ssm1g1l5/upload/yuyuexinxi_xiangguantupian5.jpg','地址5','一层',5,'个人账号5','姓名5','2021-03-08','是','',5,5),(36,'2021-03-08 03:10:55','信息编号6','图书馆名称6','http://localhost:8080/ssm1g1l5/upload/yuyuexinxi_xiangguantupian6.jpg','地址6','一层',6,'个人账号6','姓名6','2021-03-08','是','',6,6),(1615174290294,'2021-03-08 03:31:30','1615174157322','高级图书馆','http://localhost:8080/ssm1g1l5/upload/1615174196541.jpg','市区附近','一层',10,'111','无名','2021-01-01','是','预约通过',0,0);
/*!40000 ALTER TABLE `yuyuexinxi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-09 16:38:47
