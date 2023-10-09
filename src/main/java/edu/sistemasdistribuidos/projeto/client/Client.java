package edu.sistemasdistribuidos.projeto.client;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            //Declarando o socket cliente
            Socket client = new Socket("127.0.0.1", 7000);

            //Fluxo de dados para envio
            PrintStream ps = new PrintStream(client.getOutputStream());
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("Digite algo: ");
                String conteudo = sc.nextLine();
                if (conteudo.toLowerCase().equals("sair"))
                    break;
                ps.println(conteudo);
            }
            client.close();
        }
        catch (Exception e) {
            System.out.println("Ocorreu um erro durante a conexão.");
        }

    }
}
