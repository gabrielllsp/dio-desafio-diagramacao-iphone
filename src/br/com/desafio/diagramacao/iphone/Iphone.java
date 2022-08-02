package br.com.desafio.diagramacao.iphone;

import br.com.desafio.diagramacao.iphone.computador.NavegadorInternet;
import br.com.desafio.diagramacao.iphone.ipod.ReprodutorMusica;
import br.com.desafio.diagramacao.iphone.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusica, NavegadorInternet, AparelhoTelefonico {


    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina no navegador do Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova pagina pelo navegador do iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina pelo navegador do iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica pela função musica do iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica pela função musica do iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica pela funcao musica do iphone");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando pelo iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo pelo iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz pelo iphone");
    }


}
