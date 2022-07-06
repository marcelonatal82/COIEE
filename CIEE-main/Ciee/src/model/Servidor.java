package model;

import java.sql.Date;
import java.util.Collection;

public class Servidor {

    private int id;

    private String nome;

    private int matricula;

    private String email;

    private Date data_cadastro;

    private Cidade cidade;

    private Curso curso;

    private TipoServidor tipoServidor;
    
    private Estagio estagio;

    private Collection<ServidorTelefone> servidorTelefone;

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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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

    public TipoServidor getTipoServidor() {
        return tipoServidor;
    }

    public void setTipoServidor(TipoServidor tipoServidor) {
        this.tipoServidor = tipoServidor;
    }

    public Collection<ServidorTelefone> getServidorTelefone() {
        return servidorTelefone;
    }

    public void setServidorTelefone(Collection<ServidorTelefone> servidorTelefone) {
        this.servidorTelefone = servidorTelefone;
    }

    public Estagio getEstagio() {
        return estagio;
    }

}
