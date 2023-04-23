package com.gradleando01.practise.app;

import com.gradleando01.practise.shared.ResourceTextFiles;

final public class FileMultilanguageGreeter {

    final private ResourceTextFiles resourceTextFiles;

    public FileMultilanguageGreeter(ResourceTextFiles resourceTextFiles) {
        this.resourceTextFiles = resourceTextFiles;
    }

    public String greet(final String language) {
        return resourceTextFiles.read(language);
    }
}
