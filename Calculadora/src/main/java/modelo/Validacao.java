package modelo;

public class Validacao
{
    public Double n1;
    public Double n2;
    public String mensagem;
    
    public void validar(String numero1, String numero2, String op)
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
