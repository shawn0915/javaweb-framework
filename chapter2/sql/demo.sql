CREATE DATABASE javaweb;
USE javaweb;

CREATE TABLE customer (
  id        BIGINT       NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name      VARCHAR(255) NOT NULL
  COMMENT '客户名称',
  contact   VARCHAR(255) NOT NULL
  COMMENT '联系人',
  telephone VARCHAR(255) COMMENT '电话号码',
  email     VARCHAR(255) COMMENT '邮箱',
  remark    TEXT COMMENT '备注'
);

INSERT INTO customer (id, name, contact, telephone, email, remark)
VALUES (1, 'shawn', 'shawn', '13912341234', 'shawn@shawnyan.com', '');
INSERT INTO customer (id, name, contact, telephone, email, remark)
VALUES (2, 'yan', 'shawn', '13912341234', 'yan@shawnyan.com', '');