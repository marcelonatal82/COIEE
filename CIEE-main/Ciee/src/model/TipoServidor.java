package model;

public class TipoServidor {

    private int id;

    private Servidor servidor;

    private TipoServidores tipoServidores;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Servidor getServidor() {
        return servidor;
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    public TipoServidores getTipoServidores() {
        return tipoServidores;
    }

    public void setTipoServidores(TipoServidores tipoServidores) {
        this.tipoServidores = tipoServidores;
    }
}
