public class Alumno {
    private String nombre;
    private int edad;
    private double examenFinal;

    public Alumno(String nombre, int edad, double examenFinal){
        this.nombre = nombre;
        this.edad = edad;
        this.examenFinal = examenFinal;
    }
    public Alumno(){
        this.nombre = nombre;
        this.edad = edad;
        this.examenFinal = examenFinal;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public double getExamenFinal(){
        return this.examenFinal;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setExamenFinal(int examenfinal){
        this.examenFinal = examenfinal;

    }

    public void agregarAlumno(){


    }


    public void mostrarEstado(){
        String estado = """
                Nombre: %s
                edad %d
                nota: %.2f
                
                """.formatted(this.nombre,this.edad,this.examenFinal);
        System.out.println(estado);
    }


}

class PruebaAlumno{
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("juan", 14, 16);


        Alumno alumno1 = new Alumno("juan", 14, 16);
        alumno1.mostrarEstado();








    }
}
