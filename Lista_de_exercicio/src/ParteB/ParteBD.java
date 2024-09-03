package ParteB;

import org.junit.jupiter.api.Test;

public class ParteBD {
    @Test
    void main(){
        System.out.println(coiso('a'));
        System.out.println(coiso('B'));
        System.out.println(coiso('c'));
        System.out.println(coiso('D'));
        System.out.println(coiso('e'));

    }
    public static String coiso(char x){
        return switch (x) {
            case 'A', 'a' -> "Globo";
            case 'B', 'b' -> "SBT";
            case 'C', 'c' -> "Record";
            case 'D', 'd' -> "Band";
            default -> "Internet";
        };
    }
}
