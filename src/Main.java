// Estudiante: Juan David Jimenez Jimenez

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Gerente("1234", "Juan", 5000000, "TI", TipoEmpleado.GERENTE));
        empleados.add(new Gerente("12345", "Tatiana", 6000000, "TI", TipoEmpleado.GERENTE));
        empleados.add(new Gerente("123456", "Santiago", 4000000, "Finanzas", TipoEmpleado.GERENTE));

        empleados.add(new Desarrollador("1234567", "Karen", 2000000, TipoEmpleado.DESARROLLADOR, "Java"));
        empleados.add(new Desarrollador("12345678", "Sofia", 2500000, TipoEmpleado.DESARROLLADOR, "Java"));
        empleados.add(new Desarrollador("12345679", "Laura", 3000000, TipoEmpleado.DESARROLLADOR, "Java"));

        empleados.add(new Administrativo("456","Sara", 3000000, TipoEmpleado.ADMINISTRATIVO, "Atencion al cliente" ));
        empleados.add(new Administrativo("234", "David", 150000, TipoEmpleado.ADMINISTRATIVO, "Atencion al cliente"));
        empleados.add(new Administrativo("2354", "Sofia", 2000000, TipoEmpleado.ADMINISTRATIVO, "Atencion al cliente"));

        // Mostrar detalles de cada empleado y calcular la bonificación
        System.out.println("Información de los empleados: \n");
        for (Empleado empleado : empleados) {
            empleado.mostrarDetalle();
            empleado.calcularBonificacion();
            System.out.println();
        }
    }
}