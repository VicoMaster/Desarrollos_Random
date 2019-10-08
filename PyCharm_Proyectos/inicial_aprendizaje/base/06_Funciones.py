# coding: utf-8
# Ejemplos de usos de Funciones


def retorno_mayuscula(palabra):
    return palabra


palabrita = "mi palabrita".upper()
print(retorno_mayuscula(palabrita))


# Parametros DEFAULT
def login(usuario="admin", contrasenna="admin123", edad=30, sexo=True):
    print("El usuario es: %s" % usuario)
    print("La contraseña es: %s" % contrasenna)
    print("Con edad: %s" % edad)
    print("Del Sexo: "+(lambda: "Femenino", lambda: "Masculino")[sexo]())  # el true va al final en lambda


print("DEFAULT:")
login()
print("ARGUMENTOS NOMBRADOS")
login(usuario="Don Andres", contrasenna="VicMan", edad=24, sexo=False)

""" 
FUNCIONES VARIADICAS 
*args = lista
**kwargs = diccionario <- argumentos nombrados "clave y valor "
Argumentos posicionales y nominales
Primero los posicionales luego los nominales como regla del lenguaje.
"""
print("***** SEPARADOR ******")


def lista_de_argumentos(*args):
    print(args)


def lista_de_argumentos_asociativos(**kwargs):
    print(kwargs)


def lista_diccionario(*args, **kwargs):
    print("Lista ", args)
    print("Diccionario: ", kwargs)


lista_de_argumentos(1, 2, 3, 4, 5)
lista_de_argumentos_asociativos(a=1, b=1, c=1, d=1, e=1)
lista_diccionario("uno", "dos", "tres", "cuatro", a=4, b=3, c=2, d=1)


# Funciones anidadas
def funcion_uno():
    print("ESTA ES LA FUNCION 1")

    def funcion_dos():
        print("ESTA ES LA FUNCION 2 ANIDADA")
    funcion_dos()


funcion_uno()
