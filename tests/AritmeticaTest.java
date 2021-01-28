import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AritmeticaTest {
    private Aritmetica aritmetica;

    @Test
    public void testSuma() {
        aritmetica = new Aritmetica();
        assertEquals(2, aritmetica.suma(1, 1));

        System.out.println(aritmetica);
    }
    @Test
    public void testResta() {
        aritmetica = new Aritmetica();
        assertEquals(3, aritmetica.resta(4, 1));
    }


}