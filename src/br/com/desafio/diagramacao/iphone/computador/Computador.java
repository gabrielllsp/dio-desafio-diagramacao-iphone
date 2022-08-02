package br.com.desafio.diagramacao.iphone.computador;

public class Computador implements NavegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a wagina da web.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova pagina da web.");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina da web.");

    }
}
