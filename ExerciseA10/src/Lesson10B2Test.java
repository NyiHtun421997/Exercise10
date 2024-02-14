import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Lesson10B2Test {

  private final InputStream inputStream = System.in;
  private final PrintStream standardOut = System.out;
  private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
  
  @BeforeAll
  void setup() {
    String input = "あいうえお";
    System.setIn(new ByteArrayInputStream(input.getBytes()));
    System.setOut(new PrintStream(outputContent));
  }
  
  @AfterAll
  void teardown() {
    System.setIn(inputStream);
    System.setOut(standardOut);
  }
  
  @Test
  void test() {
    Lesson10B2.main(null);
  }

}
