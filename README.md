# WarIns

## 安装环境 jdk,tomcat, maven, mysql

## 新建数据库

```
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(50) NOT NULL COMMENT '姓名',
  `pass` varchar(20) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

INSERT INTO `users` VALUES ('1', 'zhangs', '12345');
INSERT INTO `users` VALUES ('2', 'lisi', '12345');
INSERT INTO `users` VALUES ('3', 'wangwu', '12345');
INSERT INTO `users` VALUES ('4', 'zhaoniu', '12345');

```

## 修改数据源 spring-hibernate.xml

## 配置tomcat 虚拟目录

```
<Host>
	<Context path="/test" docBase="E:\workspace_java\javaweb\FirstWar\target\FirstWar" reloadable="true"></Context>
</Host>
```

## 运行hello.bat

## 浏览器访问地址 http://localhost:8080/test/test.do

