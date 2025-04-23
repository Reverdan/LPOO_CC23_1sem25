package modelo;

public class Validacao extends absPropriedades
{

    public Validacao(String numero)
    {
        this.numero = numero;
        this.Executar();
    }
    
    @Override
    public void Executar()
    {
        this.mensagem = "";
        try
        {
            this.num = Integer.valueOf(this.numero);
        }
        catch (Exception e)
        {
            this.mensagem = "Digite valores validos";
        }
    }

    public int getNum()
    {
        return num;
    }

    public String getMensagem()
    {
        return mensagem;
    }
    

}
