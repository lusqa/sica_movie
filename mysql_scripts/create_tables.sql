USE bd_sica_movie;

CREATE TABLE IF NOT EXISTS localizacao (
    id INT(11) NOT NULL AUTO_INCREMENT,
    descricao VARCHAR(50) NOT NULL,
    CONSTRAINT pk_localizacao
        PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS sala (
    id INT(11) NOT NULL AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    capacidade INT(11) NOT NULL,
    localizacao_id INT(11) NOT NULL,
    CONSTRAINT pk_sala
        PRIMARY KEY(id),
    CONSTRAINT fk_sala_localizacao_id
        FOREIGN KEY(localizacao_id) REFERENCES localizacao(id)
);

CREATE TABLE IF NOT EXISTS horario (
	id INT(11) NOT NULL AUTO_INCREMENT,
    descricao VARCHAR(5) NOT NULL,
    CONSTRAINT pk_horario
        PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS diretor (
	id INT(11) NOT NULL AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    CONSTRAINT pk_diretor
        PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS genero (
    id INT(11) NOT NULL AUTO_INCREMENT,
    descricao VARCHAR(50) NOT NULL,
    CONSTRAINT pk_tipo
        PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS filme (
    id INT(11) NOT NULL AUTO_INCREMENT,
    nome_pt VARCHAR(255) NOT NULL,
    nome_or VARCHAR(255),
    ano_lancamento VARCHAR(4) NOT NULL,
    sinopse VARCHAR(255) NOT NULL,
	diretor_id INT(11) NOT NULL,
    tipo_id INT(11) NOT NULL,
    CONSTRAINT pk_filme
        PRIMARY KEY(id),
	CONSTRAINT fk_filme_diretor_id
        FOREIGN KEY(diretor_id) REFERENCES diretor(id),
	CONSTRAINT fk_filme_tipo_id
        FOREIGN KEY(tipo_id) REFERENCES genero(id)
);

CREATE TABLE IF NOT EXISTS exibicao (
	filme_id INT(11) NOT NULL,
    sala_id INT(11) NOT NULL,
    horario_id INT(11) NOT NULL,
    CONSTRAINT pk_filme_sala_horario
        PRIMARY KEY(filme_id, sala_id, horario_id),
	CONSTRAINT fk_exibicao_filme_id
        FOREIGN KEY(filme_id) REFERENCES filme(id),
    CONSTRAINT fk_exibicao_sala_id
        FOREIGN KEY(sala_id) REFERENCES sala(id),
    CONSTRAINT fk_exibicao_horario_id
        FOREIGN KEY(horario_id) REFERENCES horario(id)
);

CREATE TABLE IF NOT EXISTS premio (
    id INT(11) NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    ano_premiacao VARCHAR(4) NOT NULL,
    CONSTRAINT pk_premio
        PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS filme_premio (
    filme_id INT(11) NOT NULL,
    premio_id INT(11) NOT NULL,
    CONSTRAINT pk_filme_premio
        PRIMARY KEY(filme_id, premio_id),
    CONSTRAINT fk_filmepremio_filme_id
        FOREIGN KEY(filme_id) REFERENCES filme(id),
    CONSTRAINT fk_filmepremio_premio_id
        FOREIGN KEY(premio_id) REFERENCES premio(id)
);

CREATE TABLE IF NOT EXISTS funcao (
    id INT(11) NOT NULL AUTO_INCREMENT,
    descricao VARCHAR(50) NOT NULL,
    CONSTRAINT pk_funcao
        PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS funcionario (
    id INT(11) NOT NULL AUTO_INCREMENT,
    matricula VARCHAR(30) NOT NULL,
    nome VARCHAR(50) NOT NULL,
    data_admissao DATE NOT NULL,
    salario DECIMAL(10,2) NOT NULL,
	funcao_id INT(11) NOT NULL,
    localizacao_id INT(11) NOT NULL,
    CONSTRAINT pk_funcionario
        PRIMARY KEY(id),
    CONSTRAINT uq_funcionario_matricula
        UNIQUE(matricula),
	CONSTRAINT fk_funcionario_funcao_id
        FOREIGN KEY(funcao_id) REFERENCES funcao(id),
    CONSTRAINT fk_funcionario_localizacao_id
        FOREIGN KEY(localizacao_id) REFERENCES localizacao(id)
);

CREATE TABLE IF NOT EXISTS funcionario_horario (
    funcionario_id INT(11) NOT NULL,
    horario_id INT(11) NOT NULL,
    CONSTRAINT pk_funcionario_horario
        PRIMARY KEY(funcionario_id, horario_id),
    CONSTRAINT fk_funcionariohorario_funcionario_id
        FOREIGN KEY(funcionario_id) REFERENCES funcionario(id),
    CONSTRAINT fk_filmehorario_horario_id
        FOREIGN KEY(horario_id) REFERENCES horario(id)
);

CREATE TABLE IF NOT EXISTS ingresso (
    id INT(11) NOT NULL AUTO_INCREMENT,
    filme_id INT(11) NOT NULL,
    sala_id INT(11) NOT NULL,
    horario_id INT(11) NOT NULL,
    isMeia TINYINT (1) NOT NULL,
    CONSTRAINT pk_ingresso
        PRIMARY KEY(id),
    CONSTRAINT fk_ingresso_filme_id
        FOREIGN KEY(filme_id) REFERENCES filme(id),
    CONSTRAINT fk_ingresso_sala_id
        FOREIGN KEY(sala_id) REFERENCES sala(id),
    CONSTRAINT fk_ingresso_horario_id
        FOREIGN KEY(horario_id) REFERENCES horario(id)
);