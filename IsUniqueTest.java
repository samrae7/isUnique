import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsUniqueTest {
    @Test
    public void shouldReturnFalseForNonUniqueString() {
//        IsUnique isUnique = new IsUnique();
        boolean result = IsUnique.isUnique("xxxyyy");
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueForNonUniqueString() {
//        IsUnique isUnique = new IsUnique();
        boolean result = IsUnique.isUnique("acetujh");
        assertTrue(result);
    }
}