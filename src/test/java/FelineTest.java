import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    @Test
    public void eatMeatReturnsPredatorMeal() throws Exception {
        Feline feline = new Feline();
        List<String> expectedMeal = List.of("Животные", "Птицы", "Рыба");
        List<String> actualMeal = feline.eatMeat();
        assertEquals(expectedMeal, actualMeal);
    }

    @Test
    public void getFamilyReturnsFeline() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensWithoutParametersReturnsCorrectCount() {
        Feline feline = new Feline();
        int expectedCount = 1;
        int actualCount = feline.getKittens();
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void getKittensWithParameterReturnsCorrectCount() {
        Feline feline = new Feline();
        int expectedCount = 5;
        int actualCount = feline.getKittens(5);
        assertEquals(expectedCount, actualCount);
    }
}
