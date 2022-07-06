package model;

import java.util.Collection;

public class TipoTelefone {

    private int id;

    private String tipo;

    private Collection<AlunoTelefone> alunoTelefone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Collection<AlunoTelefone> getAlunoTelefone() {
        return alunoTelefone;
    }

    public void setAlunoTelefone(Collection<AlunoTelefone> alunoTelefone) {
        this.alunoTelefone = alunoTelefone;
    }
}
