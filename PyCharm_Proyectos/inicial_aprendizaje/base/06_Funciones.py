# Ejemplos de usos de Funciones


def retorno_mayuscula(palabra):
    return palabra


palabrita = "mi palabrita".upper()
print(retorno_mayuscula(palabrita))


# Parametros DEFAULT
def login(usuario="admin", contrasenna="admin123"):
    print("El usuario es: %s" % usuario)
    print("La contraseña es: %s" % contrasenna)


login("Mr.Andres")
