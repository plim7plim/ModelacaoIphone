package Celular;

public class MeuIphone {
    public static void main(String[] args) {


        Iphone meuIphone = new Iphone();

        meuIphone.selecionarMusica("Musica mt top");
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("https://www.youtube.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}