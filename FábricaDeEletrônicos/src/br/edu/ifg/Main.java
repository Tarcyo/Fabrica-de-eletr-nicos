/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg;

import java.util.Random;

/**
 *
 * @author Tarcyo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();

        // Endereços aleatórios como exemplos:
        String[] enderecos = new String[]
        {
            "Rua São Paulo, 123 - Belo Horizonte/MG", "Avenida Paulista, 1000 - São Paulo/SP", "Praça da Sé, s/n - Salvador/BA", "Rua da Consolação, 345 - Rio de Janeiro/RJ", "Rua Augusta, 555 - Curitiba/PR"
        };

        int marca = r.nextInt(2);

        //Criando a fabrica:
        FabricaDeEletronicosGenerica fabrica = retornaFabrica(marca, enderecos[r.nextInt(enderecos.length - 1)], 16, 5);

        // Vetores com informações aleatórias apenas para exemplos:
        String[][] modelos = new String[3][];
        modelos[0] = new String[]
        {
            "iPhone", "Samsung Galaxy", "Motorola Moto G"
        };
        modelos[1] = new String[]
        {
            "Macbook Pro", "Dell XPS", "Lenovo ThinkPad"
        };
        modelos[2] = new String[]
        {
            "Apple Watch", "Samsung Galaxy Watch", "Fitbit Versa"
        };
        String[][] placasDeVideo = new String[2][];
        placasDeVideo[0] = new String[]
        {
            "NVIDIA GeForce RTX 3090", "AMD Radeon RX 6800 XT", "NVIDIA GeForce GTX 1660"
        };
        placasDeVideo[1] = new String[]
        {
            "AMD Radeon Pro 5500M", "AMD Radeon Pro 560X", "Intel Iris Plus Graphics"
        };
        String[] pulseiras = new String[]
        {
            "Aço inoxidável", "Couro", "Silicone", "Nylon", "Tecido", "Borracha"
        };

        //Criando produtos na fábrica:
        fabrica.criaLoteCelular(modelos[0][marca], r.nextFloat(), r.nextFloat() + "", r.nextFloat(), r.nextFloat(), r.nextFloat(), r.nextFloat());
        fabrica.criaLoteNotebook(modelos[1][marca], r.nextBoolean(), r.nextDouble(), r.nextDouble(), placasDeVideo[1][r.nextInt(3)], r.nextDouble(), placasDeVideo[0][r.nextInt(3)], r.nextBoolean());
        TipoCargaRelogio tc = TipoCargaRelogio.PILHA;
        if (r.nextInt(1) == 0)
        {
            tc = TipoCargaRelogio.BATERIA;
        }
        fabrica.criaLoteRelogio(r.nextDouble(), r.nextDouble(), modelos[2][marca], pulseiras[r.nextInt(pulseiras.length)], tc);

        //Mostrando exemplos de testes com os produtos: 
        System.out.println("VERIFICANDO O ESTOQUE DA FABRICA:\n" + fabrica.mostraEstoque().supervisionaEstoque());
        System.out.println("TESTANDO OS PRODUTOS FABRICADOS NA FÁBRICA:\n(Se executarmos o código várias vezes o resultado será diferente):\n");
        fabrica.mostraEstoque().getCelularesDepositados().get(0).testa();
        fabrica.mostraEstoque().getNotebooksDepositados().get(0).testa();
        fabrica.mostraEstoque().getRelogioDepositados().get(0).testa();
    }

    //  Definido aleatoriamente a marca da fabrica:
    public static FabricaDeEletronicosGenerica retornaFabrica(int marca, String endereco, int capacidade, int metaProducao) {
        FabricaDeEletronicosGenerica fabrica = null;
        if (marca == 0)
        {
            fabrica = new FabricaDaApple(endereco, metaProducao, capacidade);
        }
        if (marca == 1)
        {
            fabrica = new FabricaDaSamsung(endereco, metaProducao, capacidade);
        }
        return fabrica;

    }
}
