/*
 * This file is generated by jOOQ.
 */
package br.edu.uni7.sicamovie.persistence.tables.records;


import br.edu.uni7.sicamovie.persistence.tables.FuncionarioHorario;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class FuncionarioHorarioRecord extends UpdatableRecordImpl<FuncionarioHorarioRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 1141308141;

    /**
     * Setter for <code>bd_sica_movie.funcionario_horario.funcionario_id</code>.
     */
    public void setFuncionarioId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bd_sica_movie.funcionario_horario.funcionario_id</code>.
     */
    public Integer getFuncionarioId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bd_sica_movie.funcionario_horario.horario_id</code>.
     */
    public void setHorarioId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>bd_sica_movie.funcionario_horario.horario_id</code>.
     */
    public Integer getHorarioId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return FuncionarioHorario.FUNCIONARIO_HORARIO.FUNCIONARIO_ID;
    }

    @Override
    public Field<Integer> field2() {
        return FuncionarioHorario.FUNCIONARIO_HORARIO.HORARIO_ID;
    }

    @Override
    public Integer component1() {
        return getFuncionarioId();
    }

    @Override
    public Integer component2() {
        return getHorarioId();
    }

    @Override
    public Integer value1() {
        return getFuncionarioId();
    }

    @Override
    public Integer value2() {
        return getHorarioId();
    }

    @Override
    public FuncionarioHorarioRecord value1(Integer value) {
        setFuncionarioId(value);
        return this;
    }

    @Override
    public FuncionarioHorarioRecord value2(Integer value) {
        setHorarioId(value);
        return this;
    }

    @Override
    public FuncionarioHorarioRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FuncionarioHorarioRecord
     */
    public FuncionarioHorarioRecord() {
        super(FuncionarioHorario.FUNCIONARIO_HORARIO);
    }

    /**
     * Create a detached, initialised FuncionarioHorarioRecord
     */
    public FuncionarioHorarioRecord(Integer funcionarioId, Integer horarioId) {
        super(FuncionarioHorario.FUNCIONARIO_HORARIO);

        set(0, funcionarioId);
        set(1, horarioId);
    }
}
