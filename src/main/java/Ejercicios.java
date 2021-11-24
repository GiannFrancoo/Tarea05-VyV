public class Ejercicios {

    /*
        Devolvera el mayor de los tres numeros pasados por parametros
        parametros: tres numeros enteros
        resultado: entero, el mayor de los tres

     */
    public int mayorDeLosTresEjercicioUno(int num1, int num2, int num3){
        int toReturn;
        if (num1 > num2)
            if(num1 > num3)
                toReturn = num1;
            else
                toReturn = num3;
        else
            if (num2 > num3)
                toReturn = num2;
            else
                toReturn = num3;

        return toReturn;
    }

    /*
        Devolvera el minimo entre dos numeros pasados por parametros
        parametros: dos numeros enteros
        resultado: entero, el minimo
     */
    public int minEntreDosNumerosEjercicioDos(int num1, int num2){
        int toReturn;

        if (num1 < num2)
            toReturn = num1;
        else
            toReturn = num2;

        return toReturn;
    }

    /*
        Devolvera si una caracter pasado por parametro es vocal
        parametros: un caracter
        resultado: verdadero en el caso que sea vocal, falso en caso contrario
     */
    public boolean esVocalEjercicioTres(char c){
        c = Character.toUpperCase(c);
        boolean toReturn;
        
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            toReturn = true;
        }
        else{
            toReturn = false;
        }
        
        return toReturn;
    }

}
