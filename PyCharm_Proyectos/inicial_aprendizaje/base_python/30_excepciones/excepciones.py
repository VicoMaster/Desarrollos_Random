# coding: utf-8
"""
Tratamiento de excepciones
Es tod_o el codigo que identifica errores e implementa una solucion
evitando que la aplicacion sea finalizada

Levantamiento de excepciones
Es toD_o el codigo que al percibir un problema crea una excepcion avisandole
asi al programador

try:
    codigo
except ErrorClass1:
    tratamiento
except ErrorClass2:
    tratamiento

"""

try:
    entero = 0
    entero_2 = 2
    res = entero_2 / entero
    print(res)
except (ZeroDivisionError, TypeError) as error_zero:
    print("NO ES POSIBLE DIVIDIR ENTRE CERO")
    print("INSTANCIA: %s" % error_zero)
    print("INSTANCIA: %s" % error_zero.args)
    print(error_zero)
    print(error_zero.args)
    print(type(error_zero))

eval("print('nada')")

# La instruccion ELSE se ejecutara desde que ninguna excepcion se levante
# Es practica de desarrollo seguro de buena ejecucion

# El bloque FINALLY siempre sera ejecutado, se ejecute o no una excepcion

try:
    pass
except TypeError:
    pass
else:
    pass
finally:
    pass
