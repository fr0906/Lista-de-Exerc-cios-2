import java.util.Locale;
import java.util.Scanner;

public class Exe28 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        System.out.print("Distancia percorrida: ");
        int distancia = sc.nextInt();

        System.out.print("Combustível gasto: ");
        double combustivel = sc.nextDouble();

        double consumoMedio = distancia / combustivel;

        System.out.printf("Consumo médio = %.3f km/l%n", consumoMedio);

        sc.close();
    }
}
