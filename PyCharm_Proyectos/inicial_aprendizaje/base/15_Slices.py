# coding: utf-8
# Rebanadas Slices
numeros = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
seleccion = numeros[0:6]  # El punto de llegada es Exclusivo.
print(seleccion)
seleccion = numeros[6:]
print(seleccion)
seleccion = numeros[:7]
print(seleccion)
seleccion = numeros[-5:-2]
print(seleccion)
seleccion = numeros[1:-1:2]  # Steps, con Pasos
print(seleccion)
seleccion = numeros[::-1]  # Pasos Invertidos
print(seleccion)
seleccion = numeros[-2:-5:-1]
print(seleccion)
# Eliminamos una Parte de la lista
del numeros[-2:-6:-1]
print(numeros)
# Recuponemos esa misma parte de la Lista
numeros[4:5] = [5, 6, 7, 8]
print(numeros)

palabra = "Esta es palabra"
lista = palabra.split(" ")
print(lista)
lista = lista[0]+" "+lista[2]
print(lista)

"""
 0 1 2 3 4 5
 P Y T H O N
-6-5-4-3-2-1

lista[x:y:z]
x = Start y= stop z = step
"""
