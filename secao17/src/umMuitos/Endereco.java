package umMuitos;

public class Endereco {
    private String endereco;
    private int numeroCasa;
    private String cep;
    private String complemento;

    public Endereco(String endereco, int numeroCasa, String complemento, String cep) {
        this.endereco = endereco;
        this.numeroCasa = numeroCasa;
        this.complemento = complemento;
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
