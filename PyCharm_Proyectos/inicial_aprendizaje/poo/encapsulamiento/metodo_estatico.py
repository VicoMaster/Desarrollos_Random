# coding: utf-8
"""
Sirva para Poder acceder a los mismos desde cualquier instancia o a travez del objeto clase
Es otra manera de agrupar metodos

Funcion builtins: staticmethod()

func = staticmethod(func)

decorator: @staticmethod


"""


class MetodoEstatico:

    @staticmethod
    def func1():
        print("func1()")

    @staticmethod
    def func2(x, y):
        print("Funcion '{}' invocada."
              "\nParametros=({}, {})".format("func2", x, y))

    @staticmethod
    def func3(a, b, c):
        info = """
        Nombre de la funcion: {nombre}
        Cantidad de argumentos: {cantidad}
        Argumento: {argumento}
        """
        info = info.format(
            nombre=MetodoEstatico.func3.__name__,
            cantidad=MetodoEstatico.func3.__code__.co_argcount,
            argumento=MetodoEstatico.func3.__code__.co_varnames
        )
        print(info, a, b, c)

    # func1 = staticmethod(func1)
    # func2 = staticmethod(func2)
    # func3 = staticmethod(func3)


me = MetodoEstatico()
me.func1()
me.func2(100, 200)
me.func3(5, 10, 15)
