package Celular;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Tocando a música mt top");
    }

    @Override
    public void pausar() {
        System.out.println("A musica top pausou");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para seu parente");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo seu parente");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Sei lá oq é correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo todas as Abas do seu Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma aba a seu Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página do seu telefone");
    }
}
