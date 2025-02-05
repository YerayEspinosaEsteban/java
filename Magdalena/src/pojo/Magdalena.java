package pojo;

public class Magdalena {

    String comer;
    String rellenar;

    String horneado;
    String estado;

    public Magdalena(String rellenar, String comer) {
        this.comer = comer;
        this.rellenar = rellenar;
    }

    public void rellenar() {
        this.estado = "rellenada";
        this.estado = estado;
        System.out.println("Magdalena rellenada");
    }

    public void comer() {
        System.out.println("Magdalena  " + estado + " me la voy ha comer");
        this.estado = "comida";
        this.estado = estado;
        System.out.println(this.estado);
    }
}