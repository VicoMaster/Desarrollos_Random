# coding: utf-8
# Modulo Main para ejemplo creacion de modulos
from modulos_symbtable1 import *
# Importacion de Simbolos Privados
from modulos_symbtable1 import _nombre
from pprint import pprint
print("INICIA MODULO MAIN: ")
funcion_modular("Estos seran", "Los argumentos")
print("FINALIZA MODULO MAIN: ")

print(_nombre)
print("**************************")
pprint(globals())
