USE bd_sica_movie;

CREATE TABLE IF NOT EXISTS `localizacao` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `descricao` VARCHAR(50) NOT NULL,
    CONSTRAINT `pk_localizacao`
        PRIMARY KEY(`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1;

CREATE TABLE IF NOT EXISTS `sala` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `nome` VARCHAR(50) NOT NULL,
    `capacidade` INT(11) NOT NULL,
    `localizacao_id` INT(11) NOT NULL,
    CONSTRAINT `pk_sala`
        PRIMARY KEY(`id`),
    CONSTRAINT `fk_sala_localizacao_id`
        FOREIGN KEY(`localizacao_id`) REFERENCES `localizacao`(`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1;

CREATE TABLE IF NOT EXISTS `horario` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
    `descricao` VARCHAR(5) NOT NULL,
    CONSTRAINT `pk_horario`
        PRIMARY KEY(`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1;

CREATE TABLE IF NOT EXISTS `filme` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `nome_pt` VARCHAR(255) NOT NULL,
    `nome_or` VARCHAR(255),
    `diretor` VARCHAR(50) NOT NULL,
    `ano_lancamento` VARCHAR(4) NOT NULL,
    `tipo` VARCHAR(50) NOT NULL,
    `sinopse` VARCHAR(255) NOT NULL,
    CONSTRAINT `pk_filme`
        PRIMARY KEY(`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1;

ALTER TABLE `filme`
ADD CONSTRAINT `check_filme`
	CHECK(`nome_pt` AND `ano_lancamento` NOT IN (
		(SELECT `nome_pt`, `ano_lancamento` FROM `filme` AS `f1`
			WHERE `f1`.`nome_pt` = `nome_pt` AND `f1`.`ano_lancamento` = `ano_lancamento`)
		)
);

CREATE TABLE IF NOT EXISTS `exibicao` (
	`filme_id` INT(11) NOT NULL,
    `sala_id` INT(11) NOT NULL,
    `horario_id` INT(11) NOT NULL,
    CONSTRAINT `pk_filme_sala_horario`
        PRIMARY KEY(`filme_id`, `sala_id`, `horario_id`),
	CONSTRAINT `fk_exibicao_filme_id`
        FOREIGN KEY(`filme_id`) REFERENCES `filme`(`id`),
    CONSTRAINT `fk_exibicao_sala_id`
        FOREIGN KEY(`sala_id`) REFERENCES `sala`(`id`),
    CONSTRAINT `fk_exibicao_horario_id`
        FOREIGN KEY(`horario_id`) REFERENCES `horario`(`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1;

ALTER TABLE `exibicao`
ADD CONSTRAINT `ch_exibicao`
    CHECK (`horario_id` NOT IN (
        SELECT `horario_id` FROM  `exibicao` `e1` WHERE   `e1`.`sala_id` = `sala_id`)
    );

CREATE TABLE IF NOT EXISTS `premio` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `nome` VARCHAR(255) NOT NULL,
    `descricao` VARCHAR(255) NOT NULL,
    `ano_premiacao` VARCHAR(4) NOT NULL,
    CONSTRAINT `pk_premio`
        PRIMARY KEY(`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1;

CREATE TABLE IF NOT EXISTS `filme_premio` (
    `filme_id` INT(11) NOT NULL,
    `premio_id` INT(11) NOT NULL,
    CONSTRAINT `pk_filme_premio`
        PRIMARY KEY(`filme_id`, `premio_id`),
    CONSTRAINT `fk_filmepremio_filme_id`
        FOREIGN KEY(`filme_id`) REFERENCES `filme`(`id`),
    CONSTRAINT `fk_filmepremio_premio_id`
        FOREIGN KEY(`premio_id`) REFERENCES `premio`(`id`)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `funcao` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `descricao` VARCHAR(50) NOT NULL,
    CONSTRAINT `pk_funcao`
        PRIMARY KEY(`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1;

CREATE TABLE IF NOT EXISTS `funcionario` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `matricula` VARCHAR(30) NOT NULL,
    `nome` VARCHAR(50) NOT NULL,
    `data_admissao` DATE NOT NULL,
    `salario` DECIMAL(10,2) NOT NULL,
	`funcao_id` INT(11) NOT NULL,
    `localizacao_id` INT(11) NOT NULL,
    CONSTRAINT `pk_funcionario`
        PRIMARY KEY(`id`),
    CONSTRAINT `uq_funcionario_matricula`
        UNIQUE(`matricula`),
	CONSTRAINT `fk_funcionario_funcao_id`
        FOREIGN KEY(`funcao_id`) REFERENCES `funcao`(`id`),
    CONSTRAINT `fk_funcionario_localizacao_id`
        FOREIGN KEY(`localizacao_id`) REFERENCES `localizacao`(`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1;

CREATE TABLE IF NOT EXISTS `funcionario_horario` (
    `funcionario_id` INT(11) NOT NULL,
    `horario_id` INT(11) NOT NULL,
    CONSTRAINT `pk_funcionario_horario`
        PRIMARY KEY(`funcionario_id`, `horario_id`),
    CONSTRAINT `fk_funcionariohorario_funcionario_id`
        FOREIGN KEY(`funcionario_id`) REFERENCES `funcionario`(`id`),
    CONSTRAINT `fk_filmehorario_horario_id`
        FOREIGN KEY(`horario_id`) REFERENCES `horario`(`id`)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `ingresso` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `filme_id` INT(11) NOT NULL,
    `sala_id` INT(11) NOT NULL,
    `horario_id` INT(11) NOT NULL,
    `isMeia` TINYINT (1) NOT NULL,
    CONSTRAINT `pk_ingresso`
        PRIMARY KEY(`id`),
    CONSTRAINT `fk_ingresso_filme_id`
        FOREIGN KEY(`filme_id`) REFERENCES `filme`(`id`),
    CONSTRAINT `fk_ingresso_sala_id`
        FOREIGN KEY(`sala_id`) REFERENCES `sala`(`id`),
    CONSTRAINT `fk_ingresso_horario_id`
        FOREIGN KEY(`horario_id`) REFERENCES `horario`(`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1;