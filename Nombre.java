public class Nombre {
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public Nombre(String nombres, String apellidoPaterno,
                  String apellidoMaterno){
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setNombres(String nombres){
        this.nombres = nombres;
    }

    public void setApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno){
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombres(){
        return this.nombres;
    }

    public String getApellidoPaterno(){
        return this.apellidoPaterno;
    }

    public String getApellidoMaterno(){
        return this.apellidoMaterno;
    }

    public String toString(){
        return "Nombre: " + nombres + "\n"+
                "Apellidos: " + apellidoPaterno + " " + apellidoMaterno;
    }
}
