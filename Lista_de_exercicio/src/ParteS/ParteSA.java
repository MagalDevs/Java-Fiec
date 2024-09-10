package ParteS;
import java.util.Arrays;

public class ParteSA {
    public static void main(String[] args) {
        int[] v = new int[] { 1, 9, 0, 3, 5, -1, 3, 6, 9, 2 };
        System.out.println(Arrays.toString(v));
        for (int i = 0; i < v.length; i++) {
            for(int j = i+1; j < v.length; j++){
                if(v[j] < v[i]){
                    int temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(v));
    }
}
