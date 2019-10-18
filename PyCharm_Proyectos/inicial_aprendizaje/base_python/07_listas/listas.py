# coding: utf-8
# Uso de Listas
lista = [1, 2, 3, 4, 5]
lista_2 = ["Hola", 3, 0.5, True]
print("Lista #1: ", lista)
lista.append(6)
print("Lista #1 Again : ", lista)
lista.append([7, 8, "hola", False])
print("Lista #1 Again Ultima vez : ", lista)
print("Lista #2: ", lista_2)
print("Dato:", type(lista_2[2]))
print("Dato:", type(lista_2[3]))
print("Tamaño:", len(lista_2))
print("Imprime Lista dentro de Lista: ", lista[6])
print("Imprime item de la lista dentro de la lista: ", lista[6][2])
lista_3 = [1, 2, 3, 4]
lista_3 += [5, 6]
print("Esta es la Lista3: ", lista_3)
lista_3.extend(["mas", "datos", 7, 8])
print("Lista llenada con mas Datos: ", lista_3)
lista_2.clear()
print(lista_2)

"""
pop() : Eliminar el último elemento de la lista,Retorna: el elemento eliminado.
pop(indice):  Eliminar un elemento por su índice,Retorna: el elemento eliminado.
remove("valor"): Eliminar un elemento por su valor

"""
nombre = list("Andres")
numeros = list([1, 2, 3, 4])
print(nombre, numeros)

frase = "Tengo muchas ideas".split()
print(frase)
comidas = "pizza,lasagna,hamburguesa".split(",")
print(comidas)

deportes = ["Artes Marciales", "Tennis", "Futbol", "Golf"]
catalogo = "...".join(deportes)
print(catalogo)

print("Tennis esta en la posicion: ", catalogo.index("Tennis"))
print(catalogo[9])
print(catalogo[-1])


# Del
print("DEL")
print(catalogo)
del catalogo

# print(catalogo) ya eliminado
print(deportes)
del deportes[2]
# Las Cadenas "Strings" son Inmutables por lo tanto no se puede borrar un Caracter de una cadena con Del.

# insert
lista_insert = ["uno", "dos", "tres", "cuatro"]
print(lista_insert)
lista_insert.insert(0, "Inicio")
print(lista_insert)

# Indice -1 es = al ultimo elemento de la lista

# Enlazar listas
lista = [1, 2, 3, 4, 5]
print(lista)
lista += [6, 7, 8, 9]
print(lista)
# Numeros consecutivos
lista += 5*[0]
print(lista)

# Exclusión de elementos
lista = ["aaa", "bbb", "ccc", "ddd", "eee", "fff"]
print(lista)
del(lista[::2])
print(lista)
# Ordenado
lista.reverse()
# lista.sort()
print(lista)
# Listar la cantidad presente de un String
lista += ["Ana", "Ana"]
print(lista.count("Ana"))
print(lista)
print(lista.index("Ana"))

palabra = "Esta es palabra"
lista = palabra.replace("pa", "ÑE")
print(lista)
lista = palabra.replace(" ", "*")
print(lista)
