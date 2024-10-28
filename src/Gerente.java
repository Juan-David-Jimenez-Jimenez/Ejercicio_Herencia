public class Gerente extends Empleado {
    private String departamento;

    public Gerente() {

    }

    public Gerente(String cedula, String nombre, double salario, String departamento, TipoEmpleado tipoEmpleado) {
        super(cedula, nombre, salario, tipoEmpleado);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                ", cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", tipoEmpleado=" + tipoEmpleado +
                '}';
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Detalles del empleado:");
        System.out.println("Cédula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
        System.out.println("Tipo de empleado: "+ tipoEmpleado);
    }

    @Override
    public void calcularBonificacion() {
        double bonificacion = salario * 0.20;
        System.out.println("Bonificación: $" + bonificacion);
    }
}
