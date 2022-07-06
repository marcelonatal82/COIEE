package model;

import java.sql.Date;

public class EncerramentoEstagio {

    private int id;

    private Date data_encerramento;

    private Date data_entrega_docs;

    private Date data_aprovacao;

    private int status;

    private String observacao;

    private Date data_cadastro;

    private Estagio estagio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData_encerramento() {
        return data_encerramento;
    }

    public void setData_encerramento(Date data_encerramento) {
        this.data_encerramento = data_encerramento;
    }

    public Date getData_entrega_docs() {
        return data_entrega_docs;
    }

    public void setData_entrega_docs(Date data_entrega_docs) {
        this.data_entrega_docs = data_entrega_docs;
    }

    public Date getData_aprovacao() {
        return data_aprovacao;
    }

    public void setData_aprovacao(Date data_aprovacao) {
        this.data_aprovacao = data_aprovacao;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
