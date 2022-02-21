package A.BeautyfulMatrix;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 * @topic https://codeforces.com/contest/263/problem/A
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][]a = new int[5][5];
        int col = 0;
        int row = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                a[i][j] = sc.nextInt();
                if(a[i][j] == 1){
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println((int)(Math.abs(2-row) + Math.abs(2-col)));
    }
}
