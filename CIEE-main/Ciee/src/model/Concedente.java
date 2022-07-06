package model;

import java.sql.Date;
import java.util.Collection;

public class Concedente {

    private int id;

    private int numero_convenio;

    private String razao_social;

    private String nome_fantasia;

    private String responsavel_estagio;

    private String supervisor_estagio;

    private Date inicio_convenio;

    private Date fim_convenio;

    private Date data_cadastro;

    private Cidade cidade;

    private Estagio estagio;

    private Collection<ConcedenteEmail> concedenteEmail;

    private Collection<ConcedenteTelefone> concedenteTelefone;

}
