import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mockStatic;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Lesson10B3Test {

	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
	private LocalDateTime expectedReturnDateTime = LocalDateTime.of(2024,02,02,22,22,22);
	
	  @BeforeAll
	  void setup() {
	    System.setOut(new PrintStream(outputContent));
	  }
	  
	  @AfterAll
	  void teardown() {
	    System.setOut(standardOut);
	  }
	@Test
	void test() {
		// Lesson10B3 lesson10b3 = new Lesson10B3();
		try(MockedStatic<LocalDateTime> mocked = mockStatic(LocalDateTime.class, Mockito.CALLS_REAL_METHODS)) {
			mocked.when(LocalDateTime::now).thenReturn(expectedReturnDateTime);			
			Lesson10B3.main(null);			
			assertEquals("2024年2月2日(金)22時22分22秒", outputContent.toString().trim());
		} 
	}

}
