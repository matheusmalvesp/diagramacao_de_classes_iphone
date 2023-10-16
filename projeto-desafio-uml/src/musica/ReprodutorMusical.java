package musica;

public class ReprodutorMusical implements Ipod{
    public void tocar(){
        System.out.println("Tocando uma Música");
    }

    public void pausar(){
        System.out.println("Pausando a música.");
    }

    public void selecionarMúsica(){
        System.out.println("Escolhendo uma música.");
    }
}
