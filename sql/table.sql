create table user(
	id int auto_increment,
    username varchar(20) not null,
    password varchar(100) not null,
    primary key(id)
);

create table user_authority(
	user_id int,
    authority_id int
);

create table al_person(
	id int auto_increment,
    name varchar(50) not null,
	user_id int not null,
    primary key(id)
);