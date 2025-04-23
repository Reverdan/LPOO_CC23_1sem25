package modelo;

import java.util.List;

public class Controle
{
    public String mensagem = "";
    
    public void cadastrar(List<String> listaDadosPessoa)
    {
        Validacao validacao = new Validacao();
        validacao.validar(listaDadosPessoa);
        if (validacao.mensagem.equals(""))
        {
            Pessoa pessoa = new Pessoa();
            pessoa.nome = listaDadosPessoa.get(0);
            pessoa.rg = listaDadosPessoa.get(1);
            pessoa.cpf = listaDadosPessoa.get(2);
            Estaticos.listaEstaticaPessoa.add(pessoa);
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
}
