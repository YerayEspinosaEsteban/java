package pojo;

public class Magdalena {

    private String textura;
    private String color;
    private String sabor;


    public Magdalena(String textura, String color, String sabor) {
        this.textura = textura;
        this.sabor = sabor;
        this.color = color;
    }

    public String addtextura() {
        return textura;
    }

    public String addsabor() {
        return sabor;
    }

    public String addcolor() {
        return color;
    }
}