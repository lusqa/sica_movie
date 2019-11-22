/*
 * This file is generated by jOOQ.
 */
package br.edu.uni7.sicamovie.persistence.tables.records;


import br.edu.uni7.sicamovie.persistence.tables.TipoIngresso;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TipoIngressoRecord extends UpdatableRecordImpl<TipoIngressoRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 935723226;

    /**
     * Setter for <code>bd_sica_movie.tipo_ingresso.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bd_sica_movie.tipo_ingresso.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bd_sica_movie.tipo_ingresso.descricao</code>.
     */
    public void setDescricao(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bd_sica_movie.tipo_ingresso.descricao</code>.
     */
    public String getDescricao() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TipoIngresso.TIPO_INGRESSO.ID;
    }

    @Override
    public Field<String> field2() {
        return TipoIngresso.TIPO_INGRESSO.DESCRICAO;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getDescricao();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getDescricao();
    }

    @Override
    public TipoIngressoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public TipoIngressoRecord value2(String value) {
        setDescricao(value);
        return this;
    }

    @Override
    public TipoIngressoRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TipoIngressoRecord
     */
    public TipoIngressoRecord() {
        super(TipoIngresso.TIPO_INGRESSO);
    }

    /**
     * Create a detached, initialised TipoIngressoRecord
     */
    public TipoIngressoRecord(Integer id, String descricao) {
        super(TipoIngresso.TIPO_INGRESSO);

        set(0, id);
        set(1, descricao);
    }
}
