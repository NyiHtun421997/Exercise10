import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Lesson10B1Test {

  private Lesson10B1 lesson10b1;
  private final PrintStream standardOut = System.out;
  private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();

  @BeforeAll
  void setup() {
    lesson10b1 = new Lesson10B1();
    System.setOut(new PrintStream(outputContent));
  }

  @AfterAll
  void teardown() {
    System.setOut(standardOut);
  }

  @Test
  void itShouldBeEqualTo33And15DecimalPlaces() {

    double result = lesson10b1.divideBy3(100);
    Assertions.assertEquals(33.333333333333336, result);
  }

  @Test
  void itShouldBeEqualTo33Exactly() {
    double result = lesson10b1.divideBy3AndRound(100);
    Assertions.assertEquals(33, result);
  }

  @Test
  void itShouldBeEqualTo8And15DecimalPlaces() {
    double result = lesson10b1.divideBy9(77);
    Assertions.assertEquals(8.555555555555555, result);
  }

  @Test
  void itShouldBeEqualTo9Exactly() {
    double result = lesson10b1.divideBy9AndRound(77);
    Assertions.assertEquals(9, result);
  }

  @Test
  void doesMainDisplayProperText() {
    Lesson10B1.main(null);
    Assertions.assertEquals("四捨五入前：100÷3=33.333333333333336\n"
                + "四捨五入後：100÷3=33\n"
                + "四捨五入前：77÷9=8.555555555555555\n"
                + "四捨五入後：77÷9=9", outputContent.toString().trim());
  }
}
