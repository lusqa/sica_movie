/*
 * This file is generated by jOOQ.
 */
package br.edu.uni7.sicamovie.persistence;


import br.edu.uni7.sicamovie.persistence.tables.Diretor;
import br.edu.uni7.sicamovie.persistence.tables.Filme;
import br.edu.uni7.sicamovie.persistence.tables.FilmePremio;
import br.edu.uni7.sicamovie.persistence.tables.Funcao;
import br.edu.uni7.sicamovie.persistence.tables.Funcionario;
import br.edu.uni7.sicamovie.persistence.tables.FuncionarioHorario;
import br.edu.uni7.sicamovie.persistence.tables.Genero;
import br.edu.uni7.sicamovie.persistence.tables.Horario;
import br.edu.uni7.sicamovie.persistence.tables.Ingresso;
import br.edu.uni7.sicamovie.persistence.tables.Localizacao;
import br.edu.uni7.sicamovie.persistence.tables.Premio;
import br.edu.uni7.sicamovie.persistence.tables.Sala;
import br.edu.uni7.sicamovie.persistence.tables.Sessao;
import br.edu.uni7.sicamovie.persistence.tables.TipoIngresso;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in bd_sica_movie
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>bd_sica_movie.diretor</code>.
     */
    public static final Diretor DIRETOR = Diretor.DIRETOR;

    /**
     * The table <code>bd_sica_movie.filme</code>.
     */
    public static final Filme FILME = Filme.FILME;

    /**
     * The table <code>bd_sica_movie.filme_premio</code>.
     */
    public static final FilmePremio FILME_PREMIO = FilmePremio.FILME_PREMIO;

    /**
     * The table <code>bd_sica_movie.funcao</code>.
     */
    public static final Funcao FUNCAO = Funcao.FUNCAO;

    /**
     * The table <code>bd_sica_movie.funcionario</code>.
     */
    public static final Funcionario FUNCIONARIO = Funcionario.FUNCIONARIO;

    /**
     * The table <code>bd_sica_movie.funcionario_horario</code>.
     */
    public static final FuncionarioHorario FUNCIONARIO_HORARIO = FuncionarioHorario.FUNCIONARIO_HORARIO;

    /**
     * The table <code>bd_sica_movie.genero</code>.
     */
    public static final Genero GENERO = Genero.GENERO;

    /**
     * The table <code>bd_sica_movie.horario</code>.
     */
    public static final Horario HORARIO = Horario.HORARIO;

    /**
     * The table <code>bd_sica_movie.ingresso</code>.
     */
    public static final Ingresso INGRESSO = Ingresso.INGRESSO;

    /**
     * The table <code>bd_sica_movie.localizacao</code>.
     */
    public static final Localizacao LOCALIZACAO = Localizacao.LOCALIZACAO;

    /**
     * The table <code>bd_sica_movie.premio</code>.
     */
    public static final Premio PREMIO = Premio.PREMIO;

    /**
     * The table <code>bd_sica_movie.sala</code>.
     */
    public static final Sala SALA = Sala.SALA;

    /**
     * The table <code>bd_sica_movie.sessao</code>.
     */
    public static final Sessao SESSAO = Sessao.SESSAO;

    /**
     * The table <code>bd_sica_movie.tipo_ingresso</code>.
     */
    public static final TipoIngresso TIPO_INGRESSO = TipoIngresso.TIPO_INGRESSO;
}
