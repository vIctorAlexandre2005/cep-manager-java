create table usuarios(

    id bigint not null auto_increment,
    name varchar(100) not null,
    cpf VARCHAR(14) NOT NULL,
    street varchar(100) not null,
    district varchar(100) not null,
    zip_code varchar(9) not null,
    city varchar(100) not null,
    uf char(2) not null,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    primary key(id)

);