# coding: utf-8
# Operaciones
num_0 = 13
num_1 = 4


def hacersuma(num0, num1):
    return num0 + num1


def hacerresta(num0, num1):
    return num0 - num1


def hacerdiv(num0, num1):
    return num0 / num1


def hacermul(num0, num1):
    return num0 * num1


def hacerresiduo(num0,num1):
    return num0 % num1


print("La suma es: ", hacersuma(num_0, num_1))
print("La resta es: ", hacerresta(num_0, num_1))
print("La multiplicación es: ", hacermul(num_0, num_1))
print("La división es: ", hacerdiv(num_0, num_1))
print("La el residuo es :: ", hacerresiduo(num_0, num_1))
print("\nPrelación de Operadores: ")

"""
Prioridad Operadores:
1. Potencia o Radicacion
2. Multiplicación,División,División Sesgada y Módulo
3. Suma y Resta
Si dos operadores de la misma Gerarquia se operan, se sigue la regla de Izquierda a Derecha
"""


def prelacion_multiplicacion():
    ejemplo_mult = 8+2*10
    return ejemplo_mult


print("Prelacion Division: ", prelacion_multiplicacion())

# El doble caracter '//' es usado para redondear el Resultado de una Divisiosn con Decimal hacia abajo


def redondeo_decimal_abajo(num):
    print("Division Normal: ", num_0/num)
    return num_0//num


print("División Redondeada hacia abajo: ", redondeo_decimal_abajo(num_1))
print("Potenciacion: ", 2**5)
