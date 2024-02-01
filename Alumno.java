public class Alumno extends  Persona {
    private String carrera;
    private String promedio;

    public Alumno(Nombre nombre, int edad, Fecha fechaNacimiento){
        super(nombre, edad, fechaNacimiento);
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    public void setPromedio(String promedio){
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Carrera: " + carrera + "\n" +
                "Promedio: " + promedio;
    }




}
