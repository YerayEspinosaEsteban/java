import pojo.Magdalena;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Magdalena magdalena = new Magdalena("Chocolate","Si");
        Magdalena magdalena1 = new Magdalena("Fresa","Si");
        Magdalena magdalena2 = new Magdalena("Chocolate","Si");
        Magdalena magdalena3 = new Magdalena("Fresa","Si");
        Magdalena[] listaMagdalenas = new Magdalena[4];
        listaMagdalenas[0] = magdalena;
        listaMagdalenas[1]= magdalena1;
        listaMagdalenas[2]= magdalena2;
        listaMagdalenas[3]= magdalena3;
        for (int i = 0; i < 4; i++) {
            System.out.println(listaMagdalenas[i]);
        }






       /// Arraylist<Magdalena> listaMagdina  ///queremos q sean versatiles
            //    = new ArrayList<Magdalena>();


    }
}