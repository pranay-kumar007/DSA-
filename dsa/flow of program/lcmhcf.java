import java.util.Scanner;
public class lcmhcf {
    public static double gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = b%a;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
        double lcm  =(a*b)/gcd(a,b);
        System.out.println(lcm);
    }
}
