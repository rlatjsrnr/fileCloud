
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
	 imageNum int primary KEY AUTO_INCREMENT,
	 imageName VARCHAR(256) NOT null,
	 imageId VARCHAR(256) NOT null,
	 imagePath VARCHAR(256) NOT null
);
DROP table image;
select * from image;
commit;