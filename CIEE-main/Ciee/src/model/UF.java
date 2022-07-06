package model;

import java.util.Collection;

public class UF {

    private int id;

    private String uf;

    private Collection<Cidade> cidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Collection<Cidade> getCidade() {
        return cidade;
    }

    public void setCidade(Collection<Cidade> cidade) {
        this.cidade = cidade;
    }
}
