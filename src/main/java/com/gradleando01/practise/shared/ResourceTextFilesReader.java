package com.gradleando01.practise.shared;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ResourceTextFilesReader implements ResourceTextFiles {

    @Override
    public String read(final String fileName) {
        final String file = fileName + FILE_EXTENSION;
        InputStream resourceStream = getClass().getClassLoader().getResourceAsStream(file);

        assert resourceStream != null;

        try (final InputStreamReader inputStreamReader = new InputStreamReader(resourceStream, StandardCharsets.UTF_8)) {
            final BufferedReader bufferedInputStream = new BufferedReader(inputStreamReader);
            return bufferedInputStream.readLine();
        } catch (IOException e) {
            return null;
        }
    }


}
