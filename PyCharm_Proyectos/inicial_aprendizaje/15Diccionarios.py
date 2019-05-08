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


# Creando Diccionarios por Comprension
print("Creando Diccionarios por Comprension")
# Sintaxis: dict(<clave>, <valor> for <elemento> in <iterable>)
nuevo_dict = dict((x, x * x) for x in (1, 2, 3, 4))
print(nuevo_dict)  # Se crea un Diccionario donde las claves son los iterables y los valores son sus cuadrados
