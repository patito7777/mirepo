public class Docente extends Persona {
    private String departamento;
    public Docente(String n, String a, String d){ super(n,a); this.departamento = d; }
    public String getDepartamento(){ return departamento; }
}
