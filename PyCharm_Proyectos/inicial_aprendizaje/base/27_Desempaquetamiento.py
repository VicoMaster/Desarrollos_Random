# Desenpaquetamiento en Python
# coding: utf-8

lista = [1, 3, 4, 5, 6, "nada"]


def desempaquetamiento(var1, var2, var3, var4, *args):
    print("Variables: %i" % var1, var2, var3, var4)  # En parametros
    print(args)  # Argumentos sobrantes


def desempaquetamiento_dict(clave1, clave2, clave3, clav4=None, **kwargs):
    print("Variables posicionales: %s" % clave1, clave2, clave3, clav4)
    print(kwargs)


print("DESEMPACANDO LISTA: ")
desempaquetamiento(*lista)
print("DESEMPACANDO DICCIONARIO: ")
diccionario = {
    "clave1": 10,
    "clave2": 20,
    "clave3": 30,
    "clave4": 40,
    "clave5": "Fuera de Rango"
}
# Se hace un pasado de argumentos nominales por desempaquetado
desempaquetamiento_dict(**diccionario)

# Desempaquetado formando un diccionario
print("REFORMANDO Y DESEMPAQUETANDO ***")
desempaquetamiento_dict(**dict(zip(("clave1", "clave2", "clave3", "clav4", "5", "6"), lista)))
