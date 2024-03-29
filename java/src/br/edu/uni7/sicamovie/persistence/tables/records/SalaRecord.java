/*
 * This file is generated by jOOQ.
 */
package br.edu.uni7.sicamovie.persistence.tables.records;


import br.edu.uni7.sicamovie.persistence.tables.Sala;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class SalaRecord extends UpdatableRecordImpl<SalaRecord> implements Record4<Integer, String, Integer, Integer> {

    private static final long serialVersionUID = -261412791;

    /**
     * Setter for <code>bd_sica_movie.sala.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bd_sica_movie.sala.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bd_sica_movie.sala.nome</code>.
     */
    public void setNome(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bd_sica_movie.sala.nome</code>.
     */
    public String getNome() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bd_sica_movie.sala.capacidade</code>.
     */
    public void setCapacidade(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>bd_sica_movie.sala.capacidade</code>.
     */
    public Integer getCapacidade() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>bd_sica_movie.sala.localizacao_id</code>.
     */
    public void setLocalizacaoId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>bd_sica_movie.sala.localizacao_id</code>.
     */
    public Integer getLocalizacaoId() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Sala.SALA.ID;
    }

    @Override
    public Field<String> field2() {
        return Sala.SALA.NOME;
    }

    @Override
    public Field<Integer> field3() {
        return Sala.SALA.CAPACIDADE;
    }

    @Override
    public Field<Integer> field4() {
        return Sala.SALA.LOCALIZACAO_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getNome();
    }

    @Override
    public Integer component3() {
        return getCapacidade();
    }

    @Override
    public Integer component4() {
        return getLocalizacaoId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getNome();
    }

    @Override
    public Integer value3() {
        return getCapacidade();
    }

    @Override
    public Integer value4() {
        return getLocalizacaoId();
    }

    @Override
    public SalaRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public SalaRecord value2(String value) {
        setNome(value);
        return this;
    }

    @Override
    public SalaRecord value3(Integer value) {
        setCapacidade(value);
        return this;
    }

    @Override
    public SalaRecord value4(Integer value) {
        setLocalizacaoId(value);
        return this;
    }

    @Override
    public SalaRecord values(Integer value1, String value2, Integer value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SalaRecord
     */
    public SalaRecord() {
        super(Sala.SALA);
    }

    /**
     * Create a detached, initialised SalaRecord
     */
    public SalaRecord(Integer id, String nome, Integer capacidade, Integer localizacaoId) {
        super(Sala.SALA);

        set(0, id);
        set(1, nome);
        set(2, capacidade);
        set(3, localizacaoId);
    }
}
