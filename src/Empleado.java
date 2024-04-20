public class Empleado {
    protected String codigo;
    protected String nombreCompleto;
    protected String cedula;
    protected String direccion;
    protected String fechaInicio;

    public Empleado(String codigo, String nombreCompleto, String cedula, String direccion, String fechaInicio) {
        this.codigo = codigo;
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.direccion = direccion;
        this.fechaInicio = fechaInicio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void mostrarDatos() {
        System.out.println("Código: " + codigo + "\nNombre: " + nombreCompleto + "\nCédula: " + cedula +
                "\nDirección: " + direccion + "\nFecha de Inicio: " + fechaInicio);
    }
}

