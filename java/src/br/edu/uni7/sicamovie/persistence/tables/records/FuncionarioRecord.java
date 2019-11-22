/*
 * This file is generated by jOOQ.
 */
package br.edu.uni7.sicamovie.persistence.tables.records;


import br.edu.uni7.sicamovie.persistence.tables.Funcionario;

import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class FuncionarioRecord extends UpdatableRecordImpl<FuncionarioRecord> implements Record7<Integer, String, String, Date, BigDecimal, Integer, Integer> {

    private static final long serialVersionUID = -1903048984;

    /**
     * Setter for <code>bd_sica_movie.funcionario.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>bd_sica_movie.funcionario.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>bd_sica_movie.funcionario.matricula</code>.
     */
    public void setMatricula(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>bd_sica_movie.funcionario.matricula</code>.
     */
    public String getMatricula() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bd_sica_movie.funcionario.nome</code>.
     */
    public void setNome(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>bd_sica_movie.funcionario.nome</code>.
     */
    public String getNome() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bd_sica_movie.funcionario.data_admissao</code>.
     */
    public void setDataAdmissao(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>bd_sica_movie.funcionario.data_admissao</code>.
     */
    public Date getDataAdmissao() {
        return (Date) get(3);
    }

    /**
     * Setter for <code>bd_sica_movie.funcionario.salario</code>.
     */
    public void setSalario(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>bd_sica_movie.funcionario.salario</code>.
     */
    public BigDecimal getSalario() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>bd_sica_movie.funcionario.funcao_id</code>.
     */
    public void setFuncaoId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>bd_sica_movie.funcionario.funcao_id</code>.
     */
    public Integer getFuncaoId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>bd_sica_movie.funcionario.localizacao_id</code>.
     */
    public void setLocalizacaoId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>bd_sica_movie.funcionario.localizacao_id</code>.
     */
    public Integer getLocalizacaoId() {
        return (Integer) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, String, Date, BigDecimal, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, String, String, Date, BigDecimal, Integer, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Funcionario.FUNCIONARIO.ID;
    }

    @Override
    public Field<String> field2() {
        return Funcionario.FUNCIONARIO.MATRICULA;
    }

    @Override
    public Field<String> field3() {
        return Funcionario.FUNCIONARIO.NOME;
    }

    @Override
    public Field<Date> field4() {
        return Funcionario.FUNCIONARIO.DATA_ADMISSAO;
    }

    @Override
    public Field<BigDecimal> field5() {
        return Funcionario.FUNCIONARIO.SALARIO;
    }

    @Override
    public Field<Integer> field6() {
        return Funcionario.FUNCIONARIO.FUNCAO_ID;
    }

    @Override
    public Field<Integer> field7() {
        return Funcionario.FUNCIONARIO.LOCALIZACAO_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getMatricula();
    }

    @Override
    public String component3() {
        return getNome();
    }

    @Override
    public Date component4() {
        return getDataAdmissao();
    }

    @Override
    public BigDecimal component5() {
        return getSalario();
    }

    @Override
    public Integer component6() {
        return getFuncaoId();
    }

    @Override
    public Integer component7() {
        return getLocalizacaoId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getMatricula();
    }

    @Override
    public String value3() {
        return getNome();
    }

    @Override
    public Date value4() {
        return getDataAdmissao();
    }

    @Override
    public BigDecimal value5() {
        return getSalario();
    }

    @Override
    public Integer value6() {
        return getFuncaoId();
    }

    @Override
    public Integer value7() {
        return getLocalizacaoId();
    }

    @Override
    public FuncionarioRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public FuncionarioRecord value2(String value) {
        setMatricula(value);
        return this;
    }

    @Override
    public FuncionarioRecord value3(String value) {
        setNome(value);
        return this;
    }

    @Override
    public FuncionarioRecord value4(Date value) {
        setDataAdmissao(value);
        return this;
    }

    @Override
    public FuncionarioRecord value5(BigDecimal value) {
        setSalario(value);
        return this;
    }

    @Override
    public FuncionarioRecord value6(Integer value) {
        setFuncaoId(value);
        return this;
    }

    @Override
    public FuncionarioRecord value7(Integer value) {
        setLocalizacaoId(value);
        return this;
    }

    @Override
    public FuncionarioRecord values(Integer value1, String value2, String value3, Date value4, BigDecimal value5, Integer value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FuncionarioRecord
     */
    public FuncionarioRecord() {
        super(Funcionario.FUNCIONARIO);
    }

    /**
     * Create a detached, initialised FuncionarioRecord
     */
    public FuncionarioRecord(Integer id, String matricula, String nome, Date dataAdmissao, BigDecimal salario, Integer funcaoId, Integer localizacaoId) {
        super(Funcionario.FUNCIONARIO);

        set(0, id);
        set(1, matricula);
        set(2, nome);
        set(3, dataAdmissao);
        set(4, salario);
        set(5, funcaoId);
        set(6, localizacaoId);
    }
}
