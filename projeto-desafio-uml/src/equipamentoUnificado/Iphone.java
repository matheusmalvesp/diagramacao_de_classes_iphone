package equipamentoUnificado;

import mobilePhone.Phone;
import musica.Ipod;
import navegador.Internet;

public class Iphone implements Phone, Ipod, Internet {
    public void ligar(){
        System.out.println("Ligando pelo Iphone!");
    }
    
    
    public void iniciarCorreioVoz(){
        System.out.println("Inciando Correio de Voz pelo Iphone!");
    }
    
    
    public void atender(){
        System.out.println("Atendendo pelo Iphone!");
    }
    
    
    public void tocar(){
        System.out.println("Tocando música pelo Iphone!");
    }
    
    
    public void pausar(){
        System.out.println("Pausando música pelo Iphone!");
    }
    
    
    public void selecionarMúsica(){
        System.out.println("Selecionando música pelo Iphone!");
    }
    
    
    public void exibirPagina(){
        System.out.println("Exibindo página pelo Iphone!");
    }
    
    
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba pelo Iphone!");
    }
    
    
    public void atualizarPagina(){
        System.out.println("Atualizando página pelo Iphone!");
    }
    
    
}
