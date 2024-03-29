/*
 * This file is generated by jOOQ.
 */
package br.edu.uni7.sicamovie.persistence.tables;


import br.edu.uni7.sicamovie.persistence.BdSicaMovie;
import br.edu.uni7.sicamovie.persistence.Indexes;
import br.edu.uni7.sicamovie.persistence.Keys;
import br.edu.uni7.sicamovie.persistence.tables.records.TipoIngressoRecord;

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
public class TipoIngresso extends TableImpl<TipoIngressoRecord> {

    private static final long serialVersionUID = 762563179;

    /**
     * The reference instance of <code>bd_sica_movie.tipo_ingresso</code>
     */
    public static final TipoIngresso TIPO_INGRESSO = new TipoIngresso();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TipoIngressoRecord> getRecordType() {
        return TipoIngressoRecord.class;
    }

    /**
     * The column <code>bd_sica_movie.tipo_ingresso.id</code>.
     */
    public final TableField<TipoIngressoRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>bd_sica_movie.tipo_ingresso.descricao</code>.
     */
    public final TableField<TipoIngressoRecord, String> DESCRICAO = createField(DSL.name("descricao"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * Create a <code>bd_sica_movie.tipo_ingresso</code> table reference
     */
    public TipoIngresso() {
        this(DSL.name("tipo_ingresso"), null);
    }

    /**
     * Create an aliased <code>bd_sica_movie.tipo_ingresso</code> table reference
     */
    public TipoIngresso(String alias) {
        this(DSL.name(alias), TIPO_INGRESSO);
    }

    /**
     * Create an aliased <code>bd_sica_movie.tipo_ingresso</code> table reference
     */
    public TipoIngresso(Name alias) {
        this(alias, TIPO_INGRESSO);
    }

    private TipoIngresso(Name alias, Table<TipoIngressoRecord> aliased) {
        this(alias, aliased, null);
    }

    private TipoIngresso(Name alias, Table<TipoIngressoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TipoIngresso(Table<O> child, ForeignKey<O, TipoIngressoRecord> key) {
        super(child, key, TIPO_INGRESSO);
    }

    @Override
    public Schema getSchema() {
        return BdSicaMovie.BD_SICA_MOVIE;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TIPO_INGRESSO_PRIMARY);
    }

    @Override
    public Identity<TipoIngressoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TIPO_INGRESSO;
    }

    @Override
    public UniqueKey<TipoIngressoRecord> getPrimaryKey() {
        return Keys.KEY_TIPO_INGRESSO_PRIMARY;
    }

    @Override
    public List<UniqueKey<TipoIngressoRecord>> getKeys() {
        return Arrays.<UniqueKey<TipoIngressoRecord>>asList(Keys.KEY_TIPO_INGRESSO_PRIMARY);
    }

    @Override
    public TipoIngresso as(String alias) {
        return new TipoIngresso(DSL.name(alias), this);
    }

    @Override
    public TipoIngresso as(Name alias) {
        return new TipoIngresso(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TipoIngresso rename(String name) {
        return new TipoIngresso(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TipoIngresso rename(Name name) {
        return new TipoIngresso(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
