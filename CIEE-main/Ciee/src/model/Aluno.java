package model;

import java.sql.Date;
import java.util.Collection;

public class Aluno {

    private int id;
    private String nome;
    private int numero_matricula;
    private String email;
    private Date data_cadastro;
    private Cidade cidade;
    private Curso curso;

    private Collection<AlunoTelefone> alunoTelefone;

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

    public int getNumero_matricula() {
        return numero_matricula;
    }

    public void setNumero_matricula(int numero_matricula) {
        this.numero_matricula = numero_matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Collection<AlunoTelefone> getAlunoTelefone() {
        return alunoTelefone;
    }

    public void setAlunoTelefone(Collection<AlunoTelefone> alunoTelefone) {
        this.alunoTelefone = alunoTelefone;
    }
}
