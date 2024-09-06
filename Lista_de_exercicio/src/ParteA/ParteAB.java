package ParteA;

public class ParteAB {
    public static void main(String[] args){
        System.out.println(contarTexto("hello, world"));
    }
    public static String contarTexto(String texto){
        int contador = texto.split("").length;
        return "Contagem: " + contador;
    }
}
