import com.example.Animal;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {


    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> actualFood = feline.eatMeat();
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), actualFood);
    }

    @Test
    public void testGetKittens(){
        Feline feline = new Feline();
        int actualKittens = feline.getKittens();
        assertEquals(1, actualKittens);
    }

    @Test
    public void testGetKittensWithCount(){
        Feline feline = new Feline();
        int expectedKittens = 3;
        int actualKittens = feline.getKittens(3);
        assertEquals(expectedKittens,actualKittens);
    }

    @Test
    public void testGetFamily(){
        Feline feline = new Feline();
        String actualFamily = feline.getFamily();
        assertEquals("Кошачьи", actualFamily);
    }
}