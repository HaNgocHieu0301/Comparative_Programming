package A.Team;


import java.util.Scanner;


/**
 *
 * @author ADMIN
 * @topic https://codeforces.com/contest/231/problem/A
 * 
 */

/*
    cac bien moi lan nhap vao o day ko nhat thiet phai luu lai. ta có thể sử lí
    trực tiếp từng lần nhập vào luôn
*/
public class Team_143_D2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        int count = 0;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(x + y + z >= 2){
                count++;
            }
        }
        System.out.println(count);
        
    }
}
