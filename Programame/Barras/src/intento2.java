import java.util.Scanner;

public class intento2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            String codigo = sc.nextLine();
            if (codigo.equals("0")){
                break;
            }
            int longitud = codigo.length();
            boolean EAN8 = longitud <= 8;
            boolean EAN13 = longitud <= 13 && longitud > 8 ;
            if (EAN8){
                while (codigo.length()<8){
                    codigo = "0"+codigo;
                }
            }else if (EAN13){
                while (codigo.length()<13){
                    codigo = "0"+codigo;
                }
            }
            int SumaPares = 0;
            int SumaImpares = 0;
            int contador = 0;

            for (int i = codigo.length() -2; i >= 0; i--){
                int digito = Integer.parseInt(String.valueOf(codigo.charAt(i)));
                contador++;
                if (digito % 2 == 0){
                    SumaPares = SumaPares + digito;
                }else{
                    SumaImpares = SumaImpares + digito;
                }
            }
            int SumaTotal =  SumaImpares+SumaPares;
            int Digitocalculado;
            int resto = SumaTotal % 10;
            Digitocalculado = (resto ==0) ? 0 : (10 - resto);

            int digitoReal = Integer.parseInt(String.valueOf(codigo.charAt(codigo.length()-1)));
            boolean contol = (Digitocalculado == digitoReal);

            if (contol){
                System.out.print("SI");
            }else{
                System.out.print("NO");
                continue;
            }
        }
    }
}
