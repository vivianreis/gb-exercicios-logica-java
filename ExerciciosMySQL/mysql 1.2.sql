CREATE TABLE tb_funcionarios(
id bigint AUTO_INCREMENT,
nome varchar(30) NOT NULL,
email varchar(50) not null,
cargo varchar(50) not null,
salario double(10,2) not null,
ativo boolean not null,
PRIMARY KEY (id)
);