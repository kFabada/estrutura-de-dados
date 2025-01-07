package enumeracao.TipoDocumento;

public enum TipoDocumento {

    CPF {
        @Override
        public String geraNumeroTeste() {
            return "";
        }
    }, CNPJ {
        @Override
        public String geraNumeroTeste() {
            return "";
        }
    };





    public abstract String geraNumeroTeste();
}
