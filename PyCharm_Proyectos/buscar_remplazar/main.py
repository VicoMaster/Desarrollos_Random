# coding: utf-8
"""
__author__ = "Andres Rivera Lozano"
Script para banco BBVA remplaza los mensajes de texto de applet para nueva funcionalidad JS
Quita los wait bajo cada SHOWMESSAGE
Para su ejecucion llamar el script con la ruta especifica de los archivos a buscar
"""
from os import listdir
from os.path import isfile, join
import sys

try:
    if len(sys.argv) == 2:

        def ls(ruta_d=sys.argv[1]):
            ruta_f = ruta_d
            return [arch for arch in listdir(ruta_f) if isfile(join(ruta_f, arch))]


        for archiv in ls():
            ruta = sys.argv[1] + archiv

            archivo = open(ruta, 'r+', encoding='utf-8')

            archivo_legible = ""
            contador_message = False
            for linea in archivo.readlines():
                busqueda = "showmessage"
                busqueda_dos = "wait"
                pos = linea.lower().find(busqueda)
                pos_wait = -1  # Solo se define para no entrar en su eliminacion
                if contador_message:
                    # Solo eliminara el wait del script si antes ha eliminado un ShowMessage
                    pos_wait = linea.lower().find(busqueda_dos)
                if pos != -1:
                    contador_message = True
                    # remplaza el ShowMessage
                    cadena_uno = linea[:pos]
                    org_pos = pos
                    pos += len(busqueda)
                    cadena_dos = linea[pos:]
                    reformado = cadena_uno + "SET &MESSAGE" + cadena_dos + '{}run "alert.scl"\n'.format('\t' * org_pos)
                    archivo_legible += reformado
                elif pos_wait != -1:
                    # remplaza el Wait
                    archivo_legible += ""
                    contador_message = False
                else:
                    archivo_legible += linea
            archivo.seek(0)
            archivo.write(archivo_legible)
            archivo.close()

    else:
        print("PARAMETROS ACEPTADOS: 1")
        print("Solo ingrese la ruta especifica del directorio a Examinar Ejemplo: C:\\Users\\master\\Desktop")
except (FileNotFoundError, FileExistsError, SystemError, OverflowError, ValueError):
    print("OCURRIO UN ERROR INESPERADO... Asegurese de ingresar doble \\ para Rutas")
    print("Para rutas encerrar con '' y terminar con \\")
