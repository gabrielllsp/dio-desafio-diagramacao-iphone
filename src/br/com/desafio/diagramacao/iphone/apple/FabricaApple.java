package br.com.desafio.diagramacao.iphone.apple;

import br.com.desafio.diagramacao.iphone.Iphone;
import br.com.desafio.diagramacao.iphone.computador.Computador;

import java.util.Scanner;

public class FabricaApple {
    public static void main(String[] args) {
        Iphone ph = new Iphone();
        Scanner entrada = new Scanner(System.in);
        int senha2= 123456;

        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);


        System.out.println("Digite a senha para desbloquear");
        int senha = entrada.nextInt();

        if(senha != senha2){
            System.out.println("Senha Invalida");
        }else{
            System.out.println("Menu de Selecao");
            System.out.println("Telefone");
            ph.ligar();
            System.out.println("Ipod");
            ph.selecionarMusica();
            System.out.println("Internet");
            ph.exibirPagina();
        }


    }
}
