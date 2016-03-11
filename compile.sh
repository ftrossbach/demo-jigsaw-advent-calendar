#!/bin/bash

echo " > creating clean directories"
rm -r classes
mkdir classes
rm -r mods
mkdir mods

echo " > compiling all modules at once"

$JIGSAW_BIN/javac \
	-d src \
	-modulesourcepath src \
	$(find . -name "*.java")


