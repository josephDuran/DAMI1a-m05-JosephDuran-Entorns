import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

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