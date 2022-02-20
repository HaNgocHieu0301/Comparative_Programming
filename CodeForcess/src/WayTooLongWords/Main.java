package WayTooLongWords;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] var = new String[n];
        for(int i = 0; i < n; i++){
            var[i] = sc.nextLine();
            if(var[i].length() > 10){
                int count = var[i].length()-2;
                var[i] = ""+var[i].charAt(0)+count+var[i].charAt(var[i].length()-1);
            }
        }
        for(String x : var){
            System.out.println(x);
        }
    }

}
