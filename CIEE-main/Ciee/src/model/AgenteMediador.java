package model;

import java.sql.Date;
import java.util.Collection;

public class AgenteMediador {

    private int id;

    private String nome;

    private Date data_cadastro;

    private Collection<Estagio> estagio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public Collection<Estagio> getEstagio() {
        return estagio;
    }

    public void setEstagio(Collection<Estagio> estagio) {
        this.estagio = estagio;
    }
}
