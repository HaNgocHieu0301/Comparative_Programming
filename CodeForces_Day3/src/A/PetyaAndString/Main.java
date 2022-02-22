package A.PetyaAndString;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 * @topic https://codeforces.com/contest/112/problem/A
 *
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();
//        for(int i = 0; i < a.length(); i++){
//            if(a.charAt(i) > b.charAt(i)){
//                System.out.println(1);
//                return;
//            }else if(a.charAt(i) < b.charAt(i)){
//                System.out.println(-1);
//                return;
//            }
//        }
        int res = a.compareTo(b);
        if (res > 0) {
            System.out.println(1);
        } else if(res < 0){
            System.out.println(-1);
        }else{
            System.out.println(0);
        }
    }
}
