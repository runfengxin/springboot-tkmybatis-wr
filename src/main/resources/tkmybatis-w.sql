/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80013
Source Host           : localhost:3306
Source Database       : tkmybatis-w

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2019-09-03 00:33:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user233
-- ----------------------------
DROP TABLE IF EXISTS `user233`;
CREATE TABLE `user233` (
  `id` int(11) NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Records of user233
-- ----------------------------
INSERT INTO `user233` VALUES ('102', 'xinxi');
