import java.util.ArrayList;
public class Materia {
    private String materiaNombre;
    private String clave;

    public Materia(String materiaNombre, String clave){
        this.materiaNombre = materiaNombre;
        this.clave = clave;
    }

    public void setMateriaNombre(String materiaNombre){
        this.materiaNombre = materiaNombre;
    }

    public void setClave(String clave){
        this.clave = clave;
    }

    ArrayList<Clases>listaClases = new ArrayList<>();
    public void addListaClases(String NRC, Profesor profesor, Horario horario){
        listaClases.add(new Materia.Clases(NRC, profesor, horario));
    }
    public ArrayList<Clases>getListaClases(){
        return listaClases;
    }

    @Override
    public String toString() {
        return "Materia: " + materiaNombre + "\n" +
                "Clave: " + clave;
    }

    public static class Clases{
        private String NRC;
        private Profesor profesor;
        private Horario horario;

        public Clases(String NRC, Profesor profesor, Horario horario){
            this.NRC = NRC;
            this.profesor = profesor;
            this.horario = horario;
        }

        public void setNRC(String NRC){
            this.NRC = NRC;
        }
        public void setProfesor(Profesor profesor){
            this.profesor = profesor;
        }
        public void setHorario(Horario horario){
            this.horario = horario;
        }

        public String getNRC(){
            return this.NRC;
        }
        public Profesor getProfesor(){
            return this.profesor;
        }
        public Horario getHorario(){
            return this.horario;
        }

        @Override
        public String toString() {
            return "NRC: " + NRC + "\n"+
                    "PROFESOR "+ "\n"+ profesor.getNombre() + "\n" +
                    "HORARIO " +"\n"+ horario.toString();
        }
    }
}
