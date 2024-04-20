public class EmpleadoTiempoCompleto extends Empleado {
    private boolean estaActivo;

    public EmpleadoTiempoCompleto(String codigo, String nombreCompleto, String cedula, String direccion, String fechaInicio, boolean estaActivo) {
        super(codigo, nombreCompleto, cedula, direccion, fechaInicio);
        this.estaActivo = estaActivo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Está activo: " + estaActivo);
    }
}
