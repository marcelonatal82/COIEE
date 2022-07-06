package model;

import java.sql.Date;

public class Estagio {

    private int id;

    private int modalidade_estagio;

    private Date data_inicio;

    private Date data_fim;

    private int data_previsao_entrega;

    private Date data_cadastro;

    private AgenteMediador agenteMediador;

    private RegistroEstagio registroEstagio;

    private Aluno aluno;

    private Concedente concedente;

    private EncerramentoEstagio encerramentoEstagio;

    private Servidor servidor;


}
