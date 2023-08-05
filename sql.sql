
use fileCloud;

CREATE TABLE member(
	id VARCHAR(50) primary key not null,
	password VARCHAR(50) not null,
	name VARCHAR(50) not null		
);

desc member;

SELECT * FROM member;

delete FROM member;

create table image(
	 imageId int primary KEY AUTO_INCREMENT,
	 originImageName VARCHAR(256) NOT null,
	 newImageName VARCHAR(256) NOT null,
	 imagePath VARCHAR(256) NOT null
);
DROP table image;
select * from image;