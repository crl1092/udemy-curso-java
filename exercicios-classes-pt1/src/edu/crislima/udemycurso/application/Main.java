import edu.crislima.udemycurso.application.entities.Rectangle;

void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Rectangle r = new Rectangle();
    System.out.println("Digite o valor do rectangle: ");
    r.width = sc.nextDouble();
    r.height = sc.nextDouble();

    System.out.println("Área: " + r.calcularArea());
    System.out.println("Perimeter: " + r.calcularPerimetro());
    System.out.println("Diagonal: " + r.calcularDiagonal());
    sc.close();
}