
/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author - 
 * 
 */
public class CalculadoraOctal
{

    /**
     * sumar dos nºs supuestos en base 8 y con el mismo
     * nº de cifras
     * Asumimos positivos
     */
    public int sumarEnOctal(int n1, int n2) {
        int acarreo = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int cifra = 1;
        int resultado = 0;
        while(n1 >= 10 && n2 >= 10){
            n3 = n1 % 10;
            n4 = n2 % 10;
            n5 = n3 + n4 + acarreo;
            if (!(n5 >= 0 && n5 <= 7)){
                acarreo = 1;
                n5 = n5 - 8;
                resultado = resultado + (n5 * cifra);
            }else{
                acarreo = 0;
                resultado = resultado + (n5 * cifra);
            }
            n1 = (n1 - (n1 % 10)) / 10;
            n2 = (n2 - (n2 % 10)) / 10;
            cifra = cifra * 10;
        }
        n3 = n1 % 10;
        n4 = n2 % 10;
        n5 = n3 + n4 + acarreo;  
        if (!(n5 >= 0 && n5 <= 7)){
                acarreo = 1;
                n5 = n5 - 8;
                resultado = resultado + (n5 * cifra) + cifra * 10;
            }else{
                acarreo = 0;
                resultado = resultado + (n5 * cifra);
            }
        n1 = (n1 - (n1 % 10)) / 10;
        n2 = (n2 - (n2 % 10)) / 10;
        return resultado;
    }
}
