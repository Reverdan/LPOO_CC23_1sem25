package modelo;

import java.util.List;

public class Validacao
{
    public String mensagem;
    
    public void validar(List<String> listaDadosPessoa)
    {
        this.mensagem = "";
        if (listaDadosPessoa.get(0).length() < 3)
            this.mensagem += "Nome deve ter mais que 3 caracteres \n";
        if (listaDadosPessoa.get(0).length() > 50)
            this.mensagem += "Nome deve ter menos que 50 caracteres \n";
        if (listaDadosPessoa.get(1).length() < 8 || 
                listaDadosPessoa.get(1).length() > 9)
            this.mensagem += "RG inválido \n";
        if (listaDadosPessoa.get(2).length() < 11 ||
                listaDadosPessoa.get(2).length() > 12)
            this.mensagem += "CPF inválido \n";
            
    }
}
