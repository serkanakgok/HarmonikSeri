import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        double result=0, n;

        Scanner data = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        n = data.nextInt();

        for (double i = 1; i <= n; i++) {
            result += (1 / i);
        }
        System.out.println("Harmonik seri :" + result);
    }
}
