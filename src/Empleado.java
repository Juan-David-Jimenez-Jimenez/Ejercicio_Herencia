public class Empleado {
    protected String cedula;
    protected String nombre;
    protected double salario;
    protected TipoEmpleado tipoEmpleado;

    public Empleado() {
    }

    public Empleado(String cedula, String nombre, double salario, TipoEmpleado tipoEmpleado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.salario = salario;
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", tipoEmpleado=" + tipoEmpleado +
                '}';
    }

    public void mostrarDetalle() {
        System.out.println("Detalles del Empleado:");
        System.out.println("Cédula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
        System.out.println("Tipo de empleado: " + tipoEmpleado);
    }

    public void calcularBonificacion() {
        double bonificacion = salario;
        System.out.println("Bonificación: $" + bonificacion);
    }
}
