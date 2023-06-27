@echo off

REM Compile the Java source files
javac -d bin src\*.java src\easy\*.java src\medium\*.java src/hard/*.java

REM Check if the compilation was successful
if %errorlevel% equ 0 (
    echo Compilation successful.
    
    REM Run the program
    java -ea -cp bin JavaLeetcode.src.Main
) else (
    echo Compilation failed. Please fix the errors before running the program.
)

REM Pause at the end to keep the command prompt window open
pause
