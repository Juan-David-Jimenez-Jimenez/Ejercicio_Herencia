public class Administrativo  extends Empleado{
    private String area;

    public Administrativo() {
    }

    public Administrativo(String cedula, String nombre, double salario, TipoEmpleado tipoEmpleado, String area) {
        super(cedula, nombre, salario, tipoEmpleado);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
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
        double bonificacion = salario * 0.5;
        System.out.println("Bonificación: $" + bonificacion);
    }



}
