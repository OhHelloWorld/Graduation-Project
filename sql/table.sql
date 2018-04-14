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

#today

create table al_pc_ins_liver(
    id int not null auto_increment,
    person_id int not null,
    albumin varchar(10),
    globulin varchar(10),
    alt varchar(10),
    ast varchar(10),
    ggt varchar(10),
    alp varchar(10),
    primary key(id)
);

create table al_pc_ins_kidney(
    id int not null auto_increment,
    person_id int not null,
    bun varchar(10),
    cr varchar(10),
    primary key(id)
);

#理化检查 凝血
create table al_pc_ins_coagulation(
    id int not null auto_increment,
    person_id int not null,
    pt varchar(10),
    inr varchar(10),
    primary key(id)
);

create table al_pc_ins_blood(
    id int not null auto_increment,
    person_id int not null,
    rbc varchar(10),
    hb varchar(10),
    wbc varchar(10),
    #中性粒细胞
    neutrophil varchar(10),
    #淋巴细胞
    lymphocyte varchar(10),
    primary key(id)
);

create table al_pc_ins_hepatitis_b(
    id int not null auto_increment,
    person_id int not null,
    hbs_ag varchar(10),
    hbs_ab varchar(10),
    hbe_ag varchar(10),
    hbe_ab varchar(10),
    hbc_ab varchar(10),
    hbv_rna varchar(10),
    primary key(id)
);

create table al_liver(
    id int not null auto_increment,
    person_id int not null,
    li varchar(5),
    ih varchar(5),
    pi1 varchar(5),
    pi2 varchar(5),
    rc varchar(5),
    hbs_ag varchar(5),
    hbc_ag varchar(5),
    hcv varchar(5),
    primary key(id)
);

create table al_bone(
    id int not null auto_increment,
    person_id int not null,
    lv varchar(10),
    lv_t varchar(10),
    fn varchar(10),
    fn_t varchar(10),
    br varchar(10),
    br_t varchar(10),
    th varchar(10),
    th_t varchar(10),
    diagnosis varchar(10),
    primary key(id)
);

create table al_aih(
    id int not null auto_increment,
    person_id int not null,
    anasma1 varchar(5),
    anasma2 varchar(5),
    anti_lkm varchar(10),
    anti_sla varchar(10),
    igg varchar(20),
    liver_histology varchar(10),
    exclude_viral_hepatitis varchar(5),
    primary key(id)
);

create table al_final(
    id int not null auto_increment,
    person_id int not null,
    pbc varchar(10),
    aih varchar(10),
    special varchar(10),
    primary key(id)
);

create table ml_four(
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

create table ml_disease_history(
    id int not null auto_increment,
    person_id int not null,
    other varchar(5),
    one varchar(30),
    tour varchar(5),
    primary key(id)
);

create table ml_allergy(
    id int not null auto_increment,
    person_id int not null,
    allergy varchar(5),
    allergen varchar(40),
    remark varchar(50),
    primary key(id)
);

create table ml_drink(
    id int not null auto_increment,
    person_id int not null,
    history varchar(5),
    species varchar(20),
    time varchar(20),
    primary key(id)
);

create table ml_biochemical(
    id int not null auto_increment,
    person_id int not null,
    alt varchar(10),
    ast varchar(10),
    ggt varchar(10),
    alp varchar(10),
    acid varchar(10),
    tbil varchar(10),
    dbil varchar(10),
    tp varchar(10),
    alb varchar(10),
    scr varchar(10),
    un varchar(10),
    fbg varchar(10),
    pt varchar(10),
    inr varchar(10),
    afp varchar(10),
    primary key(id)
);

create table ml_blood(
    id int not null auto_increment,
    person_id int not null,
    wbc varchar(10),
    hb varchar(10),
    thc varchar(10),
    plt varchar(10),
    n varchar(10),
    e varchar(10),
    primary key(id)
);

create table ml_liver(
    id int not null,
    person_id int not null,
    option1 varchar(50),
    option2 varchar(50),
    option3 varchar(50),
    option4 varchar(50),
    option5 varchar(50),
    primary key(id)
);