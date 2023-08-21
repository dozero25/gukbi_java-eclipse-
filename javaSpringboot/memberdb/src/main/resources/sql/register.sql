use userdb;

drop table register;

create table register (
id int not null auto_increment,
email varchar(255) not null,
first_name varchar(25) not null,
last_name varchar(25) not null,
password varchar(255) not null,
enabled boolean not null,
primary key (id)
);




