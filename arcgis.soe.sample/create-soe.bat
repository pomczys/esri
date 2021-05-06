@echo off
SET CURRENT_DIR=%~dp0

SET JAR_PATH=%CURRENT_DIR%target\arcgis.soe.sample.jar
SET LIB_PATH=%CURRENT_DIR%target\lib
SET OUT_PATH=%CURRENT_DIR%target\soe
SET SOEPACKAGER_PATH=%AGSDEVKITJAVA%java\tools\soepackager

echo %SOEPACKAGER_PATH%

if "%JAVA_HOME%" == "" (echo JAVA_HOME environment variable is required! & exit /b)  
if "%AGSDEVKITJAVA%" == "" (echo AGSDEVKITJAVA environment variable is required! & exit /b)  

mkdir %OUT_PATH%
echo "soepackager - START"
cd %SOEPACKAGER_PATH%
call soepackager.bat -p "%JAR_PATH%" -l "%LIB_PATH%" -o "%OUT_PATH%" -j "%JAVA_HOME%" 
echo "soepackager - STOP"

