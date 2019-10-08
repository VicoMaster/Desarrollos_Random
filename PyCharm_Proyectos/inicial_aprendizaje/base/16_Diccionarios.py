# coding: utf-8
# Diccionarios
"""
A los Diccionarios no les importa el orden
"""
diccionario = {
    "Andres": "Desarrollador(a)",
    "Nestor": "Diseñador(a)",
    "Pedro": "Administrador(a)",
    "Nathaly": "Contador(a)",
    "Diego": "Abogado(a)"
    }
print(diccionario)
print(diccionario["Nathaly"])
print(diccionario["Andres"])
diccionario["Alejandra"] = "Biologo(a)"
print(diccionario)

# Crear Diccionario con Funcion
diccionario_2 = dict(
    [
        ('Desarrollador(a)', 8000),
        ('Diseñador(a)', 6000),
        ('Administrador(a)', 5000),
        ('contador(a)', 5000),
        ('Abogado(a)', 5000),
        ('Biologo(a)', 4000)
    ]
)
print(diccionario_2)
# Crear Diccionario apartir de Listas
lista_1 = ["Galletas", "Pollo frito", "Helado"]
lista_2 = ["Harina", "Gallo", "Leche"]
diccionario_3 = (dict(zip(lista_1, lista_2)))
print("Diccionario Unido de Listas:", diccionario_3)

dias_semana = {"Lunes": 1, "Martes": 2, "Miercoles": 3, "Jueves": 4, "Viernes": 5, "Sabado": 6, "Domingo": 7}
print(dias_semana)
del dias_semana["Domingo"]
print(dias_semana)
dias_semana.update({"Sabadito": 6, "Dominguito": 7})
print(dias_semana)
dias_semana["eliminar"] = dias_semana.pop("Sabado")  # Eliminar Clave especifica creando una nueva con el mismo valor
"""
Lo anterior es para eliminar una clave agregando otra con su valor, las claves no necesitan ser modificadas,
los diccionarios no guardan un orden en especifico, por lo tanto lo importante es guardar el dato [clave:valor] correcto
"""
dias_semana.update({"Sabadito": "Seis", "Dominguito": "Siete"})
print(dias_semana)

# Iterar, recorrer Diccionarios
print("\nIteraciones en Diccionarios\n")
colores_frutas = {"Manzana": "Roja", "Pera": "Verde", "Moras": "Morado", "Naranja": "Naranja"}
for frutas in colores_frutas:  # Puede utilizarse el metodo .key para optener la key
    print("Las frutas son: ", frutas)

for colores in colores_frutas.values():
    print("Los colores son: ", colores)

for tuplas in colores_frutas.items():
    print("Tuplas o Clave:Valor: ", tuplas)

# Creando Diccionarios por Comprension
print("Creando Diccionarios por Comprension")
# Sintaxis: dict(<clave>, <valor> for <elemento> in <iterable>)
nuevo_dict = dict((x, x * x) for x in (1, 2, 3, 4))
print(nuevo_dict)  # Se crea un Diccionario donde las claves son los iterables y los valores son sus cuadrados

# Creando un Diccionario a partir de Listas con Bucle For
# Se crean usando Listas de Tuplas
lista = [('hola', 'python'), ('Una', 'Tupla')]  # Lista
diccionario = {k: v for k, v in lista}  # Creando diccionario a partir de lista
print(diccionario)
print(type(lista[0]))
for k, v in lista:  # Por cada elemento dentro de la tupla una letra sera asignada en el for
    print("Esto es V:", v)

# Las llaves pueden ser cualquier tipo de datos NO iterable
"""
fromkeys()
dic = dict.fromkeys(['a','b','c','d'],1)
dic →  {‘a’ : 1, ’b’ : 1, ‘c’ : 1 , ‘d’ : 1}
"""
