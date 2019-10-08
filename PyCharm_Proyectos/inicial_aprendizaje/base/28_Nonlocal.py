# coding: utf-8
# Funciones anidadas


def funcion_uno():
    print("ESTA ES LA FUNCION 1")
    variable1 = "VARIABLE 1 NO ES GLOBAL"

    def funcion_dos():
        nonlocal variable1
        print("ESTA ES LA FUNCION 2 ANIDADA")
        print("Variable nonlocal: %s" % variable1)
        variable1 = "REFORMADA EN FUNCION INTERNA"
    funcion_dos()
    print(variable1)


funcion_uno()
