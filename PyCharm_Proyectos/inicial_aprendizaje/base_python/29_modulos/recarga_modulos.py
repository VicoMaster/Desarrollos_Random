# coding: utf-8
# Recarga de Modulos
import importlib
import modulos_symbtable1 as impmod
from pprint import pprint

"""
Eliminar elementos de la tabla de simbolos del(simbolo)
para ambitos globales
"""

del impmod.ab
impmod.aa = "NUEVO VALOR"
importlib.reload(impmod)

pprint(impmod.__dict__)  # retorna la tabla de simbolos
# El modulo fue recargado con todos sus simbolos determinados
