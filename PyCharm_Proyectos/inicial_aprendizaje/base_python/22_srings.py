"""
Concatenado Para Strings

Marcadores por tipo de Datos: %i %f %s

"""
# coding: utf-8

num_int = 5
num_dec = 7.3
val_str = "Cualquier Texto"

print("El valor de: ", num_int)
print("El valor de: %i" % num_int)
print("El valor de: " + str(num_int))  # Cast


print("Concatenando Decimal", num_dec)
print("Concatenando Decimal %.10f" % num_dec)
print("Concatenando Decimal %f" % num_dec)
print("Concatenando Decimal " + str(num_dec))  # Cast

usuario = input("USUARIO: ")
contrasenna = input("CONTRASEÑA: ")
print("LO QUE EL USUARIO INGRESO FUE USUARIO: %s CONTRASEÑA: %s" % (usuario, contrasenna))


#  Repetir caracteres
print(10*'-')
