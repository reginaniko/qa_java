import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParamTest {
    private final int kittensCount;

    public FelineParamTest(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0}")
    public static Object[][] getKittens() {
        return new Object[][]{
                {12},
                {4},
                {0},
                {-1},
        };
    }

    @Test
    public void setKittensCountTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        assertEquals("Количество не совпадает", kittensCount, actual);
    }
}
