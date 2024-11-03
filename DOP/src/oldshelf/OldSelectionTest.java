package oldshelf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OldSelectionTest {

    @Test
    void testGetAgeOrTitleForComic() {
        Comic comic = new Comic("Spiderverse I", 13);
        String result = OldSelection.getAgeOrTitle(comic);
        assertEquals("Spiderverse I", result, "Should return the title of the Comic");
    }
    @Test
    void testGetAgeOrTitleForNonBook() {
        game gameInstance = new game();
        String result = OldSelection.getAgeOrTitle(gameInstance);
        assertEquals(" ", result, "Should return an empty string for a non-Book object");
    }
}
