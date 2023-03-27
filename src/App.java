import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número máximo de dígitos da pirâmide: ");
        int maximo = scanner.nextInt();
        
        for (int i = 1; i <= maximo; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        
        scanner.close();
    }
}