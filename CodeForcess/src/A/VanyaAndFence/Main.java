package A.VanyaAndFence;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 * @topic https://codeforces.com/contest/677/problem/A
 * 
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int widthRoad = 0;
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            if (height > h) {
                widthRoad += 2;
            } else {
                widthRoad++;
            }
        }
        System.out.println(widthRoad);
    }
}
