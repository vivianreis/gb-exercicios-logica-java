CREATE TABLE tb_classe(
    id bigint auto_increment,
    classificacao varchar(30) not null,
    setor varchar(30) not null,
    cargo varchar(30) not null,
    PRIMARY KEY (id)
);
-- select * from tb_classe;

CREATE TABLE tb_personagem(
    id bigint auto_increment,
    classificacao_id bigint not null,
	ataque double(10,2) not null,
    defesa double(10,2) not null,
    nome varchar(50) not null,
    email varchar(30) not null,
    ativo boolean not null,
    PRIMARY KEY(id),
    FOREIGN KEY(classificacao_id) references tb_classe(id)
);

-- select * from tb_personagem