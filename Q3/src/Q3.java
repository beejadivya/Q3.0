import java.util.Scanner;
public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String m = sc.next();
        int len = sc.nextInt();
        for (int i =0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(n);
            }
            for (int k = len - i - 1; k > 0; k--) {
                System.out.print(m);
            }
            System.out.println();
        }
    }
}





