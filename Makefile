ifeq ($(OS),Windows_NT)
    GRADLE = .\gradlew.bat
else
	GRADLE := ./gradlew
endif


.PHONY: build
build:
	@echo "[BUILDING] Starting the project build..."
	$(GRADLE) build

test:
	@echo "[TESTING] Running project tests..."
	$(GRADLE) test

clean:
	@echo "[CLEANING] Removing all binaries and build dependencies"
	$(GRADLE) clean
