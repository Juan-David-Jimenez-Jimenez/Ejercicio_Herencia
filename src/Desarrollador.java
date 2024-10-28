public class Desarrollador extends Empleado {
    private String lenguaje;

    public Desarrollador() {

    }

    public Desarrollador(String cedula, String nombre, double salario, TipoEmpleado tipoEmpleado, String lenguaje) {
        super(cedula, nombre, salario, tipoEmpleado);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
        return "Desarrollador{" +
                "lenguaje='" + lenguaje + '\'' +
                ", cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", salario=" + salario +
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
        double bonificacion = salario * 0.10;  // Suponiendo que la bonificación es el 10% del salario
        System.out.println("Bonificación: $" + bonificacion);
    }


}
