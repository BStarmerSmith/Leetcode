#!/bin/bash

# Create the bin folder if it doesn't exist
mkdir -p bin

# Build the C++ files in src/easy
for file in src/easy/*.cpp; do
    filename=$(basename "$file")
    filename_without_extension="${filename%.*}"
    output_file="bin/${filename_without_extension}"
    g++ "$file" -o "$output_file"
done

# Build the C++ files in src/medium
for file in src/medium/*.cpp; do
    filename=$(basename "$file")
    filename_without_extension="${filename%.*}"
    output_file="bin/${filename_without_extension}"
    g++ "$file" -o "$output_file"
done

# Run all the executables in the bin folder
for executable in bin/*; do
    ./"$executable"
done