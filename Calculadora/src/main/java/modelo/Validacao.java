package modelo;

public class Validacao
{
    public Double n1;
    public Double n2;
    public String mensagem;
    public String numero1;
    public String numero2;
    public String op;
    
    public Validacao(String numero1, String numero2, String op)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.op = op;
        this.validar();
    }
    
    
    public void validar()
    {
        mensagem = "";
        try
        {
            n1 = Double.parseDouble(numero1);
            n2 = Double.parseDouble(numero2);
            if(n2.equals(0.0) && op.equals("/"))
                mensagem = "Divisão por zero";
        }
        catch (Exception e)
        {
            mensagem = "Números inválidos";
        }
    }
}
