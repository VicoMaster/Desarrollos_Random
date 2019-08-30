# Diferentes Condiciones en Python
edad = 25
if (edad >= 18) and (edad < 60):
    print("Puedes Pasar...")
    #  quiebre de linea, delimitador en python
    print("hola")
elif edad < 18:
    print("Eres muy pequeño para tomar...")
else:
    if edad >= 60:
        print("Bueno tu si, pero poco o te vas...")

"""
CONDICIONES
x != y     # x no es igual a y
x > y      # x es mayor que y
x < y      # x es menor que y
x >= y     # x es mayor o igual que y
x <= y     # x es menor o igual que y
and        # Y
or         # o
not        # Negacion
"""

"""
OPERADORES LOGICOS
and   -> (y)
or    -> (o)
not   -> (negación)
is    -> (es)
is not -> (no es)
in    -> (contenido)
not in -> (no contenido)
"""
# Negacion
boleano = False
if not boleano:
    print("Esto es Correctisimo")
