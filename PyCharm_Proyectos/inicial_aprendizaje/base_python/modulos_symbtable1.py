# coding: utf-8
# Funciones y variables para importar en otro modulo "archive"

nombre = "Modulo Personalizado"
contador = 0

print("Modulo ejecutado solo por Importarse")


def funcion_modular(*args):
    print("ENTRO AL MODULO IMPORTADO!!! \n", args)
