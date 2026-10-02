package com.fatec;
import com.fatec.Strings;
import java.io.ByteArrayInputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class StringTest {
    Strings str = new Strings();
    @ParameterizedTest(name = "Teste de para verificar o tamanho correto de uma determinada String")
    @CsvSource({
        "banana, 6",    // Iteração 1: teste de confirmação pra acerto
        "a, 1"          // Iteração 2: teste de confirmação pra erro 
    })
    void testValidacaoTamanhoString(String palavra, int tamanhoPalavra){
        int tamanhoEsperado = str.validacaoTamanhoString(palavra, tamanhoPalavra);
        assertEquals(tamanhoEsperado, tamanhoPalavra);
    }
    @ParameterizedTest(name = "Teste de para verificar a integridade de uma String")
    @CsvSource({
        "banana, banana",                    // Iteração 1: teste de confirmação pra acerto
        "iogurte, iorgute",                  // Iteração 2: teste de confirmação pra erro
        "ossos do ofício, ossos do oficio",  // Iteração 3: teste de diferenças de letras com acento
        "Lata, lata"                         // Iteração 4: teste de diferenças entre upper e lower case
    })
    void validacaoIntegridadeString(String palavra, String resultadoEsperado) {
        palavra = str.validacaoIntegridadeString(palavra);
        assertEquals(resultadoEsperado, palavra);
    }
}
