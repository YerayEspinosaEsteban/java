import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Barra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String codigo = sc.nextLine();
            if (codigo.equals("0")) break;
            int longitud = codigo.length();

            boolean Ne8 = longitud <= 8;
            boolean Ne13 = longitud > 8 && longitud <= 13;

            if (Ne8){
                while (codigo.length()<8){
                    codigo = "0"+codigo;
                }
            }else if (Ne13){
                while (codigo.length()<13){
                    codigo = "0"+codigo;
                }
            }
            int contadores = 0;
            int SumaPar = 0;
            int SumaImpar = 0;

        }
    }
}