package pojo;

public class Magdalena {

    private String tamaño;
    private String sabor;
    private char decorada;


    public Magdalena(String sabor, String tamaño, char decorada) {
        this.sabor = sabor;
        this.tamaño = tamaño;
        this.decorada = decorada;
    }

    public String addSabor() {
        return sabor;
    }

    public String addTamaño() {
        return tamaño;
    }

    public char addDecorada() {
        return decorada;
    }
}


