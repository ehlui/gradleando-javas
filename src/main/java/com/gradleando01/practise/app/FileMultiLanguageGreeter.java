package com.gradleando01.practise.app;

import com.gradleando01.practise.shared.ResourceTextFiles;

public final class FileMultiLanguageGreeter {

  private final ResourceTextFiles resourceTextFiles;

  public FileMultiLanguageGreeter(ResourceTextFiles resourceTextFiles) {
    this.resourceTextFiles = resourceTextFiles;
  }

  public String greet(final String language) {
    return resourceTextFiles.read(language);
  }
}
