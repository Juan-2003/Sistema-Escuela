public class Persona {
    private Nombre nombre;
    private int edad;
    private Fecha fechaNacimiento;
    private String email;
    private String codigo;
    private String centroUniversitario;
    private int id;

    public Persona(Nombre nombre, int edad, Fecha fechaNacimiento){
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.email = "-----";
    }

    public void setNombre(Nombre nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setCentroUniversitario(String centroUniversitario){
        this.centroUniversitario = centroUniversitario;
    }

    public void setId(int id){
        this.id = id;
    }

    public Nombre getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public Fecha getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    public String getEmail(){
        return this.email;
    }

    public String getCentroUniversitario(){
        return this.centroUniversitario;
    }

    public int id(){
        return this.id;
    }

    public String toString(){
        return  nombre.toString() + "\n" +
                "Edad: "+ String.valueOf(edad) + "\n" +
                "Fecha Nacimiento: "+ fechaNacimiento.toString() + "\n"+
                "Email: " + email + "\n" +
                "Codigo: " + codigo + "\n" +
                "Centro: " + centroUniversitario + "\n"+
                "Id: " + String.valueOf(id);
    }

}
