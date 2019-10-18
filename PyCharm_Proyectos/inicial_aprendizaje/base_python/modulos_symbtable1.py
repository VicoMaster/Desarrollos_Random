# coding: utf-8
# Funciones y variables para importar en otro modulo "archive"

# Simbolos publicos obligatoriamente el nombre de la variable publica debe ser __all__
__all__ = ["nombre",
           "_nombre",
           "contador",
           "aa",
           "bb",
           "ab",
           "ba",
           "funcion_modular"
           ]

nombre = "Modulo Personalizado"
contador = 0
_nombre = "privado"

aa = 0
bb = 1
ab = 2
ba = 3

print("Modulo ejecutado solo por Importarse")


def funcion_modular(*args):
    print("ENTRO AL MODULO IMPORTADO!!! \n", args)


def funcion_privada():
    pass


variable_privada = "privado"
