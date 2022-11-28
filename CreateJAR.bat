@echo off
mkdir app
jar --create --file=app/DateNightAtTheArcade.jar --main-class=datenightatthearcade.DateNightAtTheArcade -C classes .
pause