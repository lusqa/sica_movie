DELIMITER $$
USE bd_sica_movie$$
CREATE TRIGGER ch_filme BEFORE INSERT ON filme FOR EACH ROW BEGIN
    IF (NEW.nome_pt IN (
		(SELECT nome_pt FROM filme AS f1
			WHERE f1.nome_pt = NEW.nome_pt AND f1.ano_lancamento = NEW.ano_lancamento)
		)) THEN
        SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'Você não pode adicionar este filme, já existe outro filme com o mesmo nome e o mesmo ano de lançamento';
    END IF; 
END$$
DELIMITER ;

DELIMITER $$
USE bd_sica_movie$$
CREATE TRIGGER ch_sessao BEFORE INSERT ON sessao FOR EACH ROW BEGIN
    IF (NEW.horario_id IN (SELECT horario_id FROM  sessao s WHERE s.sala_id = NEW.sala_id)) THEN
        SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'Você não pode adicionar esta sessão, pois já existe outro filme passando neste mesmo horário e nesta mesma sala';
    END IF; 
END$$
DELIMITER ;

DELIMITER $$
USE bd_sica_movie$$
CREATE TRIGGER sala_lotada BEFORE INSERT ON ingresso FOR EACH ROW BEGIN 
    DECLARE rows_count INT;
	DECLARE message VARCHAR(50);
    DECLARE size INT;

    SET @rows_count := (
    SELECT COUNT(*) FROM sala AS s
		INNER JOIN sessao as se ON se.sala_id = s.id
		INNER JOIN ingresso as i ON se.id = i.sessao_id
		WHERE se.id = NEW.sessao_id
    );
    SET @size := (
    	SELECT s.capacidade FROM sala AS s
		INNER JOIN sessao as se ON se.sala_id = s.id
		WHERE se.id = NEW.sessao_id
    );

    IF ((@rows_count + 1) > @size) THEN
        SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'Sessão lotada';
    END IF;
END$$
DELIMITER ;
