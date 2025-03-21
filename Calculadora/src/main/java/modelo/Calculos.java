package modelo;

public class Calculos
{
    public Double calcular(Double n1, Double n2, String op)
    {
        Double resultado = 0.0;
        if(op.equals("+")) resultado = n1 + n2;
        if(op.equals("-")) resultado = n1 - n2;
        if(op.equals("*")) resultado = n1 * n2;
        if(op.equals("/")) resultado = n1 / n2;
        
        return resultado;
    }
}
