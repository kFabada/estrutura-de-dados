package interfaceTest;

public class ClienteBanco {
    private ConexaoBanco conexaoBanco;


    public ClienteBanco(ConexaoBanco conexaoBanco){
        this.conexaoBanco = conexaoBanco;
    }

    public void conectar(){
        conexaoBanco.conexao();
    }
}
