package modelo;

public class Validacao
{
    private Double n1;
    private Double n2;
    private String mensagem;
    private String numero1;
    private String numero2;
    private String op;
    
    public Validacao(String numero1, String numero2, String op)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.op = op;
        this.validar();
    }
    
    
    private void validar()
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

    public Double getN1()
    {
        return n1;
    }

    public Double getN2()
    {
        return n2;
    }

    public String getMensagem()
    {
        return mensagem;
    }
    
    
    
}
