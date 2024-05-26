package iphone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música...");
    }

    @Override
    public void avancarFaixa() {
        System.out.println("Avançando faixa...");
    }

    @Override
    public void voltarFaixa() {
        System.out.println("Voltando faixa...");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero + "...");
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de " + numero + "...");
    }

    @Override
    public void desligarChamada() {
        System.out.println("Chamada encerrada.");
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando página...");
    }

    @Override
    public void navegarParaFrente() {
        System.out.println("Navegando para frente...");
    }

    @Override
    public void navegarParaTras() {
        System.out.println("Navegando para trás...");
    }

    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        iphone.reproduzirMusica();
        iphone.fazerChamada("123456789");
        iphone.abrirPagina("https://www.google.com");
    }
}