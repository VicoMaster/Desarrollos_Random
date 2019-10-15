# coding: utf-8
# import builtins
import math as mate
from math import sqrt as cuadrado
print(__name__)
print(__file__)
print(__doc__)
"""
TABLA DE SIMBOLOS O SymTable:
Se le dice tabla de Simbolos al diccionario creado con todos los nombres de las funciones
y las variables con identado 0 del modulo en ejecución.

Las variables Locales pasan a ser variables Globales cuando se ejecuta una funcion para
posterior mente de su ejecucion ser borradas de memoria.


El modulo builtins en general esta implicito en la tabla de nombres de cada Modulo, ya
que es el modulo Base de las funciones del Lenguaje. Contiene las Funciones mas usadas
en Python.

NOTACION:
nombre_modulo.nombre_atributo_acceder   <- Cualificacion de nombres.
objeto.propiedad
En tabla de simbolos:
modulo.attr
objeto.atributo

FUNCION DIR:
Con esta funcion se obtiene toda la tabla de simbolos del modulo.

"""

# Importando Modulos.
# import builtins  Debe ser al comienzo del Archivo. PEP8
# print(help(builtins))

# Mejorando el Performance del aplicativo con importacion.
# Declarar un objeto con el resultado de la importacion para no buscar constatemente
# en la tabla de simbolos del modulo.

# import math as mate
e = mate.e
pi = mate.pi
print("Constante de Euler %f Y Constante PI: %f" % (e, pi))

# IMPORTACION DE SIMBOLOS
"""
Para importar un solo simbolo:
from modulo import simbolo
Se importa el simbolo del modulo a la tabla actual

Para importar una lista de Simbolos
from modulo import simbolo, simbolo2

Para importar un simbolo cual nombre ya esta siendo usado en nuestra tabla
from modulo import simbolo as M  // Alias

Se puede renombrar los simbolos
from modulo import simb1 as s1, simb2 as s2, simb3 as s3
"""


# from math import sqrt as cuadrado  // Inicio del archivo
print(cuadrado(9))


def func():
    from math import factorial as facto
    print("ESTE ES EL FACTORIAL DE 10:", facto(10))


func()
"""
PARA IMPORTAR TODOS LOS SIMBOLOS DEL MODULO MATH SIN NECESIDAD DE LLAMAR A los atributos del objeto o modulo,
from math import *

Esto no es recomendado por el alto contenido de nuestra tabla de Simbolos o Symtable y posterior uso de recursos
para buscarla.
"""