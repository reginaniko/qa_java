import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline mockFeline;

    @Test
    public void testGetKittens() throws Exception {
        when(mockFeline.getKittens()).thenReturn(3);
        Lion lion = new Lion("Самка", mockFeline);
        int expectedKittens = 3;
        int actualKittens = lion.getKittens();
        assertEquals(expectedKittens,actualKittens);
    }

    @Test
    public void testDoesHaveMane() throws Exception{
        Lion lion = new Lion("Самец", mockFeline);
        boolean expectedHasMane = true;
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals(expectedHasMane, actualHasMane);
    }
    @Test
    public void testGetFood() throws Exception {

        List<String> expectedFood = Arrays.asList("Животные", "Рыба", "Птицы");
        when(mockFeline.getFood("Хищник")).thenReturn(expectedFood);

        Lion lion = new Lion("Самец", mockFeline);
        List<String> actualFood = lion.getFood();

        assertEquals(expectedFood, actualFood);
    }

    @Test(expected = Exception.class)
    public void exceptionWhenEnteringWrongSexTest() throws Exception {
        String invalidSex = "abc";

        Lion lion = new Lion(invalidSex, mockFeline);
    }
}