import pojo.Magdalena;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Magdalena magdalena = new Magdalena("fresa", "mediano",'S');
        Magdalena magdalena2 = new Magdalena("limon", "mediano",'N');
        Magdalena magdalena3 = new Magdalena("chocolate", "mediano", 'S');
        Magdalena magdalena4 = new Magdalena("vainilla", "mediano", 'S');

        Magdalena[] ListaMagdalena = new Magdalena[4];
        ListaMagdalena[0] = magdalena;
        ListaMagdalena[1] = magdalena2;
        ListaMagdalena[2] = magdalena3;
        ListaMagdalena[3] = magdalena4;

        for (int i = 0; i < ListaMagdalena.length; i++) {
            System.out.println(ListaMagdalena[i].toString() + " Sabor: " + ListaMagdalena[i].addSabor() + " Tamaño: " + ListaMagdalena[i].addTamaño() + " Decorada: " + ListaMagdalena[i].addDecorada());
        }



    }
}