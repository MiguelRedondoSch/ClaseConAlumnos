public class Clase {
    private String tutor;
    private  String asignatura;
    private Alumno alumno;

    public Clase(String tutor, String asignatura, Alumno alumno) {
        this.tutor = tutor;
        this.asignatura = asignatura;
        this.alumno = alumno;
    }
    
    public String getTutor(){
        return tutor;
    }
    
    public String getAsignatura(){
        return asignatura;
    }
    
    public Alumno getalumno(){
        return alumno;
    }
    
    public void setTutor(String tutor){
        this.tutor = tutor;
    }
    
    public void setAsignatura(String asignatura){
        this.asignatura = asignatura;
    }
    
    public void setAlumno(Alumno alumno){
        this.alumno = alumno;
    }
    
    public void imprimirDetalles(){
        System.out.println("Tutor: " + tutor);
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Alumno: " + alumno.getNombre());
    }
}
