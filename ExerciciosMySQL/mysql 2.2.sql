CREATE TABLE tb_produtos(
id bigint AUTO_INCREMENT,
nome varchar(30) not null,
categoria varchar(30) not null,
marca varchar(30) not null,
valor double (10,2) not null,
ativo boolean not null,
PRIMARY KEY (id)
);