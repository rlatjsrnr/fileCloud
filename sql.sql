
use fileCloud;

CREATE TABLE member(
	id VARCHAR(50) primary key not null,
	password VARCHAR(50) not null,
	name VARCHAR(50) not null		
);

desc member;

SELECT * FROM member;

delete FROM member;

CREATE TABLE img(
	num int primary key not null,
	path VARCHAR(100) not null
);
select * from img;