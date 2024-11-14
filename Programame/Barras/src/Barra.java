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

            for (int i = codigo.length() -2; i >= 0 ; i--) {
                contadores++;
                int digito = Integer.parseInt(String.valueOf(codigo.charAt(i)));
                if (digito % 2 == 0){
                    SumaPar = SumaPar + (digito * 1);

                }else{
                    SumaImpar = SumaImpar + (digito * 3);
                }

            }
            int SumaTolal = SumaPar + SumaImpar;
            int digitoReal = Integer.parseInt(String.valueOf(codigo.charAt(codigo.length()-1)));
            boolean controlvalido = (digitoReal == SumaTolal);

            if (controlvalido) {
                System.out.print("SI");
            } else {
                System.out.println("NO");
            }



            }

    }
}