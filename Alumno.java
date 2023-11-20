public class Alumno {
    private String nombre;
    private int edad;
    private Asignatura asignatura;

    public Alumno(String nombre, int edad, Asignatura asignatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.asignatura = asignatura;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public Asignatura getAsignatura(){
        return asignatura;
    }

    public void setNombre(string nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setAsignatura(Asignatura asignatura){
        this.asignatura = asignatura;
    }
}