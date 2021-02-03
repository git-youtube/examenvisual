
import java.util.ArrayList;
import java.util.List;

public class Calc {

    // Aqui van los metodos
    public int numeroEscrito(String a) {
        int resultado = 0;
        String palabras = a.trim().toLowerCase();
        palabras = palabras.replaceAll("(.)\\1+", "$1");
        if (palabras.equals("uno"))
            resultado = 1;
        else if (palabras.equals("dos"))
            resultado = 2;
        else if (palabras.equals("tres"))
            resultado = 3;
        else if (palabras.equals("cuatro"))
            resultado = 4;
        else if (palabras.equals("cinco"))
            resultado = 5;
        else if (palabras.equals("seis"))
            resultado = 6;
        else if (palabras.equals("siete"))
            resultado = 7;
        else if (palabras.equals("ocho"))
            resultado = 8;
        else if (palabras.equals("nueve"))
            resultado = 9;

        return resultado;
    }

    public List<Integer> ValorNum(String b) {

        List<Integer> valores = new ArrayList<Integer>();
        ;

        String[] palabras = b.trim().split("\s+");

        for (int i = 0; i < palabras.length; i++) {

            valores.add(numeroEscrito(palabras[i]));
        }
        return valores;
    }

    public List<Double> proporcional(int[] c, double valor) {
        ArrayList<Double> proporciones = new ArrayList<Double>();
        double suma = 0;
        for (int i = 0; i < c.length; i++)
            suma += c[i];
        for (int i = 0; i < c.length; i++) {
            double nuevoValor = (c[i] * valor) / suma;
            proporciones.add(nuevoValor);
        }
        return proporciones;
    }

	public ArrayList<Double> proporcional(String string) {
		return null;
	}
}