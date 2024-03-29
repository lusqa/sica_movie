/*
 * This file is generated by jOOQ.
 */
package br.edu.uni7.sicamovie.persistence.tables;


import br.edu.uni7.sicamovie.persistence.BdSicaMovie;
import br.edu.uni7.sicamovie.persistence.Indexes;
import br.edu.uni7.sicamovie.persistence.Keys;
import br.edu.uni7.sicamovie.persistence.tables.records.PremioRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class Premio extends TableImpl<PremioRecord> {

    private static final long serialVersionUID = -1875831974;

    /**
     * The reference instance of <code>bd_sica_movie.premio</code>
     */
    public static final Premio PREMIO = new Premio();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PremioRecord> getRecordType() {
        return PremioRecord.class;
    }

    /**
     * The column <code>bd_sica_movie.premio.id</code>.
     */
    public final TableField<PremioRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>bd_sica_movie.premio.nome</code>.
     */
    public final TableField<PremioRecord, String> NOME = createField(DSL.name("nome"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>bd_sica_movie.premio.descricao</code>.
     */
    public final TableField<PremioRecord, String> DESCRICAO = createField(DSL.name("descricao"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>bd_sica_movie.premio.ano_premiacao</code>.
     */
    public final TableField<PremioRecord, String> ANO_PREMIACAO = createField(DSL.name("ano_premiacao"), org.jooq.impl.SQLDataType.VARCHAR(4).nullable(false), this, "");

    /**
     * Create a <code>bd_sica_movie.premio</code> table reference
     */
    public Premio() {
        this(DSL.name("premio"), null);
    }

    /**
     * Create an aliased <code>bd_sica_movie.premio</code> table reference
     */
    public Premio(String alias) {
        this(DSL.name(alias), PREMIO);
    }

    /**
     * Create an aliased <code>bd_sica_movie.premio</code> table reference
     */
    public Premio(Name alias) {
        this(alias, PREMIO);
    }

    private Premio(Name alias, Table<PremioRecord> aliased) {
        this(alias, aliased, null);
    }

    private Premio(Name alias, Table<PremioRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Premio(Table<O> child, ForeignKey<O, PremioRecord> key) {
        super(child, key, PREMIO);
    }

    @Override
    public Schema getSchema() {
        return BdSicaMovie.BD_SICA_MOVIE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PREMIO_PRIMARY);
    }

    @Override
    public Identity<PremioRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PREMIO;
    }

    @Override
    public UniqueKey<PremioRecord> getPrimaryKey() {
        return Keys.KEY_PREMIO_PRIMARY;
    }

    @Override
    public List<UniqueKey<PremioRecord>> getKeys() {
        return Arrays.<UniqueKey<PremioRecord>>asList(Keys.KEY_PREMIO_PRIMARY);
    }

    @Override
    public Premio as(String alias) {
        return new Premio(DSL.name(alias), this);
    }

    @Override
    public Premio as(Name alias) {
        return new Premio(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Premio rename(String name) {
        return new Premio(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Premio rename(Name name) {
        return new Premio(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
