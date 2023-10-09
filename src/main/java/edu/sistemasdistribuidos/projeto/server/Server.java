package edu.sistemasdistribuidos.projeto.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(7000);
            System.out.println("Servidor iniciado...");

            while (true) {
                System.out.println("Esperando uma conexão...");
                Socket client = server.accept();
                System.out.println("Cliente conectado: " + client.getInetAddress());

                InputStreamReader fluxoDados = new InputStreamReader(client.getInputStream());
                BufferedReader dado = new BufferedReader(fluxoDados);

                String linha;
                while (true) {
                    linha = dado.readLine();
                    if (linha == null) {
                        System.out.println("Cliente desconectado.");
                        break;
                    }
                    System.out.println(linha);
                    if (linha.equals("sair")) {
                        break;
                    }
                }

                dado.close();
                fluxoDados.close();
                client.close();
            }
        }
        catch (Exception e) {
            System.out.println("Ocorreu um erro.");
        }
    }
}
