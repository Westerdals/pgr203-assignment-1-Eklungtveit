package no.kristiania.roman;

public class RomanConverterTest {
    @Test
    void schouldReturnIfor1(){
        assertEquals("I", toRoman(1));
    }
}
