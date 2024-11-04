public class Main {
    public static void main(String[] args){
        Estudiante e = new Estudiante("Ana","Perez",123);
        Docente d = new Docente("Carlos","Lopez","Matematicas");
        System.out.println(e.nombreCompleto() + " - " + e.getLegajo());
        System.out.println(d.nombreCompleto() + " - " + d.getDepartamento());
    }
}
