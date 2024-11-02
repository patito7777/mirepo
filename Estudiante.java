public class Estudiante extends Persona {
    private int legajo;
    public Estudiante(String n, String a, int l){ super(n,a); this.legajo = l; }
    public int getLegajo(){ return legajo; }
}
