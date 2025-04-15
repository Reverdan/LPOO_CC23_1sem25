package modelo;

public class Controle
{
    private String numero;
    private String mensagem;

    public Controle(String numero)
    {
        this.numero = numero;
        this.Executar();
    }
    
    private void Executar()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao(this.numero);
        if (validacao.getMensagem().equals(""))
        {
            Primo primo = new Primo(validacao.getNum());
            this.mensagem = primo.getResposta();
        }
        else
        {
            this.mensagem = validacao.getMensagem();
        }
    }
    
    public String getMensagem()
    {
        return this.mensagem;
    }
}
