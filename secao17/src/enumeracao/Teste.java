package enumeracao;

public class Teste {
    public static void main(String[] args) {

        DiasDaSemana[] dias = DiasDaSemana.values();

        for (int i=0; i< dias.length; i++){
            System.out.println(dias[i]);
        }

        System.out.println(Enum.valueOf(DiasDaSemana.class, "SEGUNDA"));

        DiasDaSemana dia = DiasDaSemana.DOMINGO;

     System.out.println(dia.toString() + " - " + dia.getValor());

    }

    private static void imprimirDia(DiasDaSemana dia){

    }

    private static void usandoEnum(){

        DiasDaSemana segunda = DiasDaSemana.SEGUNDA;
        DiasDaSemana terca = DiasDaSemana.TERCA;
        DiasDaSemana quarta = DiasDaSemana.QUARTA;
        DiasDaSemana quinta = DiasDaSemana.QUINTA;
        DiasDaSemana sexta = DiasDaSemana.SEXTA;
        DiasDaSemana sabado = DiasDaSemana.SABADO;
        DiasDaSemana domingo = DiasDaSemana.DOMINGO;
    }
}
