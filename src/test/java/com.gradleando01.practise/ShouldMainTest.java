package com.gradleando01.practise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ShouldMainTest {

    @Test
    public void should_say_hello() throws IOException {
        Assertions.assertEquals(Main.sayHello("en"), "Hello!");
    }

    @Test
    public void should_say_hola() throws IOException {
        Assertions.assertEquals(Main.sayHello("es"), "Hola!");
    }

    @Test
    public void should_raise_exception_when_passing_empty_string() {
        Assertions.assertThrows(AssertionError.class, () -> Main.sayHello(""));
    }
}
