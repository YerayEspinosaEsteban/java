import pojo.Magdalena;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Magdalena magdalena = new Magdalena("blanda","amarilla","dulce");
        Magdalena magdalena2 = new Magdalena("blanda","amarilla","dulce");
        Magdalena magdalena3 = new Magdalena("blanda","amarilla","dulce");
        Magdalena magdalena4 = new Magdalena("blanda","amarilla","dulce");

        Magdalena[] ListaMagdalena = new Magdalena[4];
        ListaMagdalena[0] = magdalena;
        ListaMagdalena[1] = magdalena2;
        ListaMagdalena[2] = magdalena3;
        ListaMagdalena[3] = magdalena4;

        for (int i = 0; i < ListaMagdalena.length; i++) {
            System.out.println(ListaMagdalena[i].toString() + " Color: " + ListaMagdalena[i].addcolor() + " Textura: " + ListaMagdalena[i].addtextura() + " Sabor: " + ListaMagdalena[i].addsabor());
        }



    }
}