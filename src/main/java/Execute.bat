title Client Batch
echo off
goto start
:start
cls
java -Xmx1000m Jframe 10 0 highmem members 32
pause
goto start