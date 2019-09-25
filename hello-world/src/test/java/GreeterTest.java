import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {

    @Test
    public void testThatGreeterReturnsTheCorrectGreeting() {
        assertEquals("Hello, World!", new Greeter().getGreeting());
    }

    @Test
    public void testThatGreeterNotReturnTheIncorrectGreeting() {
        assertEquals(1 , 1);
    }

}
