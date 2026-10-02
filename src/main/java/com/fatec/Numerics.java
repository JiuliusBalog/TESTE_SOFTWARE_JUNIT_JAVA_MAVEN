package com.fatec;

public class Numerics {
    public int validacaoNumFatorial(int numeroBase){
        
        if (numeroBase <= 1) {
            return 1;
        }
        
        int resultado = 1;
        for (int i = 1; i <= numeroBase; i++) {
            resultado = resultado * i;
        }
        
        return resultado;
    }
    public int validacaoPotencia(int numeroBase){
        int resultado = numeroBase * numeroBase;
        return resultado;
    }
}
