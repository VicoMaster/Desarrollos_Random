# coding: utf-8
# Uso de la Palabra reservada IN

Palabras = "abcdfghijklmnñsopqrstuvwxyz"
if "e" in Palabras:
    print("La letra 'E' esta dentro del listado")
else:
    print("Ohh, Lo siento su letra no esta...")

if '1' not in Palabras:
    print("No ingreso Ninguna Vocal")

lista_palabras = list(Palabras)
if 'c' in lista_palabras:
    print("Su letra esta en la Lista")

a, b, c = 10, 25, 66
x = int(input("DIGITE UN NUMERO: "))

try:
    print(x in a)
except TypeError as inst:
    print("OCURRIO UN ERROR INESPERADO 001 "+str(inst.args))
