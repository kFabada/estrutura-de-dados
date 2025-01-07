package umMuitos;

import java.util.ArrayList;

public class Contatos {
    private String tipo;
    private String ddd;
    private String numero;
    private ArrayList<ArrayList<Contatos>> listaTelefonica;

    public Contatos(){}

    public Contatos(String tipo, String numero, String ddd) {
        this.tipo = tipo;
        this.numero = numero;
        this.ddd = ddd;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public ArrayList<ArrayList<Contatos>> getListaTelefonica() {
        return listaTelefonica;
    }

    public void setListaTelefonica(ArrayList<ArrayList<Contatos>> listaTelefonica) {
        this.listaTelefonica = listaTelefonica;
    }

    public void adicionarListaContato(ArrayList<Contatos> listaTelefonicaUsuario){
        listaTelefonica.add(listaTelefonicaUsuario);
    }
}
