package anotacao;

@interface Ttt {

    String autor();
    int aulaNumero() default 0;
    String site() default "https";

}
