import lesson4.AreaOfATriangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TriangleTest {
    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);
    @BeforeAll
    static void beforeAll(){
        logger.info("INFO");
        logger.debug("DEBUG");
        logger.error("ERROR");
    }
    @Test
    @DisplayName("Позитивная проверка на возможность существования трегуольника с данными сторонами")
    void isTrianglePositiveTest() {
        Assertions.assertTrue(AreaOfATriangle.isTriangle(7, 9, 11));
    }

    @Test
    @DisplayName("Негативная проверка на возможность существования трегуольника с данными сторонами")
    void isTriangleNegativeTest() {
        Assertions.assertFalse(AreaOfATriangle.isTriangle(10, 20, 30));

    }
}
