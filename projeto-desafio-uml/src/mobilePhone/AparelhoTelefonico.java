package mobilePhone;

public class AparelhoTelefonico implements Phone{
    public void ligar(){
        System.out.println("Ligando.");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz.");
    }

    public void atender(){
        System.out.println("Atendendo.");
    }    
}
