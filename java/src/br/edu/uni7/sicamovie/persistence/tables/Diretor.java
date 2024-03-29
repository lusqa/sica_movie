/*
 * This file is generated by jOOQ.
 */
package br.edu.uni7.sicamovie.persistence.tables;


import br.edu.uni7.sicamovie.persistence.BdSicaMovie;
import br.edu.uni7.sicamovie.persistence.Indexes;
import br.edu.uni7.sicamovie.persistence.Keys;
import br.edu.uni7.sicamovie.persistence.tables.records.DiretorRecord;

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
public class Diretor extends TableImpl<DiretorRecord> {

    private static final long serialVersionUID = -719609465;

    /**
     * The reference instance of <code>bd_sica_movie.diretor</code>
     */
    public static final Diretor DIRETOR = new Diretor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DiretorRecord> getRecordType() {
        return DiretorRecord.class;
    }

    /**
     * The column <code>bd_sica_movie.diretor.id</code>.
     */
    public final TableField<DiretorRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>bd_sica_movie.diretor.nome</code>.
     */
    public final TableField<DiretorRecord, String> NOME = createField(DSL.name("nome"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * Create a <code>bd_sica_movie.diretor</code> table reference
     */
    public Diretor() {
        this(DSL.name("diretor"), null);
    }

    /**
     * Create an aliased <code>bd_sica_movie.diretor</code> table reference
     */
    public Diretor(String alias) {
        this(DSL.name(alias), DIRETOR);
    }

    /**
     * Create an aliased <code>bd_sica_movie.diretor</code> table reference
     */
    public Diretor(Name alias) {
        this(alias, DIRETOR);
    }

    private Diretor(Name alias, Table<DiretorRecord> aliased) {
        this(alias, aliased, null);
    }

    private Diretor(Name alias, Table<DiretorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Diretor(Table<O> child, ForeignKey<O, DiretorRecord> key) {
        super(child, key, DIRETOR);
    }

    @Override
    public Schema getSchema() {
        return BdSicaMovie.BD_SICA_MOVIE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.DIRETOR_PRIMARY);
    }

    @Override
    public Identity<DiretorRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DIRETOR;
    }

    @Override
    public UniqueKey<DiretorRecord> getPrimaryKey() {
        return Keys.KEY_DIRETOR_PRIMARY;
    }

    @Override
    public List<UniqueKey<DiretorRecord>> getKeys() {
        return Arrays.<UniqueKey<DiretorRecord>>asList(Keys.KEY_DIRETOR_PRIMARY);
    }

    @Override
    public Diretor as(String alias) {
        return new Diretor(DSL.name(alias), this);
    }

    @Override
    public Diretor as(Name alias) {
        return new Diretor(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Diretor rename(String name) {
        return new Diretor(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Diretor rename(Name name) {
        return new Diretor(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
