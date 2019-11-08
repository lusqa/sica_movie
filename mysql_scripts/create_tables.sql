USE bd_sica_movie;

CREATE TABLE IF NOT EXISTS `localizacao` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `nome` VARCHAR(50) NOT NULL,
    CONSTRAINT `pk_localizacao`
        PRIMARY KEY(`id`)
);

CREATE TABLE IF NOT EXISTS `sala` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `nome` VARCHAR(50) NOT NULL,
    `capacidade` INT(11) NOT NULL,
    `localizacao_id` INT(11) NOT NULL,
    CONSTRAINT `pk_sala`
        PRIMARY KEY(`id`),
    CONSTRAINT `fk_sala_localizacao_id`
        FOREIGN KEY(`localizacao_id`) REFERENCES `localizacao`(`id`)
);

CREATE TABLE IF NOT EXISTS `filme` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `nome_pt` VARCHAR(255) NOT NULL,
    `nome_or` VARCHAR(255),
    `diretor` VARCHAR(50) NOT NULL,
    `ano_lancamento` DATETIME NOT NULL,
    `tipo` VARCHAR(50) NOT NULL,
    `sinopse` VARCHAR(255) NOT NULL,
    CONSTRAINT `pk_filme`
        PRIMARY KEY(`id`),
    CONSTRAINT `uq_nomept_filme`
        UNIQUE(`id`),
    CONSTRAINT `uq_lancamento_filme`
        UNIQUE(`ano_lancamento`)
);

CREATE TABLE IF NOT EXISTS `premio` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `nome` VARCHAR(255) NOT NULL,
    `descricao` VARCHAR(255) NOT NULL,
    `ano_premiacao` DATETIME NOT NULL,
    CONSTRAINT `pk_premio`
        PRIMARY KEY(`id`)
);

CREATE TABLE IF NOT EXISTS `filme_premio` (
    `filme_id` INT(11) NOT NULL,
    `premio_id` INT(11) NOT NULL,
    CONSTRAINT `pk_filme_premio`
        PRIMARY KEY(`filme_id`, `premio_id`),
    CONSTRAINT `fk_filmepremio_filme_id`
        FOREIGN KEY(`filme_id`) REFERENCES `filme`(`id`),
    CONSTRAINT `fk_filmepremio_premio_id`
        FOREIGN KEY(`premio_id`) REFERENCES `premio`(`id`)
);

CREATE TABLE IF NOT EXISTS `horario` (
	`id` INT(11) NOT NULL,
    `horario` VARCHAR(5) NOT NULL,
    CONSTRAINT `pk_horario`
        PRIMARY KEY(`id`)
);

CREATE TABLE IF NOT EXISTS `funcionario` (
    `matricula` INT(11) NOT NULL,
    `nome` VARCHAR(50) NOT NULL,
    `data_admissao` DATETIME NOT NULL,
    `funcao` varchar(30) NOT NULL,
    `salario` decimal(10,2) NOT NULL,
    `horario_id` INT(11) NOT NULL,
    CONSTRAINT `pk_funcionario`
        PRIMARY KEY(`matricula`),
    CONSTRAINT `fk_funcionario_horario_id`
        FOREIGN KEY(`horario_id`) REFERENCES `horario`(`id`)
);

CREATE TABLE IF NOT EXISTS `ingresso` (
    `id` INT(11) NOT NULL,
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
);