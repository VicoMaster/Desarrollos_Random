# coding: utf-8
# Uso de Tuplas
# Lo que hace a una Tupla una Tupla es la Coma, no el parentesis
# Una tupla representa lo que compone un objeto,persona o cosa.
# Es un conjunto ordenado e inmutable de elementos del mismo o diferente tipo.
# Si el elemento de la tupla es modificable internamente "listas" pueden ser modificadas como tal.


tupla_1 = (1, 2, 3, 4)
print(tupla_1)
tupla_2 = 1, 2, 3, 4
print(tupla_2)
tupla_3 = [(1, 2, 3, 4), (5, 6, 7, 8)]
print(tupla_3)
tupla_4 = (1, 2, 3, 4), (5, 6, 7, 8)
print(tupla_4)

# Crear una lista de tuplas
lista_tupla = [("Andres", "Rivera"), ("Maria", "Rojas")]
# Recorrer tupla y seleccionar datos para crear nombre y apellido
for e, i in lista_tupla:
    print("Nombre Completo: ", e, i)

nombres_completos = {n: a for n, a in lista_tupla}
print(nombres_completos)
# Enumerar elementos de la Tupla
lista_tuplas = list(enumerate(lista_tupla))
print(lista_tuplas)
print(type(lista_tuplas[0]))

# los elementos Mutables dentro de una Tupla si pueden ser modificados
lista_almuerzos = [("Almuerzo Uno", "Carne de res", "Patatas", "Fruta", 9000, ["flan", "galletas"]),
                   ("Almuerzo Dos", "Pollo", "Verduras", "Sopa", 7500, ["Fresas y Crema", "Chocolate"]),
                   ("Almuerzo Tres", "Quinua", "Aguacate", "Fruta", 10000, ["pastel", 3000])]
# Remplazo un Dato mutable de la lista de Tuplas
print(lista_almuerzos[0])
lista_almuerzos[0][5][1] = "Leche Asada"
print(lista_almuerzos[0])
# Puedo imprimir un dato de la Tupla, pero no puedo modificar el index de la tupla
print(lista_almuerzos[0][0])
print(lista_almuerzos[0])

# Creo un Diccionario rescatando los datos de la Primera Tupla
contenido = lista_almuerzos[0]
nombre_almuerzo = contenido[0]
tamanno_contenido = len(contenido)
print(contenido)
descripcion_almuerzo = [c for c in contenido[1:]]
almuerzo_1 = {nombre_almuerzo: descripcion_almuerzo}
print("Este es el Almuerzo 1: ", almuerzo_1)

# podre eliminar la tupla?
del lista_almuerzos
