/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2017-08-29 13:09:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `complaint`
-- ----------------------------
DROP TABLE IF EXISTS `complaint`;
CREATE TABLE `complaint` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `xdata` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `xindex` float DEFAULT NULL,
  `lastIndex` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of complaint
-- ----------------------------
INSERT INTO `complaint` VALUES ('1', '12-13', '0.982', '0.852');
INSERT INTO `complaint` VALUES ('2', '12-14', '0.852', '0.462');
INSERT INTO `complaint` VALUES ('3', '12-15', '0.462', '0.986');
INSERT INTO `complaint` VALUES ('4', '12-16', '0.852', '0.897');
INSERT INTO `complaint` VALUES ('5', '12-17', '0.542', '0.764');
INSERT INTO `complaint` VALUES ('6', '12-18', '0.986', '0.684');
INSERT INTO `complaint` VALUES ('7', '12-19', '0.897', '0.982');
INSERT INTO `complaint` VALUES ('8', '12-20', '0.764', '0.852');
INSERT INTO `complaint` VALUES ('9', '12-21', '0.684', '0.274');
INSERT INTO `complaint` VALUES ('10', '12-22', '0.873', '0.972');
INSERT INTO `complaint` VALUES ('11', '12-23', '0.972', '0.267');
INSERT INTO `complaint` VALUES ('12', '12-24', '0.897', '0.897');
INSERT INTO `complaint` VALUES ('13', '12-25', '0.675', '0.764');
INSERT INTO `complaint` VALUES ('14', '12-26', '0.273', '0.462');
INSERT INTO `complaint` VALUES ('15', '12-27', '0.843', '0.852');
INSERT INTO `complaint` VALUES ('16', '12-28', '0.274', '0.982');
INSERT INTO `complaint` VALUES ('17', '12-29', '0.972', '0.852');
INSERT INTO `complaint` VALUES ('18', '12-30', '0.267', '0.462');
INSERT INTO `complaint` VALUES ('19', '12-31', '0.547', '0.852');
