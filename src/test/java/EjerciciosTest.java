import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EjerciciosTest {

    private final Ejercicios e = new Ejercicios();

    //Test para EjercicioUno

    @Test
    public void num1MayorEjercicioUnoTest(){
        int num1 = 10;
        int num2 = 2;
        int num3 = 3;
        int result = e.mayorDeLosTresEjercicioUno(num1,num2,num3);
        assertEquals(num1, result);
    }

    @Test
    public void todosNegativosNum3MayorEjercicioUnoTest(){
        int num1 = -10;
        int num2 = -2;
        int num3 = -1;
        int result = e.mayorDeLosTresEjercicioUno(num1, num2, num3);
        assertEquals(num3, result);
    }

    @Test
    public void numerosIgualesEjercicioUnoTest(){
        int num1 = 10;
        int num2 = 10;
        int num3 = 10;
        int result = e.mayorDeLosTresEjercicioUno(num1, num2, num3);
        assertEquals(num1, result);
        assertEquals(num2, result);
        assertEquals(num3, result);
    }

    @Test
    public void num1NeutroNum2yNum3igualesEjercicioUnoTest(){
        int num1 = 0;
        int num2 = 1;
        int num3 = 1;
        int result = e.mayorDeLosTresEjercicioUno(num1, num2, num3);
        assertEquals(num2, result);
        assertEquals(num3, result);

    }

    //Test para EjercicioDos

    @Test
    public void num1MenorNum2EjercicioDosTest(){
        int num1 = 10;
        int num2 = 20;
        int result = e.minEntreDosNumerosEjercicioDos(num1, num2);
        assertEquals(num1, result);
    }

    @Test
    public void num1MayorNum2EjercicioDosTest(){
        int num1 = 2;
        int num2 = 1;
        int result = e.minEntreDosNumerosEjercicioDos(num1, num2);
        assertEquals(num2, result);
    }

    @Test
    public void num1IgualNum2EjercicioDosTest(){
        int num1 = 10;
        int num2 = 10;
        int result = e.minEntreDosNumerosEjercicioDos(num1, num2);
        assertEquals(num1, result);
        assertEquals(num2, result);
    }

    //Test para EjercicioTres

    @Test
    public void esVocalEjercicioTres(){
       char c = 'i';
       assertTrue(e.esVocalEjercicioTres(c));
    }

    @Test
    public void noEsVocalEjercicioTres(){
        char c = 'x';
        assertFalse(e.esVocalEjercicioTres(c));
    }

}
