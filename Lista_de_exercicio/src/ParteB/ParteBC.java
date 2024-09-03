package ParteB;
import org.junit.jupiter.api.Test;

public class ParteBC {
    @Test
    void Principal(){
       System.out.println(troca(40, 78));
    }
    public static String troca(int x, int y){
        int Numx = y;
        int Numy = x;

        return "X agora é: "+ Numx + "\nY agora é: " + Numy;
    }
}
