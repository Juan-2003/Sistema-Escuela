public class Horario {
    private String dia;
    private String hora;
    private String salon;

    public Horario(String dia, String hora, String salon){
        this.dia = dia;
        this.hora = hora;
        this.salon = salon;
    }

    public void setDia(String dia){
        this.dia = dia;
    }

    public void setHora(String hora){
        this.hora = hora;
    }

    public void setSalon(String salon){
        this.salon = salon;
    }

    public String getDia(){
        return this.dia;
    }

    public String getHora(){
        return this.hora;
    }
    public String getSalon(){
        return this.salon;
    }

    @Override
    public String toString(){
        return "Dia: " + dia + "\n" +
                "Hora: " + hora + "\n" +
                "Salon: " + salon;
    }

}
