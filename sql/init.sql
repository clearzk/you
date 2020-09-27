DROP TABLE  IF EXISTS `tb_menu`;
CREATE TABLE `tb_menu` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '名称',
  `menu_code` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '菜单编码',
  `parent_id` bigint DEFAULT NULL COMMENT '父节点',
  `node_type` tinyint NOT NULL DEFAULT '1' COMMENT '节点类型，1文件夹，2页面，3按钮',
  `icon_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '图标地址',
  `sort` int NOT NULL DEFAULT '1' COMMENT '排序号',
  `link_url` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '页面对应的地址',
  `level` int NOT NULL DEFAULT '0' COMMENT '层次',
  `path` varchar(2500) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT '' COMMENT '树id的路径 整个层次上的路径id，逗号分隔，想要找父节点特别快',
  `is_delete` tinyint NOT NULL DEFAULT '0' COMMENT '是否删除 1：已删除；0：未删除',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `idx_parent_id` (`parent_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='菜单表';


DROP TABLE  IF EXISTS `tb_role`;
CREATE TABLE `tb_role` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `code` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '编码',
  `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '名称',
  `is_delete` tinyint NOT NULL DEFAULT '0' COMMENT '是否删除 1：已删除；0：未删除',
  PRIMARY KEY (`id`),
  KEY `idx_code` (`code`) USING BTREE,
  KEY `idx_name` (`name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='角色表';

DROP TABLE  IF EXISTS `tb_role_menu`;
CREATE TABLE `tb_role_menu` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_id` bigint NOT NULL COMMENT '角色ID',
  `menu_id` bigint NOT NULL COMMENT '菜单ID',
  PRIMARY KEY (`id`),
  KEY `idx_role_id` (`role_id`) USING BTREE,
  KEY `idx_menu_id` (`menu_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='角色菜单关系表';

DROP TABLE  IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '消息给过来的ID',
  `mobile` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '手机号',
  `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '姓名',
  `password` varchar(128) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '密码',
  `is_delete` tinyint NOT NULL DEFAULT '0' COMMENT '是否删除 1：已删除；0：未删除',
  PRIMARY KEY (`id`),
  KEY `idx_name` (`name`) USING BTREE,
  KEY `idx_mobile` (`mobile`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='用户表';

DROP TABLE  IF EXISTS `tb_user_role`;
CREATE TABLE `tb_user_role` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` bigint NOT NULL COMMENT '用户ID',
  `role_id` bigint NOT NULL COMMENT '角色ID',
  PRIMARY KEY (`id`),
  KEY `idx_user_id` (`user_id`) USING BTREE,
  KEY `idx_role_id` (`role_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='用户角色表';



INSERT INTO `tb_menu` VALUES ('1', '系统配置', 'systemMgr', '0', '1', '', '1', '', '1', '', '0');
INSERT INTO `tb_menu` VALUES ('2', '用户管理', 'userMgr', '1', '2', '', '1', 'www.baidu.com', '2', '1', '0');
INSERT INTO `tb_menu` VALUES ('3', '角色管理', 'roleMgr', '1', '2', '', '2', '', '2', '1', '0');
INSERT INTO `tb_menu` VALUES ('4', '菜单管理', 'menuMgr', '1', '2', '', '3', '', '2', '1', '0');
INSERT INTO `tb_menu` VALUES ('5', '角色管理-查询', 'roleMgr:list', '3', '3', '', '1', '', '3', '1,3', '0');
INSERT INTO `tb_menu` VALUES ('6', '角色管理-新增', 'roleMgr:add', '3', '3', '', '2', '', '3', '1,3', '0');
INSERT INTO `tb_menu` VALUES ('7', '角色管理-删除', 'roleMgr:delete', '3', '3', '', '3', '', '3', '1,3', '0');

INSERT INTO `tb_role` VALUES ('1', '001', '管理员', '0');
INSERT INTO `tb_role` VALUES ('2', '002', '访客', '0');

INSERT INTO `tb_role_menu` VALUES ('1', '1', '1');
INSERT INTO `tb_role_menu` VALUES ('2', '1', '2');
INSERT INTO `tb_role_menu` VALUES ('3', '1', '3');
INSERT INTO `tb_role_menu` VALUES ('4', '1', '4');
INSERT INTO `tb_role_menu` VALUES ('5', '1', '5');
INSERT INTO `tb_role_menu` VALUES ('6', '1', '6');
INSERT INTO `tb_role_menu` VALUES ('7', '1', '7');
INSERT INTO `tb_role_menu` VALUES ('8', '2', '7');

INSERT INTO `tb_user` VALUES ('1', '13652997026', '张凯', '123', '0');
INSERT INTO `tb_user` VALUES ('2', '13652997025', 'xq', '123', '0');

INSERT INTO `tb_user_role` VALUES ('1', '1', '1');
INSERT INTO `tb_user_role` VALUES ('2', '2', '2');