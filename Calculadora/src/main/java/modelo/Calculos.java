package modelo;

public class Calculos
{
    private Double resultado;
    private Double n1;
    private Double n2;
    private String op;

    public Calculos(Double n1, Double n2, String op)
    {
        this.n1 = n1;
        this.n2 = n2;
        this.op = op;
        this.calcular();
    }
    
    private void calcular()
    {
        resultado = 0.0;
        if(this.op.equals("+")) this.resultado = this.n1 + this.n2;
        if(this.op.equals("-")) this.resultado = this.n1 - this.n2;
        if(this.op.equals("*")) this.resultado = this.n1 * this.n2;
        if(this.op.equals("/")) this.resultado = this.n1 / this.n2;
    }

    public Double getResultado()
    {
        return resultado;
    }

    
}
