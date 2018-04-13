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

create table al_four(
	id int not null auto_increment,
    person_id int not null,
    fatigue varchar(20),
    itch varchar(20),
    dry varchar(20),
    vague varchar(20),
    depress varchar(20),
    angry varchar(20),
    insomnia varchar(20),
    wake varchar(20),
    tinnitus varchar(20),
    thirst varchar(20),
    primary key(id)
);
create table al_tongue(
	id int not null auto_increment,
    person_id int not null,
    tongue_quality varchar(10),
    tongue_body varchar(10),
    mossy_quality varchar(10),
    mossy_color varchar(10),
    varice varchar(10),
    tongue_left varchar(10),
    tongue_right varchar(10),
    primary key(id)
);
create table user_doc(
	user_id int not null,
    doc_id int not null
);

create table authority(
    id int not null auto_increment,
    name varchar(20) not null,
    primary key(id)
);