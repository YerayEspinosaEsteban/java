import pojo.AlamacenarCanciones;
import pojo.AlmacenCanciones;
import pojo.Cancion;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       AlamacenarCanciones almacen = new AlamacenarCanciones();

       Cancion c1 = new Cancion("NoCap","Trueno",2.34);
       Cancion c2 = new Cancion("Trunky Funky","Trueno",2.56);

       almacen.add(c1);
       almacen.add(c2);
       almacen.imprimir();

       almacen.delete("NoCap");
       almacen.delete("Ameri");
       almacen.imprimir();


    }
}