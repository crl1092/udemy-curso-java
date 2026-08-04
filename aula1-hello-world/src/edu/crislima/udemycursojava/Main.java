import java.util.Scanner;
void main() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o primeiro numero: ");
    int primeiro = scan.nextInt();
    System.out.println("Digite o segundo numero: ");
    int segundo = scan.nextInt();

    int resultado = primeiro + segundo;

    System.out.println("Resultado: " + resultado);

    scan.close();
}
