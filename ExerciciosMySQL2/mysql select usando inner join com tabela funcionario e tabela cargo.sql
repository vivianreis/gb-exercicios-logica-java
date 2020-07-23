select tb_funcionario.cargo_id,
       tb_cargo.cargo,
       tb_cargo.salario,
       tb_cargo.setor
       from tb_funcionario
       inner join tb_cargo on tb_cargo.id = tb_funcionario.cargo_id
       where tb_funcionario.cargo_id = 4;
       