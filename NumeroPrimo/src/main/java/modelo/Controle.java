package modelo;

public class Controle
{
    private String numero;
    private String mensagem;
    private String resposta;

    public Controle(String numero)
    {
        this.numero = numero;
        this.Executar();
    }
    
    private void Executar()
    {
        
    }
    
    public String getMensagem()
    {
        return this.mensagem;
    }
    
    public String getResposta()
    {
        return this.resposta;
    }
}
