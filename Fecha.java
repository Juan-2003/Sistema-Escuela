public class Fecha {
    private String dia;
    private String mes;
    private String anio;

    public Fecha(String dia, String mes, String anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void setDia(String dia){
        this.dia = dia;
    }

    public void setMes(String mes){
        this.mes = mes;
    }

    public void setAnio(String anio){
        this.anio = anio;
    }

    public String getDia(){
        return this.dia;
    }

    public String getMes(){
        return this.mes;
    }

    public String getAnio(){
        return this.anio;
    }

    public String toString(){
        return "Dia: " + dia + "\n" +
                "Mes: "+ mes + "\n" +
                "Anio: " + anio;
    }
}
