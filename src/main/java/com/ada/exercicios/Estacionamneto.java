package com.ada.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Estacionamneto {

    private List<Veiculo> veiculos;

    public Estacionamneto(){
        veiculos = new ArrayList<>();
    }

    public void entrar (Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public Veiculo sair(String placa){
        Veiculo veiculoASair = null;
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getPlaca().equals(placa)){
                veiculoASair = veiculo;
                break;
            }
        }
        veiculos.remove(veiculoASair);
        return veiculoASair;
    }
    public boolean consultar(String placa){
        for (Veiculo veiculo : veiculos){
            if (veiculo.getPlaca().equals(placa)){
                return true;
            }
        }
        return false;
    }

}
