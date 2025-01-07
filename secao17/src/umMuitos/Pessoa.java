package umMuitos;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String cpf;
    private ArrayList<Contatos> contatos;
    private Endereco endereco;
    private Login login;


    public Pessoa(){}

    public Pessoa(String nome, String cpf,ArrayList<Contatos> contatos,  Endereco endereco, Login login) {
        this.nome = nome;
        this.cpf = cpf;
        this.contatos = contatos;
        this.endereco = endereco;
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }



    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Contatos> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contatos> contatos) {
        this.contatos = contatos;
    }
}
