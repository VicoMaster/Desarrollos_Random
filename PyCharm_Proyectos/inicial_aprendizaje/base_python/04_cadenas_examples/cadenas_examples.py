# coding: utf-8
# Ejemplos de Usos en Cadenas Python
print("CARACTERES DE ESCAPE")
frase = "Ella me dijo Hola"
print(frase)
frase = "Ella me dijo,\nHola"
print(frase)
frase = "Ella me dijo \"HOLA!\""
print(frase)
frase = 'Ella me dijo "Hola!"'
print(frase)

# Concatenar
emocion = "Y me emocione"
print(frase+" "+emocion)
# Repetir Cadenas
print((emocion+" ")*3)
# Encontrar
mensaje5 = "Hola Mundo"
mensaje5a = mensaje5.find("Mundo")
print(mensaje5a)
# Tamaño
mensaje4 = 'hola' + ' ' + 'mundo'
print(len(mensaje4))
# Remplazar
mensaje8 = "HOLA MUNDO"
mensaje8a = mensaje8.replace("L", "pizza")
print(mensaje8a)
# Funciones en Strings
print("esta palabra sera mayuscula".upper())
