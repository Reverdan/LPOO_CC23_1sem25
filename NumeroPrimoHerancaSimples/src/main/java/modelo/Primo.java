package modelo;

public class Primo extends absPropriedades
{
    public Primo(int num)
    {
        this.num = num;
        this.Executar();
    }
    
    public void Executar()
    {
        this.resposta = "E primo";
        for(int i = 2; i < num / 2 + 1; i++) // i++ = i = i + 1
        {
            if (num % i == 0)
            {
                this.resposta = "Nao e primo";
                break;
            }
        }
    }
   
    public String getResposta()
    {
        return resposta;
    }

    
    
    

}
