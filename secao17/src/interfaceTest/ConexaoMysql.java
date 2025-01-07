package interfaceTest;

public class ConexaoMysql implements ConexaoBanco  {
    @Override
     public void conexao() {
        System.out.println("Conectando no Banco Mysql");
    }
}
