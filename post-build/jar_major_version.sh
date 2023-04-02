#!/bin/sh

if [ $# -eq 0 ]
  then
    exit
fi


GRADLE_MAIN_BUILD_PATH="build/classes/java/main"
JAR_NAME=$1
GROUP_PATH=$2
MAIN_PATH_FILE="$GRADLE_MAIN_BUILD_PATH$BYTECODE_CLASSES_PATH/$GROUP_PATH".class

# The javap command disassembles a class file.
# The javap command displays information about the fields, constructors and methods present in a class file.
MAJOR_VERSION_JAR=$(javap -v "$MAIN_PATH_FILE" | grep major | xargs)

echo "----------------------------------------------------------------"
echo "$JAR_NAME has $MAJOR_VERSION_JAR"
echo "----------------------------------------------------------------"
