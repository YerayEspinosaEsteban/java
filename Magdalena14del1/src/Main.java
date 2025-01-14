import pojo.Almacen;
import pojo.Pedido;
import pojo.Producto;

import java.util.Scanner;

public class Main {
    //  Producto magdalena = new Producto ("Magdalenas de chocolate", 1.50, 10);
    // Producto croasan = new Producto ("croasan de chocolate", 1.50, 10);
    // Producto donut = new Producto ("Donut de chocolate", 1.50, 10);


    // magdalena.setCantidad(25);

    // System.out.println(magdalena.toString());
    // System.out.println(croasan.toString());
    // System.out.println(donut.toString());

    // Pedido pedido = new Pedido(5);
    // pedido.agregarProducto(magdalena, 3);
    // pedido.agregarProducto(croasan, 1);
    // pedido.agregarProducto(donut, 2);

    //pedido.imprimirTicket();

    public static void main(String[] args) {



        Almacen almacen = new Almacen();
        almacen.agregarProductoAlmacen(new Producto("Algodon", 1.70, 10));
        almacen.agregarProductoAlmacen(new Producto("Chuches", 2.00, 50));
        almacen.agregarProductoAlmacen(new Producto("Bizcocho", 2.80, 60));
        almacen.agregarProductoAlmacen(new Producto("Magdalenas", 9.50, 22));
        almacen.agregarProductoAlmacen(new Producto("Panettone", 9.50, 22));
        almacen.agregarProductoAlmacen(new Producto("gusanos", 7.80, 60));
        almacen.agregarProductoAlmacen(new Producto("sandia", 9.50, 82));
        almacen.agregarProductoAlmacen(new Producto("Panettone de fresa", 5.50, 32));

        almacen.mostrarAlmacen();

        almacen.buscarProductoPorNombre("sandia");
    }
}