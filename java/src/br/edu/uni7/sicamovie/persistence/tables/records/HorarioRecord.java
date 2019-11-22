/*
 * This file is generated by jOOQ.
 */
package br.edu.uni7.sicamovie.persistence.tables.records;


import br.edu.uni7.sicamovie.persistence.tables.Horario;

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
public class HorarioRecord extends UpdatableRecordImpl<HorarioRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 357061128;

    /**
     * Setter for <code>bd_sica_movie.horario.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bd_sica_movie.horario.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bd_sica_movie.horario.descricao</code>.
     */
    public void setDescricao(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bd_sica_movie.horario.descricao</code>.
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
        return Horario.HORARIO.ID;
    }

    @Override
    public Field<String> field2() {
        return Horario.HORARIO.DESCRICAO;
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
    public HorarioRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public HorarioRecord value2(String value) {
        setDescricao(value);
        return this;
    }

    @Override
    public HorarioRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HorarioRecord
     */
    public HorarioRecord() {
        super(Horario.HORARIO);
    }

    /**
     * Create a detached, initialised HorarioRecord
     */
    public HorarioRecord(Integer id, String descricao) {
        super(Horario.HORARIO);

        set(0, id);
        set(1, descricao);
    }
}