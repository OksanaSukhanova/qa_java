import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensEqualsOne() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedCount = 1;
        int actualCount = lion.getKittens();
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void getFoodReturnsPredatorMeal() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedMeal = List.of("Животные", "Птицы", "Рыба");
        List<String> actualMeal = lion.getFood();
        assertEquals(expectedMeal, actualMeal);
    }

    @Test
    public void randomSexThrowsException() {
        Exception thrown = assertThrows(Exception.class, () -> {
            Lion lion = new Lion("random", feline);
        });
        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        String actualMessage = thrown.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}
