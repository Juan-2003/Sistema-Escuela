import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Materia programacion = new Materia("Programacion", "IL365");
        Nombre nombre = new Nombre("Juan Pablo", "Cruz", "Sanchez");
        Fecha fecha = new Fecha("05", "06", "2003");
        Profesor profesor = new Profesor(nombre, 20, fecha);
        Horario horario = new Horario("L", "14:00", "X20");
        programacion.addListaClases("123456789", profesor, horario);
        programacion.addListaClases("987654321", profesor, horario);
        programacion.addListaClases("000000000", profesor, horario);

        for(int i = 0;i < programacion.getListaClases().size(); i++){
            System.out.println(programacion.toString());
            System.out.println(programacion.getListaClases().get(i) + "\n");
        }


        /*Materia materia = new Materia("Programacion", "00000");
        Materia materia2 = new Materia("Matematicas", "11111");
        Nombre nombre = new Nombre("Juan Pablo", "Cruz", "Sanchez");
        Fecha fecha = new Fecha("05", "06", "2003");
        Profesor profesor = new Profesor(nombre, 20, fecha);

        Materia.Clases clase = new Materia.Clases("123456789", profesor);
        Materia.Clases clase2 = new Materia.Clases("987654321", profesor);
        Map<Materia, Materia.Clases>materias = new HashMap<>();

        materias.put(materia, clase);
        materias.put(materia2, clase2);

        for(int i = 0;i < materias.size(); i++){
            System.out.println(materias.get(i+1));
        }*/

    }
}