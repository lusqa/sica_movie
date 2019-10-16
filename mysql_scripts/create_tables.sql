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
    CONSTRAINT `fk_sala_localizacao`
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
    CONSTRAINT `fk_id_filme`
        FOREIGN KEY(`filme_id`) REFERENCES `filme`(`id`),
    CONSTRAINT `fk_id_premio`
        FOREIGN KEY(`premio_id`) REFERENCES `premio`(`id`)
);