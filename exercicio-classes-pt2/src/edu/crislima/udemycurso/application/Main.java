import edu.crislima.udemycurso.application.entities.Employee;

void main() {
    Locale.setDefault(Locale.US);
    Employee e1 = new Employee();
    e1.name = "João silva";
    e1.bruteSalary = 6000.00;
    e1.tax = 1000.00;

    e1.infos();

    e1.increaseSalary(10.0);
}