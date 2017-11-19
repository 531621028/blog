-- 创建数据库
CREATE DATABASE blogs DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE ARTICLE (
  ID          INT AUTO_INCREMENT, -- 文章ID
  TITLE       VARCHAR(100) NOT NULL, -- 文章标题
  TAG_ID      INT, -- 文章标签
  CONTENT     TEXT,-- 文章内容
  CATEGORY_ID INT, -- 文章分类
  EXCERPT     VARCHAR(200), -- 文章摘要
  AUTHOR      VARCHAR(50), -- 文章作者
  CREATETIME  DATETIME, -- 文章创建时间
  MODIFYTIME  DATETIME, -- 文章修改时间
  PRIMARY KEY (ID)
);