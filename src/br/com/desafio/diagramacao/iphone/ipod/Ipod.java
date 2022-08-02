package br.com.desafio.diagramacao.iphone.ipod;

public class Ipod implements ReprodutorMusica {
    @Override
    public void tocar() {
        System.out.println("Tocar musica.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");

    }
}
