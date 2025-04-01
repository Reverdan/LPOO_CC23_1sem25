package modelo;

public class Controle
{
    private String resposta;
    
    public void executar(String numero1, String numero2, String op)
    {
        Validacao validacao = new Validacao(numero1, numero2, op);
        if(validacao.getMensagem().equals(""))
        {
            Calculos calculos = new Calculos(validacao.getN1(), validacao.getN2(), op);
            resposta = calculos.getResultado().toString();
        }
        else
        {
            resposta = validacao.getMensagem();
        }
    }

    public String getResposta()
    {
        return resposta;
    }
    
    
}
