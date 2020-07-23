CREATE TABLE tb_cargo(
id bigint auto_increment,
setor varchar(30) not null,
cargo varchar(30) not null,
salario decimal (10,2) not null,
PRIMARY KEY (id)
);

CREATE TABLE tb_funcionario(
id bigint AUTO_INCREMENT,
cargo_id bigint not null,
nome varchar(30) NOT NULL,
email varchar(50) not null,
salario double(10,2) not null,
ativo boolean not null,
PRIMARY KEY (id),
FOREIGN KEY (cargo_id) references tb_cargo(id)
);