package com.ada.exercicios;

public class Main {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("1234", "Carro");

        Estacionamneto estacionamneto = new Estacionamneto();
        estacionamneto.entrar(veiculo);

        boolean existe = estacionamneto.consultar("1234");

        if (existe){
            System.out.println("O veiculo esta no estacionamento");
        }else{
            System.out.println("O veiculo não esta no estacionamento");
        }


    }


}