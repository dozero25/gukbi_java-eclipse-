use tb_koreait;

create table kor_dept(
kor_dept_code char(3) not null,
kor_dept_name varchar(20) not null,
primary key (kor_dept_code)
);

INSERT INTO kor_dept VALUES('100', '인사과');
INSERT INTO kor_dept VALUES('200', '비서실');
INSERT INTO kor_dept VALUES('300', '영업부');
INSERT INTO kor_dept VALUES('400', '임원실');
