use tb_koreait;

create table kor_board(
kor_board_id int not null auto_increment,
kor_board_notice char(1) default 'N',
kor_board_writer varchar(20),
kor_board_subject varchar(255),
kor_board_content text,
kor_board_upload_name varchar(255),
kor_board_upload_url varchar(30),
kor_board_upload_size bigint,
kor_board_upload_trans varchar(255),
kor_board_visit int,
kor_board_reply_grp int,
kor_board_reply_grp_seq int,
kor_board_reply_grp_seq_indent int,
kor_board_regdate datetime,
primary key(kor_board_id)
);

-- 게시판 정렬 알고리즘
create table test_board(
subject varchar(255),
grp int,
grp_seq int,
grp_seq_indent int
);
-- 게시물 등록
INSERT INTO test_board VALUES("1번 원본 게시물입니다.", 1, 1, 1);
INSERT INTO test_board VALUES("2번 원본 게시물입니다.", 2, 1, 1);
INSERT INTO test_board VALUES("3번 원본 게시물입니다.", 3, 1, 1);

INSERT INTO test_board VALUES("2번 답글입니다.", 2, 1, 1);
INSERT INTO test_board VALUES("1번 답글입니다.", 1, 1, 1);

INSERT INTO test_board VALUES("2번 답글 답글입니다.", 2, 2, 2);

INSERT INTO test_board VALUES("1번 답글 답글입니다.", 1, 2, 2);

SELECT * FROM test_board ORDER BY grp DESC, grp_seq ASC;








