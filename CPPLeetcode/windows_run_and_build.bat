@echo off

REM Enable delayed variable expansion
setlocal enabledelayedexpansion

REM Create the bin folder if it doesn't exist
mkdir bin

REM Build the C++ files in src/easy
for %%F in (src\easy\*.cpp) do (
    set "filename=%%~nF"
    gcc "%%F" -o "bin\!filename!.exe" -lstdc++
)

REM Build the C++ files in src/medium
for %%F in (src\medium\*.cpp) do (
    set "filename=%%~nF"
    gcc "%%F" -o "bin\!filename!.exe" -lstdc++
)

REM Set the current directory to the bin folder
cd bin

REM Run all the executables in the bin folder
for %%F in (*.exe) do (
    set "filename=%%~nF"
    call !filename!.exe
)

cd ..