package com.fatec;

import com.fatec.Numerics;
import java.io.ByteArrayInputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class NumericsTest {
    Numerics num = new Numerics();
    @ParameterizedTest(name = "Teste de para verificar a integridade de um Fatorial")
    @CsvSource({
        "5, 120",                 // Iteração 1: teste de confirmação pra acerto
        "4, 25",                  // Iteração 2: teste de confirmação pra erro
    })
    void testValidacaoFatorial(int numeroBase, int fatorialEsperado){
        int fatorial = num.validacaoNumFatorial(numeroBase);
        assertEquals(fatorialEsperado, fatorial);
    }
    @ParameterizedTest(name = "Teste de para verificar a integridade de uma String")
    @CsvSource({
        "5, 25",                  // Iteração 1: teste de confirmação pra acerto
        "4, 16",                  // Iteração 2: teste de confirmação pra erro
    })
    void testValidacaoPotencia(int numeroBase, int potenciaEsperada){
        int potencia = num.validacaoPotencia(numeroBase);
        assertEquals(potenciaEsperada, potencia);
    }
    
}

