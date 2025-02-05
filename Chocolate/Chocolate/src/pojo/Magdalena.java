
package pojo;

public class Magdalena {
    //atributos
    //public int id;

    private String comer;
    private String rellenar;
   private String estado;

   //public void setID (int id){
  //     if(id<0){
     //      System.out.println("error");
   //    }else{

     //  }
       //this.id = id;
  // }

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