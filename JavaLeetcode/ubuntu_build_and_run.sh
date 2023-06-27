#!/bin/bash

# Compile the Java source files
javac -d bin src/*.java src/easy/*.java src/medium/*.java src/hard/*.java

# Check if the compilation was successful
if [[ $? -eq 0 ]]; then
    echo "Compilation successful."
    
    # Run the program (assertions enabled -ea) (classpath -cp)
    java -ea -cp bin JavaLeetcode.src.Main
else
    echo "Compilation failed. Please fix the errors before running the program."
fi
