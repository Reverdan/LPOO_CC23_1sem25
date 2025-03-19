package modelo;

public class Validacao
{
    public Double n1;
    public Double n2;
    public String mensagem;
    
    public void validar(String numero1, String numero2)
    {
        mensagem = "";
        try
        {
            n1 = Double.parseDouble(numero1);
            n2 = Double.parseDouble(numero2);
        }
        catch (Exception e)
        {
            mensagem = "Números inválidos";
        }
    }
}
