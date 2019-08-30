@echo off
rmdir /S  /Q "C:\ProgramasEscritos\Proyectos Eclipse\javaPOO\src\cmdComandos\prueba Movimiento\Dentro dentro\full full"
echo CARPETA ANTIGUA ELIMINADA
cd C:\ProgramasEscritos\Proyectos Eclipse\javaPOO\src\cmdComandos\prueba Movimiento\
xcopy "full full\*" "C:\ProgramasEscritos\Proyectos Eclipse\javaPOO\src\cmdComandos\prueba Movimiento\Dentro dentro\full full"/e /i
echo FICHERO REMPLAZADO
exit
