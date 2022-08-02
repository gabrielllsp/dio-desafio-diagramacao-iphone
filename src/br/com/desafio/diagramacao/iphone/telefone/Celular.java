package br.com.desafio.diagramacao.iphone.telefone;

public class Celular implements AparelhoTelefonico{
    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atender Chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
