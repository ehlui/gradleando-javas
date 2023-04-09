package com.gradleando01.practise.app;

import com.gradleando01.practise.shared.ResourceTextFiles;
import com.gradleando01.practise.shared.ResourceTextFilesReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FileMultilanguageGreeterTest {

    private static FileMultilanguageGreeter greeter;

    @BeforeAll
    public static void init() {
        final ResourceTextFiles resourceTextFiles = new ResourceTextFilesReader();
        greeter = new FileMultilanguageGreeter(resourceTextFiles);
    }

    @Test
    void should_return_hello_string_from_file_when_passing_en_string_as_param() {
        final String greet = greeter.greet("en");
        Assertions.assertEquals(greet, "Hello!");
    }

    @Test
    void should_return_hola_string_from_file_when_passing_es_string_as_param() {
        final String greet = greeter.greet("es");
        Assertions.assertEquals(greet, "Hola!");
    }

    @Test
    void should_throw_assert_exception_when_not_found_language_initials_file_at_resources() {
        Assertions.assertThrows(
                AssertionError.class,
                () -> greeter.greet("ru"));
    }

    @Test
    void should_throw_asserts_exception_when_empty_string_passed() {
        Assertions.assertThrows(
                AssertionError.class,
                () -> greeter.greet(""));
    }

    @Test
    void should_throw_asserts_exception_when_null_passed() {
        Assertions.assertThrows(
                AssertionError.class,
                () -> greeter.greet(null));
    }
}
