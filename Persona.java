public class Persona {
    private String nombre;
    private String apellido;
    public Persona(String n, String a){ this.nombre = n; this.apellido = a; }
    public String nombreCompleto(){ return nombre + " " + apellido; }
}
