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

create table person(
	id int auto_increment,
    name varchar(50) not null,
	user_id int not null,
    age int not null,
    gender varchar(10) not null,
    nation varchar(20) not null,
    culture varchar(20) not null,
    height int not null,
    weight int not null,
    bmi float not null,
    phone varchar(50) not null,
    address varchar(50) not null,
    file_name varchar(20) not null,
    primary key(id)
);

create table user_person(
	user_id int not null,
    person_id int not null
);

create table document(
	id int not null auto_increment,
    name varchar(50) not null,
    author varchar(20) not null,
    source varchar(20) not null,
    image varchar(100) not null,
    content text not null,
    primary key(id)
);

create table comment(
	id int not null auto_increment,
    time date not null,
    content varchar(200),
    doc_id int not null,
    user_id int not null,
    primary key(id)
);