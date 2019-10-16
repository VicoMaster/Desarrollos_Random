# coding: utf-8
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


# Parametros DEFAULT con IF corto o Ternary Operator
def login(usuario="admin", contrasenna="admin123", edads=30, sexo=True):
    print("El usuario es: %s" % usuario)
    print("La contraseña es: %s" % contrasenna)
    print("Con edad: %s" % edads)
    print("Del Sexo: "+{True: "Masculino", False: "Femenino"}[sexo])


login()
"""
* Simple Method to use ternary operator:

# Program to demonstrate conditional operator 
a, b = 10, 20
  
# Copy value of a in min if a < b else copy b 
min = a if a < b else b 

* Direct Method by using tuples, Dictionary and lambda
# Python program to demonstrate ternary operator 
a, b = 10, 20
  
# Use tuple for selecting an item 
print( (b, a) [a < b] ) 
  
# Use Dictionary for selecting an item 
print({True: a, False: b} [a < b]) 
  
# lamda is more efficient than above two methods 
# because in lambda  we are assure that 
# only one expression will be evaluated unlike in 
# tuple and Dictionary 
print((lambda: b, lambda: a)[a < b]()) 

Ternary operator can be written as nested if-else:

# Python program to demonstrate nested ternary operator 
a, b = 10, 20
  
print ("Both a and b are equal" if a == b else "a is greater than b"
        if a > b else "b is greater than a") 
"""