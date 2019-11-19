/*
Navicat MySQL Data Transfer

Source Server         : mysql2
Source Server Version : 50727
Source Host           : localhost:3308
Source Database       : user

Target Server Type    : MYSQL
Target Server Version : 50727
File Encoding         : 65001

Date: 2019-11-19 20:33:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `user_name` varchar(255) DEFAULT '' COMMENT '用户名称',
  `user_phone` varchar(50) DEFAULT '' COMMENT '用户手机',
  `address` varchar(255) DEFAULT '' COMMENT '住址',
  `weight` int(3) NOT NULL DEFAULT '1' COMMENT '权重，大者优先',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
