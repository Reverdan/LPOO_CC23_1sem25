package modelo;

public class Calculos
{
    public Double resultado;
    public Double n1;
    public Double n2;
    public String op;

    public Calculos(Double n1, Double n2, String op)
    {
        this.n1 = n1;
        this.n2 = n2;
        this.op = op;
        this.calcular();
    }
    
    
    
    public Double calcular()
    {
        resultado = 0.0;
        if(this.op.equals("+")) resultado = this.n1 + this.n2;
        if(this.op.equals("-")) resultado = this.n1 - this.n2;
        if(this.op.equals("*")) resultado = this.n1 * this.n2;
        if(this.op.equals("/")) resultado = this.n1 / this.n2;
        
        return resultado;
    }
}
