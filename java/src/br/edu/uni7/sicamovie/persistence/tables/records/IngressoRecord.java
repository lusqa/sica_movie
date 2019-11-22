/*
 * This file is generated by jOOQ.
 */
package br.edu.uni7.sicamovie.persistence.tables.records;


import br.edu.uni7.sicamovie.persistence.tables.Ingresso;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class IngressoRecord extends UpdatableRecordImpl<IngressoRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = 147047907;

    /**
     * Setter for <code>bd_sica_movie.ingresso.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bd_sica_movie.ingresso.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bd_sica_movie.ingresso.sessao_id</code>.
     */
    public void setSessaoId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>bd_sica_movie.ingresso.sessao_id</code>.
     */
    public Integer getSessaoId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>bd_sica_movie.ingresso.tipo_ingresso</code>.
     */
    public void setTipoIngresso(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>bd_sica_movie.ingresso.tipo_ingresso</code>.
     */
    public Integer getTipoIngresso() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Ingresso.INGRESSO.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Ingresso.INGRESSO.SESSAO_ID;
    }

    @Override
    public Field<Integer> field3() {
        return Ingresso.INGRESSO.TIPO_INGRESSO;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getSessaoId();
    }

    @Override
    public Integer component3() {
        return getTipoIngresso();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getSessaoId();
    }

    @Override
    public Integer value3() {
        return getTipoIngresso();
    }

    @Override
    public IngressoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public IngressoRecord value2(Integer value) {
        setSessaoId(value);
        return this;
    }

    @Override
    public IngressoRecord value3(Integer value) {
        setTipoIngresso(value);
        return this;
    }

    @Override
    public IngressoRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IngressoRecord
     */
    public IngressoRecord() {
        super(Ingresso.INGRESSO);
    }

    /**
     * Create a detached, initialised IngressoRecord
     */
    public IngressoRecord(Integer id, Integer sessaoId, Integer tipoIngresso) {
        super(Ingresso.INGRESSO);

        set(0, id);
        set(1, sessaoId);
        set(2, tipoIngresso);
    }
}
