use tb_koreait;

CREATE TABLE kor_employees(
kor_emp_id int not null auto_increment,
kor_emp_email varchar(50) not null unique,
kor_emp_passwd varchar(20) not null,
kor_emp_name varchar(10) not null,
kor_emp_gender char(1),
kor_emp_dept char(3) not null,
kor_emp_pos char(3) not null,
kor_emp_level int default 1,
kor_emp_auth char(1),
kor_emp_created datetime,
kor_emp_modified datetime,
kor_emp_image_name varchar(255),
kor_emp_image_size bigint,
kor_emp_trans_name varchar(255),
primary key(kor_emp_id)
);
-- ADMIN 계정은 미리 생성
INSERT INTO kor_employees
VALUES(NULL, 'mail@mail.com', '1111', '관리자', 'M' , '100', '101', 7, 'Y', now(), now(), '', 0, '');

-- 테이블 2개 조인하면서 해당 id 값만 조회
SELECT D.kor_dept_name FROM kor_dept D INNER JOIN kor_employees E ON
D.kor_dept_code = E.kor_emp_dept WHERE E.kor_emp_id = 7;

-- 테이블 3개 조인하면서 해당 id 값만 조회
SELECT D.*, P.*, E.* FROM kor_dept D INNER JOIN kor_employees E ON
D.kor_dept_code = E.kor_emp_dept INNER JOIN kor_pos P ON
E.kor_emp_pos = P.kor_pos_code WHERE E.kor_emp_id=7;







