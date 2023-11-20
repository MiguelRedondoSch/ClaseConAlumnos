public class Asignatura {
    private String nombre;
    private  int horasSemanales;

    public Asignatura(String nombre, int horasSemanales) {
        this.nombre = nombre;
        this.horasSemanales = horasSemanales;
    }
    
     public String getNombre(){
        return nombre;
    }
    
    public int getHorasSemanales(){
        return horasSemanales;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setHorasSemanales(int horasSemanales){
        this.horasSemanales = horasSemanales;
    }
}
