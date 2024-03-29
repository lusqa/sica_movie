/*
 * This file is generated by jOOQ.
 */
package br.edu.uni7.sicamovie.persistence.tables;


import br.edu.uni7.sicamovie.persistence.BdSicaMovie;
import br.edu.uni7.sicamovie.persistence.Indexes;
import br.edu.uni7.sicamovie.persistence.Keys;
import br.edu.uni7.sicamovie.persistence.tables.records.FuncaoRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Funcao extends TableImpl<FuncaoRecord> {

    private static final long serialVersionUID = -1063215770;

    /**
     * The reference instance of <code>bd_sica_movie.funcao</code>
     */
    public static final Funcao FUNCAO = new Funcao();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FuncaoRecord> getRecordType() {
        return FuncaoRecord.class;
    }

    /**
     * The column <code>bd_sica_movie.funcao.id</code>.
     */
    public final TableField<FuncaoRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>bd_sica_movie.funcao.descricao</code>.
     */
    public final TableField<FuncaoRecord, String> DESCRICAO = createField(DSL.name("descricao"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * Create a <code>bd_sica_movie.funcao</code> table reference
     */
    public Funcao() {
        this(DSL.name("funcao"), null);
    }

    /**
     * Create an aliased <code>bd_sica_movie.funcao</code> table reference
     */
    public Funcao(String alias) {
        this(DSL.name(alias), FUNCAO);
    }

    /**
     * Create an aliased <code>bd_sica_movie.funcao</code> table reference
     */
    public Funcao(Name alias) {
        this(alias, FUNCAO);
    }

    private Funcao(Name alias, Table<FuncaoRecord> aliased) {
        this(alias, aliased, null);
    }

    private Funcao(Name alias, Table<FuncaoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Funcao(Table<O> child, ForeignKey<O, FuncaoRecord> key) {
        super(child, key, FUNCAO);
    }

    @Override
    public Schema getSchema() {
        return BdSicaMovie.BD_SICA_MOVIE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FUNCAO_PRIMARY);
    }

    @Override
    public Identity<FuncaoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FUNCAO;
    }

    @Override
    public UniqueKey<FuncaoRecord> getPrimaryKey() {
        return Keys.KEY_FUNCAO_PRIMARY;
    }

    @Override
    public List<UniqueKey<FuncaoRecord>> getKeys() {
        return Arrays.<UniqueKey<FuncaoRecord>>asList(Keys.KEY_FUNCAO_PRIMARY);
    }

    @Override
    public Funcao as(String alias) {
        return new Funcao(DSL.name(alias), this);
    }

    @Override
    public Funcao as(Name alias) {
        return new Funcao(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Funcao rename(String name) {
        return new Funcao(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Funcao rename(Name name) {
        return new Funcao(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
