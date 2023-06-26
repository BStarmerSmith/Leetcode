#!/bin/bash

# Compile the Java source files
javac -d bin src/*.java src/easy/*.java src/medium/*.java

# Check if the compilation was successful
if [[ $? -eq 0 ]]; then
    echo "Compilation successful."
    
    # Run the program
    java -cp bin JavaLeetcode.src.Main
else
    echo "Compilation failed. Please fix the errors before running the program."
fi
