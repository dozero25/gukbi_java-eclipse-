use tb_koreait;

create table website(
kor_web_adv varchar(500),
kor_web_logo varchar(255),
kor_web_title varchar(100),
kor_web_menus varchar(100),
kor_web_rul varchar(255),
kor_web_hero_name varchar(255),
kor_web_hero_size bigint,
kor_web_hero_trans varchar(255),
kor_web_copyright varchar(255)
);

INSERT INTO website VALUES('Korea it Adv', '', '코리아아이티 아카데미에 오신 것을 환영합니다.', 'Home;Docs;Download;Github;Contact', '', '', 0, '', '부산광역시 부산진구 서면');

UPDATE website SET kor_web_copyright = '부산광역시 부산진구 서면 123-456 Tel> 051-123-456';