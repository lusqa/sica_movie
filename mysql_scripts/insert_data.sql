USE bd_sica_movie;

INSERT INTO `horario`(`descricao`) VALUES ("16:00");
INSERT INTO `horario`(`descricao`) VALUES ("17:00");
INSERT INTO `horario`(`descricao`) VALUES ("18:00");
INSERT INTO `horario`(`descricao`) VALUES ("19:30");
INSERT INTO `horario`(`descricao`) VALUES ("20:00");
INSERT INTO `horario`(`descricao`) VALUES ("22:00");
INSERT INTO `horario`(`descricao`) VALUES ("24:00");

INSERT INTO `localizacao`(`descricao`) VALUES ("North Shopping Siqueira");
INSERT INTO `localizacao`(`descricao`) VALUES ("South Shopping Siqueira");
INSERT INTO `localizacao`(`descricao`) VALUES ("Centro Cultural Siqueira do Mar");
INSERT INTO `localizacao`(`descricao`) VALUES ("Shopping Via Siqueira");

INSERT INTO `sala`(`nome`, `capacidade`, `localizacao_id`) VALUES ("Praia de Iracema", 300, 1);
INSERT INTO `sala`(`nome`, `capacidade`, `localizacao_id`) VALUES ("Majorlândia", 400, 1);
INSERT INTO `sala`(`nome`, `capacidade`, `localizacao_id`) VALUES ("Cumbuco", 300, 1);
INSERT INTO `sala`(`nome`, `capacidade`, `localizacao_id`) VALUES ("Jericoacoara", 300, 1);
INSERT INTO `sala`(`nome`, `capacidade`, `localizacao_id`) VALUES ("Canoa Quebrada", 300, 1);

INSERT INTO `sala`(`nome`, `capacidade`, `localizacao_id`) VALUES ("Ponta Negra", 300, 2);
INSERT INTO `sala`(`nome`, `capacidade`, `localizacao_id`) VALUES ("Areia Preta", 400, 2);
INSERT INTO `sala`(`nome`, `capacidade`, `localizacao_id`) VALUES ("Praia dos Artistas", 300, 2);
INSERT INTO `sala`(`nome`, `capacidade`, `localizacao_id`) VALUES ("Praia do Forte", 300, 2);
INSERT INTO `sala`(`nome`, `capacidade`, `localizacao_id`) VALUES ("Praia de Pipa", 300, 2);

INSERT INTO `sala`(`nome`, `capacidade`, `localizacao_id`) VALUES ("Boa Viagem", 300, 3);
INSERT INTO `sala`(`nome`, `capacidade`, `localizacao_id`) VALUES ("Praia do Pina", 400, 3);
INSERT INTO `sala`(`nome`, `capacidade`, `localizacao_id`) VALUES ("Buraco da Véia", 300, 3);
INSERT INTO `sala`(`nome`, `capacidade`, `localizacao_id`) VALUES ("Port de Galinhas", 300, 3);
INSERT INTO `sala`(`nome`, `capacidade`, `localizacao_id`) VALUES ("Praia de Piedade", 300, 3);

INSERT INTO `sala`(`nome`, `capacidade`, `localizacao_id`) VALUES ("Prainha", 300, 4);
INSERT INTO `sala`(`nome`, `capacidade`, `localizacao_id`) VALUES ("Praia de Itacarezinho", 400, 4);
INSERT INTO `sala`(`nome`, `capacidade`, `localizacao_id`) VALUES ("Taipus de Fora", 300, 4);
INSERT INTO `sala`(`nome`, `capacidade`, `localizacao_id`) VALUES ("Morere", 300, 4);
INSERT INTO `sala`(`nome`, `capacidade`, `localizacao_id`) VALUES ("Taperapuan", 300, 4);

INSERT INTO `premio`(`nome`, `descricao`, `ano_premiacao`) VALUES ("Palma de Ouro", "É o prêmio de maior prestígio do Festival de Cinema de Cannes", "2014");
INSERT INTO `premio`(`nome`, `descricao`, `ano_premiacao`) VALUES ("Oscar de melhor qualidade artística de produção", "Oscar de melhor qualidade artística de produção", "2018");
INSERT INTO `premio`(`nome`, `descricao`, `ano_premiacao`) VALUES ("Oscar de melhor ator", "Oscar de melhor ator", "2013");
INSERT INTO `premio`(`nome`, `descricao`, `ano_premiacao`) VALUES ("Oscar de melhor atriz", "Oscar de melhor atriz", "2014");
INSERT INTO `premio`(`nome`, `descricao`, `ano_premiacao`) VALUES ("Oscar de melhor coreografia", "Oscar de melhor coreografia", "2014");
INSERT INTO `premio`(`nome`, `descricao`, `ano_premiacao`) VALUES ("Oscar de melhor filme", "Oscar de melhor filme", "2014");
INSERT INTO `premio`(`nome`, `descricao`, `ano_premiacao`) VALUES ("Oscar de melhor fotografia", "Oscar de melhor fotografia", "2014");
INSERT INTO `premio`(`nome`, `descricao`, `ano_premiacao`) VALUES ("Oscar Honorário", "Oscar Honorário", "2014");
INSERT INTO `premio`(`nome`, `descricao`, `ano_premiacao`) VALUES ("Oscar científico ou técnico", "Oscar científico ou técnico", "2014");

INSERT INTO `funcao`(`descricao`) VALUES ("Caixa");
INSERT INTO `funcao`(`descricao`) VALUES ("Lanterninha");
INSERT INTO `funcao`(`descricao`) VALUES ("Zelador");
INSERT INTO `funcao`(`descricao`) VALUES ("Supervisor Regional");
INSERT INTO `funcao`(`descricao`) VALUES ("Analista de Marketing");
INSERT INTO `funcao`(`descricao`) VALUES ("Gerente de Operações");
INSERT INTO `funcao`(`descricao`) VALUES ("Técnico de Áudio");
INSERT INTO `funcao`(`descricao`) VALUES ("Auxiliar de Manutenção");


INSERT INTO `funcionario`(`matricula`, `nome`, `data_admissao`, `salario`, `funcao_id`, `localizacao_id`) VALUES ("171748", "José da Silva", "2017-11-21", 1, 1, 1);
INSERT INTO `funcionario`(`matricula`, `nome`, `data_admissao`, `salario`, `funcao_id`, `localizacao_id`) VALUES ();
INSERT INTO `funcionario`(`matricula`, `nome`, `data_admissao`, `salario`, `funcao_id`, `localizacao_id`) VALUES ();
INSERT INTO `funcionario`(`matricula`, `nome`, `data_admissao`, `salario`, `funcao_id`, `localizacao_id`) VALUES ();
INSERT INTO `funcionario`(`matricula`, `nome`, `data_admissao`, `salario`, `funcao_id`, `localizacao_id`) VALUES ();
INSERT INTO `funcionario`(`matricula`, `nome`, `data_admissao`, `salario`, `funcao_id`, `localizacao_id`) VALUES ();
INSERT INTO `funcionario`(`matricula`, `nome`, `data_admissao`, `salario`, `funcao_id`, `localizacao_id`) VALUES ();
INSERT INTO `funcionario`(`matricula`, `nome`, `data_admissao`, `salario`, `funcao_id`, `localizacao_id`) VALUES ();
INSERT INTO `funcionario`(`matricula`, `nome`, `data_admissao`, `salario`, `funcao_id`, `localizacao_id`) VALUES ();