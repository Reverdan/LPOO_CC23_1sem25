package modelo;

public class Controle
{
    public String resposta;
    
    public void executar(String numero1, String numero2, String op)
    {
        Validacao validacao = new Validacao();
        validacao.validar(numero1, numero2, op);
        if(validacao.mensagem.equals(""))
        {
            Calculos calculos = new Calculos();
            resposta = calculos.calcular(validacao.n1, validacao.n2, op).toString();
        }
        else
        {
            resposta = validacao.mensagem;
        }
    }
}
