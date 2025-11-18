package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void greetReturnsHelloName() {
        assertEquals("Hello, Akhil!", App.greet("Akhil"));
    }

    @Test
    public void greetNullReturnsHelloWorld() {
        assertEquals("Hello, World!", App.greet(null));
    }
}
