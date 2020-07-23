select tb_personagem.classificacao_id,
       tb_personagem.nome,
       tb_classe.classificacao,
       tb_classe.setor
       from tb_personagem
       inner join tb_classe on tb_classe.id = tb_personagem.classificacao_id;