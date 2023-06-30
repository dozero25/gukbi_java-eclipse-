use tb_koreait;


-- 부서
create table kor_dept(
kor_dept_code char(3) not null,
kor_dept_name varchar(20) not null,
primary key (kor_dept_code)
);

INSERT INTO kor_dept VALUES('100', '인사과');
INSERT INTO kor_dept VALUES('200', '비서실');
INSERT INTO kor_dept VALUES('300', '영업부');
INSERT INTO kor_dept VALUES('400', '임원실');

-- 직책(소분류)
CREATE TABLE kor_pos(
kor_pos_code char(3) not null,
kor_pos_name varchar(20) not null,
kor_dept_code char(3),
primary key(kor_pos_code),
foreign key (kor_dept_code) references kor_dept(kor_dept_code) ON UPDATE CASCADE ON DELETE RESTRICT
);

-- CASCADE 부모가 바뀌면 자식에게도 똑같이 적용, RESTRICT 삭제, 수정할때 부모를 참조해서 값이 존재하면 삭제 취소

INSERT INTO kor_pos VALUES ('101','인사부장','100');
INSERT INTO kor_pos VALUES ('102','인사과장','100');
INSERT INTO kor_pos VALUES ('103','사원','100');

INSERT INTO kor_pos VALUES ('201','비서실장','200');
INSERT INTO kor_pos VALUES ('202','담당관','200');
INSERT INTO kor_pos VALUES ('203','사원','200');

INSERT INTO kor_pos VALUES ('301','영업부장','300');
INSERT INTO kor_pos VALUES ('302','지점장','300');
INSERT INTO kor_pos VALUES ('303','영업사원','300');

INSERT INTO kor_pos VALUES ('401','대표이사','400');
INSERT INTO kor_pos VALUES ('402','이사','400');
INSERT INTO kor_pos VALUES ('403','이사','400');
INSERT INTO kor_pos VALUES ('404','이사','400');

SELECT
kd.kor_dept_name,
kp.kor_pos_name
FROM
kor_dept kd
INNER JOIN kor_pos kp on(kd.kor_dept_code = kp.kor_dept_code);

