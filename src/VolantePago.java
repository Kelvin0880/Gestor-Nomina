public class VolantePago {
    private String id;
    private String titulo;
    private String descripcion;
    private double salarioBruto;
    private String fechaPago;
    private Empleado empleado;

    public VolantePago(String id, String titulo, String descripcion, double salarioBruto, String fechaPago, Empleado empleado) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.salarioBruto = salarioBruto;
        this.fechaPago = fechaPago;
        this.empleado = empleado;
    }

    public String getId() {
        return id;
    }

    public void mostrarDatos() {
        System.out.println("ID: " + id + "\nTítulo: " + titulo + "\nDescripción: " + descripcion +
                "\nSalario Bruto: " + salarioBruto + "\nFecha de Pago: " + fechaPago);
        empleado.mostrarDatos();
    }
}
