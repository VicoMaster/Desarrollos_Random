# coding: utf-8
# Ejemplo con Manejo de Errores
"""
try:
    pass
except:
    pass
else:
    pass
finally:
    pass

"""
def pedir_numeros():
    numero_uno = int(input("Digite el Primer Numero: "))
    numero_dos = int(input("Digite el Segundo Numero: "))
    numeros = [numero_uno, numero_dos]
    return numeros


def hacer_suma(numeros):
    respuesta = numeros[0] + numeros[1]
    return respuesta


def calculadora():
    respuesta = hacer_suma(pedir_numeros())
    print("La suma de los Numeros es: ", respuesta)


ejecutar = True
while ejecutar:
    try:
        calculadora()
        ejecutar = False
    except ValueError:
        print("Ingreso un Caracter Invalido, Ingrese Nuevamente...")
    else:
        print("*** Finalizo ***")


a, b, c = 10, 25, 66
x = int(input("DIGITE UN NUMERO: "))

try:
    print(x in a)
except TypeError as inst:
    print("OCURRIO UN ERROR INESPERADO 001 "+str(inst.args))

# ...    raise Exception('carne', 'huevos')
# ... except Exception as inst:
# ...    print(type(inst))    # la instancia de excepción
# ...    print(inst.args)     # argumentos guardados en .args
# ...    print(inst)          # __str__ permite imprimir args directamente,
# ...                         # pero puede ser cambiado en subclases de la exc
# ...    x, y = inst          # desempacar argumentos


try:
    raise Exception("UYyy pero que jesto!!!")
except Exception as error:
    print("OCURRIO UN ERROR ESPERADO: "+str(error.args))
