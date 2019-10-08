# coding: utf-8
# Ejemplo con Manejo de Errores y Diccionarios para llamar Funciones y Correlacion de Opcion/Operacion
# AndresR.Dev


def pedir_numeros():
    numero_uno = int(input("Digite el Primer Numero: "))
    numero_dos = int(input("Digite el Segundo Numero: "))
    numeros = [numero_uno, numero_dos]
    return numeros


def hacer_suma(numeros):
    respuesta = numeros[0] + numeros[1]
    return respuesta


def hacer_resta(numeros):
    respuesta = numeros[0] - numeros[1]
    return respuesta


def hacer_division(numeros):
    if numeros[1] != 0:
        respuesta = numeros[0] / numeros[1]
    else:
        respuesta = "NO PUEDE DIVIDIR ENTRE 0"
    return respuesta


#  Esto devuelve una Division redondeada a Entero
def hacer_division_compuesta(numeros):
    if numeros[1] != 0:
        respuesta = numeros[0] // numeros[1]
    else:
        respuesta = "NO PUEDE DIVIDIR ENTRE 0"
    return respuesta


def hacer_multi(numeros):
    respuesta = numeros[0] * numeros[1]
    return respuesta


def menu_caluladora():
    finaliza = False
    print("*** Welcome to Calculadora ***")
    while not finaliza:
        print("Seleccione la Operacion: ")
        print("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. División Redondeada\n6. Salir")
        eleccion = input("Digite su Opción: ")
        operaciones = {'1': "suma", '2': "resta", '3': "mult", '4': "div", '5': 'divcom', '6': "salir"}
        try:
            operacion = operaciones[eleccion]
            finaliza = True
        except KeyError:
            print("-- OPCION NO ES VALIDA -- ")
        else:  # Es el Finalize de Java, Donde la ejecucion finaliza correctamente.
            return operacion


def calculadora():
    opcion = menu_caluladora()
    funciones = {
        'suma': hacer_suma,
        'resta': hacer_resta,
        'mult': hacer_multi,
        'div': hacer_division,
        'salir': "exit",
        'divcom': hacer_division_compuesta
    }
    funcion = funciones[opcion]
    if funcion != "exit":
        respuesta = funciones[opcion](pedir_numeros())
        print("El resultado es: ", respuesta)
    return funcion


ejecutar = True
while ejecutar:
    try:
        ejecucion = calculadora()
        if ejecucion != "exit":
            ejecutar = True
        elif ejecucion == "exit":
            ejecutar = False
            print("SELECCIONO SALIR... Hasta pronto.")
        else:
            print("ERROR INESPERADO cod.001")
    except ValueError:
        print("Ingreso un Caracter Invalido, Ingrese Nuevamente...")
    except KeyError:
        print("Opcion no Parametrizada")
        break
    else:
        print("\n")
