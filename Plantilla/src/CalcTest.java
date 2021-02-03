import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import java.util.List;

public class CalcTest {
    @Test
    @DisplayName("Primer ejercicio del examen de manera simple")
    public void Test1(){
        //Llamamos a la clase calculadora
        Calc colega = new Calc();
        //Resultado varia segun el tipo de metodo
        int test1= ((Calc) colega).numeroEscrito("uno");
        //resultado=colega.lallamada;
        //assertEquals("Lo que esperas que salga", result);
        assertEquals(1, test1);
    }

    @Test
    @DisplayName("Primer ejercicio del examen con espacios y diferentes caracteres")
    public void Test2(){
        //Llamamos a la clase calculadora
        Calc colega = new Calc();
        //Resultado varia segun el tipo de metodo
        int test2= ((Calc) colega).numeroEscrito(" DoS ");
        //resultado=colega.lallamada;
        //assertEquals("Lo que esperas que salga", result);
        assertEquals(2, test2);
    }

    @Test
    @DisplayName("Segundo ejercicio con espacios y diferentes caracteres")
    public void Test3(){
        //Llamamos a la clase Calculadora
        Calc colega = new Calc();
        //resultado varia segun el tipo de método
        List<Integer> result= new ArrayList<Integer>();
        result=colega.ValorNum("  UnO   Tress ");
        List<Integer> sol= new ArrayList<Integer>(List.of(1, 3));
        //resultado=colega.lallamada;
        //assertEquals("Lo que esperas que salga", result);
        assertEquals(sol, result);
    }

    @Test
    @DisplayName("Tercer jercicio de valores absolutos totales")
    public void Test4(){
        //Llamamos a la clase Calculadora
        Calc colega = new Calc();
        //resultado varia segun el tipo de método
        List<Double> result = new ArrayList<Double>();
        result=colega.proporcional(new int[]{1,2,3}, 60);
        List<Double> sol= new ArrayList<Double>(List.of(10.00, 20.00,30.00));
        assertEquals(sol, result);
        
    }
  
}
