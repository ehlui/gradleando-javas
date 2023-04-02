#!/bin/sh

if [ $# -eq 0 ]
  then
    exit
fi


GRADLE_MAIN_BUILD_PATH="build/classes/java/main"
JAR_NAME=$1
GROUP_PATH=$2
MAIN_PATH="$GRADLE_MAIN_BUILD_PATH/$BYTECODE_CLASSES_PATH/$GROUP_PATH"

#  The hexdump utility is a filter which displays the specified
#       files, or standard input if no files are specified, in a
#       user-specified format.
# Using xargs for trimming spaces ...
MAJOR_VERSION_JAR=$( hexdump -s 7 -n 1 -e '"%d"' "$MAIN_PATH".class | xargs)

echo "----------------------------------------------------------------"
echo "$JAR_NAME has major version $MAJOR_VERSION_JAR"
echo "----------------------------------------------------------------"
