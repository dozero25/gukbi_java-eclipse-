use kordb;

-- 게시판 환경 설정 테이블
create table config(
code varchar(10), -- 게시판 테이블 이름
title varchar(100),
color varchar(10),
primary key (code)
);

-- 게시판 테이블 : kor_db
create table kor_board(
id int not null auto_increment,
subject varchar(100),
writer varchar(20),
content text,
grp int,
depth int,
primary key (id)
);