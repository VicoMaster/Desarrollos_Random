# coding: utf-8
# Tipos de Datos en Python
string = "Hola Mundo"
print("Esto es una Cadena: ", type(string))
punto_flotante = 9.5
print(type(punto_flotante))
print("Esto es de Tipo Punto Flotante o Float", punto_flotante)
entero = 5
print("Tipo Entero: ", type(entero))
"""
Las Variables pueden cambiar de tipo sin ningun tipo de aviso o declaracion,
Como si ocurre en otros lenguajes, como Java
"""
print("SOBRE ESCRITURA DE VARIABLE EN VARIOS TIPOS")
variable_numerica = None
print("El tipo de la Variable es: ", type(variable_numerica))
variable_numerica = "Hello World"
print("El tipo de la Variable es: ", type(variable_numerica))
variable_numerica = 9
print("El tipo de la Variable es: ", type(variable_numerica))
variable_numerica = 9.6
print("El tipo de la Variable es: ", type(variable_numerica))
variable_numerica = True
print("El tipo de la Variable es: ", type(variable_numerica))

