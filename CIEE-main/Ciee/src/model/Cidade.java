package model;

import java.sql.Date;
import java.util.Collection;

public class Cidade {

    private int id;

    private String cidade;

    private Date data_cadastro;

    private Collection<Aluno> aluno;

    private UF uF;

    private Collection<Concedente> concedente;

    private Collection<Servidor> servidor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public Collection<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(Collection<Aluno> aluno) {
        this.aluno = aluno;
    }

    public UF getuF() {
        return uF;
    }

    public void setuF(UF uF) {
        this.uF = uF;
    }

    public Collection<Concedente> getConcedente() {
        return concedente;
    }

    public void setConcedente(Collection<Concedente> concedente) {
        this.concedente = concedente;
    }

    public Collection<Servidor> getServidor() {
        return servidor;
    }

    public void setServidor(Collection<Servidor> servidor) {
        this.servidor = servidor;
    }
}
