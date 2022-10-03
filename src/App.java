import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a, b, soma;

        System.out.println("Digite dois números");
        a = sc.nextInt();
        b = sc.nextInt();

        soma = a+b;

        System.out.println("a soma dos dois e " + soma);

    }
}
