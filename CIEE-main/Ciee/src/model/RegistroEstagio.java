package model;

import java.sql.Date;

public class RegistroEstagio {

    private int id;

    private int numero_registro;

    private int ano;

    private int data_registro;

    private String observacao;

    private Date data_cadastro;

    private Estagio estagio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero_registro() {
        return numero_registro;
    }

    public void setNumero_registro(int numero_registro) {
        this.numero_registro = numero_registro;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getData_registro() {
        return data_registro;
    }

    public void setData_registro(int data_registro) {
        this.data_registro = data_registro;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public Estagio getEstagio() {
        return estagio;
    }

    public void setEstagio(Estagio estagio) {
        this.estagio = estagio;
    }
}
