import java.util.ArrayList;
import java.lang.Math;


public class Mega {
    public static void main(String[] args) {
     
        ArrayList<Integer> megasorteio = new ArrayList<>();

        while (megasorteio.size() < 6) {
            int n1 = (int) (Math.random()*61);
            if (!megasorteio.contains(n1)){

                megasorteio.add(n1);
                
            }
        }
        System.out.println("Os números do megasorteio são: "+megasorteio);

    }
}
