# Ejemplo con Manejo de Errores
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
