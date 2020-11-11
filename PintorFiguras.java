
/**
 *  Clase que dibuja una figura 
 * 
 * @author - 
 *  
 */
public class PintorFiguras
{
    private static final int ANCHO_BLOQUE = 4;
    private static final char ESPACIO = ' ';
    private static final char CAR1 = 'B';
    private static final char CAR2 = '=';
    /**
     * Dibuja una figura (ver enunciado) de altura
       * indicada (se asume la altura un valor correcto)
     * 
     * (usa bucles for)
     */
    public  void dibujarFigura(int altura) {
        int n = altura;
        String caracter1 = "";
        String caracter2 = "";
        for(int i = 0; i < this.ANCHO_BLOQUE; i++){
            caracter1 = caracter1 + this.CAR1;
        }
        for(int i = 0; i < this.ANCHO_BLOQUE; i++){
            caracter2 = caracter2 + this.CAR2;
        }
        for(int i = 0; i < altura; i++){

            this.escribirEspacios(this.ESPACIO, n);
            for(int j = 0; j <= altura - n; j++){
                if(j % 2 == 0){
                    System.out.print(caracter1);
                }else{
                     System.out.print(caracter2);
                }
            }
            n--;
            System.out.println("");
        }
        
    }

    /**
     * Método privado de ayuda que escribe n espacios en la misma línea
     */
    private  void escribirEspacios(char caracter, int n) {
        int cantidadEspacios = (n - 1) * this.ANCHO_BLOQUE / 2;
        String espacio = "";
        
        for(int i = 0; i < cantidadEspacios; i++){
            espacio = espacio + caracter;
        }
        System.out.print(espacio);
        
    }
}
