import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetRockTest {
    private PetRock rocky = new PetRock("Rocky");

    @Test
    public void getName() throws Exception{
        PetRock rocky = new PetRock("Rocky");
        assertEquals("Rocky", rocky.getName());
    }

    @Test
    public void testUnHappy() throws Exception {
        PetRock rocky = new PetRock("Rocky");
        assertFalse(rocky.isHappy());
    }

    @Test
    public void testHappyAfterPplay() throws Exception {
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }
}