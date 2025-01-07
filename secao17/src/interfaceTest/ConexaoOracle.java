package interfaceTest;

public class ConexaoOracle implements ConexaoBanco{
    @Override
    public void conexao() {
        System.out.println("Conexao Oracle");
    }
}
