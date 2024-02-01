public class Profesor extends  Persona{
    private String gradoAcademico;
    private int salario;
    private int numeroClases;
    //private Clases clases;

    public Profesor(Nombre nombre, int edad, Fecha fechaNacimiento){
        super(nombre, edad, fechaNacimiento);
    }

    public void setGradoAcademico(String gradoAcademico){
        this.gradoAcademico = gradoAcademico;
    }

    public void setSalario(int salario){
        this.salario = salario;
    }

    public void setNumeroClases(int numeroClases){
        this.numeroClases = numeroClases;
    }

    public String getGradoAcademico(){
        return this.gradoAcademico;
    }

    public int getSalario(){
        return this.salario;
    }

    public int getNumeroClases(){
        return this.numeroClases;
    }

    @Override
    public String toString() {
        return "Grado Academico: "+ gradoAcademico + "\n" +
                "Salario: " + salario + "\n" +
                "Numero Clases: " + numeroClases;
    }
}
