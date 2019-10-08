# coding: utf-8
# Uso range
"""
Funcion que fue cambiada en Python 3,
Para la version 2 Python priorizaba las listas, en version 3 Se priorizan los Indices
"""
numeros = range(1, 9)
print(numeros)
numeros = range(9)
print(numeros)
lista_numeros = range(1, 9)
print(list(range(1, 9)))

# range(stop)
# range(start, stop[, step])
pares = list(range(2, 20, 2))
print("Los numeros pares son: ", pares)
print(type(pares))
